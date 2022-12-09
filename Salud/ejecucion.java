package Salud;

public class ejecucion {

    
    public static void main(String[]args){

        Persona inicio = new Persona();

        inicio.pedirDatos();

        inicio.datosPersona();

        inicio.calcularLmc();

        inicio.getTipoDocumento();

        inicio.getDocumento();

        inicio.getNombres();

        inicio.getApellidos();

        inicio.getPeso();

        inicio.getEstatura();

        inicio.getEdad();

        inicio.getSexo();


        Empleado empleado = new Empleado(null, 0, null, null, null, 0, 0, null);

        empleado.mostrarDatos();

        empleado.calcularHonorarios();

        empleado.getCargo();

        empleado.getValorHora();

        empleado.getHorasTrabajadas();

        empleado.getDepartamento();

        


    }
    
}
