package Salud;
import java.util.Scanner;

public class Empleado extends Persona {

    private String Cargo;
    private int valorHora;
    private int horasTrabajadas;
    private String Departamento;


    public String getCargo() {
        return Cargo;
    }
    public void setCargo(String cargo) {
        Cargo = cargo;
    }
    public int getValorHora() {
        return valorHora;
    }
    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    public String getDepartamento() {
        return Departamento;
    }
    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }

    public  Empleado(){


    }

    public Empleado(String tipoDocumento, int Documento, String Nombres, String Apellidos, String Cargo, int valorHora, int horasTrabajadas, String Departamento ){

        super(tipoDocumento,Documento,Nombres,Apellidos,Cargo,valorHora,horasTrabajadas,Departamento);

        this.Cargo=Cargo;
        this.valorHora=valorHora;
        this.horasTrabajadas=horasTrabajadas;
        this.Departamento=Departamento;


    }

    public void mostrarDatos(){

        System.out.println(" Tipo de documento: " + getTipoDocumento() + " Numero de Documento: " + getDocumento() + "  Nombres: " + getNombres() + " Apellidos " + getApellidos());

    }

    public void calcularHonorarios(){

        try (Scanner Scan = new Scanner(System.in)) {

        System.out.println(" Ingrese los siguientes datos: ");

        System.out.println(" Su Cargo: ");
        Cargo = Scan.nextLine();
        System.out.println(" el valor por hora: ");
        valorHora = Scan.nextInt();
        System.out.println(" las horas trabajadas: ");
        horasTrabajadas = Scan.nextInt();
        System.out.println(" el departamento: ");
        Departamento = Scan.nextLine();

        double Total;

        Total = (valorHora * horasTrabajadas) / 0.96;

        System.out.println(" el total de los honorarios es de: " + Total);
    }

    

    }

     
}
