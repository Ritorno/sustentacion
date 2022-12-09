package Salud;
import java.util.Scanner;

public class Persona {

    private String tipoDocumento;
    private int Documento;
    private String Nombres;
    private String Apellidos;
    private double peso;
    private double estatura;
    private int edad;
    private String sexo;
    


    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getTipoDocumento() {
        return tipoDocumento;
    }
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    public int getDocumento() {
        return Documento;
    }
    public void setDocumento(int documento) {
        Documento = documento;
    }
    public String getNombres() {
        return Nombres;
    }
    public void setNombres(String nombres) {
        Nombres = nombres;
    }
    public String getApellidos() {
        return Apellidos;
    }
    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }


    public  Persona(){

    }

    public void Persona(String tipoDocumento, int Documento, String Nombres, String Apellidos){

        this.tipoDocumento=tipoDocumento;
        this.Documento=Documento;
        this.Nombres=Nombres;
        this.Apellidos=Apellidos;

    }

    public void pedirDatos(){

        try (Scanner Scan = new Scanner(System.in)) {

            System.out.println(" Ingrese los siguientes datos a continuacion: ");

            System.out.println(" Tipo de documento: ");
            tipoDocumento = Scan.nextLine();
            System.out.println(" Numero de documento: ");
            Documento = Scan.nextInt();
            System.out.println(" Nombre: ");
            Nombres = Scan.nextLine();
            System.out.println(" Apellido: ");
            Apellidos = Scan.next();
            System.out.println(" Peso ");
            peso = Scan.nextDouble();
            System.out.println(" Estatura ");
            estatura = Scan.nextDouble();
            System.out.println(" Edad ");
            edad = Scan.nextInt();
            System.out.println(" Sexo ");
            sexo = Scan.next();
            


            System.out.println(" ==================================== ");

            
        } 

  

    }
    public void datosPersona(){

        System.out.println(" Los datos ingresados son los siguientes: ");
        System.out.println(" Tipo de documento: " + tipoDocumento + " Numero de Documento: " + Documento + "  Nombres: " + Nombres + " Apellidos " + Apellidos + " Peso " + peso + " Estatura " + estatura + " Edad " + edad + " Sexo " + sexo );


    }

   
    public void calcularLmc(){

        double pesoActual;

        pesoActual = peso / (estatura = Math.pow(estatura, 2) );

        if (pesoActual<20) {

            System.out.println(" El peso esta por debajo de lo ideal ");
            
        }else if (pesoActual==20 && pesoActual==25){

            System.out.println(" El peso es el ideal ");

        }else {

            System.out.println(" El peso esta por encima de lo ideal ");
            System.out.println(" ⚠⚠Sobre peso detectado⚠⚠ ");

        } 

        if (edad>=18) {

            System.out.println(" El usuario es mayor de edad ");
            
        }else {

            System.out.println(" El usuario es menor de edad ");

        }


    }

    
}
