package figurasGeometricas;
import java.util.Scanner;

public class ejecucion {

    public static void main(String[]args){

       

        try (Scanner Scan = new Scanner(System.in)) {
       
            int eleccion;
            

            System.out.println(" Figura 1: Pentagono --- Figura 2: Heptagono --- Figura 3: Circulo ");
            System.out.println(" 1 si desea ir a la figura 1 --- 2 si desea ir a la figura 2 --- 3 si desea ir a la figura 3 ");


            eleccion = Scan.nextInt();
        switch (eleccion) {
            case 1:

            Pentagono pentagono = new Pentagono();

            pentagono.setLados(10);

            pentagono.registrarPerimetro();

            pentagono.getPerimetro();

            pentagono.setApotema(10);

            pentagono.registrarArea();

            pentagono.getArea();
                
                break;

                case 2:

                Heptagono heptagono = new Heptagono();

                heptagono.setLados(10);
    
                heptagono.registrarPerimetro();
    
                heptagono.getPerimetro();
    
                heptagono.setApotema(10);
    
                heptagono.registrarArea();
    
                heptagono.getArea();

                break;

                case 3:

                break;
        
            default:
                break;
        }

         


        }

    }
    
}
