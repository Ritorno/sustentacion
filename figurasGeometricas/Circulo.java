package figurasGeometricas;
import java.util.Scanner;

public class Circulo {

        
        private double radio;
        
        private double pi = 3.1415;
        
    
        public double getRadio() {
            return radio;
        }

        public void setRadio(double radio) {
            this.radio = radio;
        }

        public double getPi() {
            return pi;
        }

        public void setPi(double pi) {
            this.pi = pi;
        }

        public  Circulo(){
            
            
        }
        
        public  Circulo(double radio, double pi){
            
            this.radio=radio;
            this.pi=pi;
            
        }
        
        Scanner Scan = new Scanner(System.in);
        
        public void registrarPerimetro(){
            
            System.out.println(" ingrese el valor del radio ");
            
            radio = Scan.nextDouble();
            
            double perimetro;
            
            perimetro = (pi * radio)*2;
            
            System.out.println(" el valor del perímetro es: " + perimetro);
            
        }
        
        public void registrarArea(){

            
            double area;
            
            area = (radio * radio) * pi;
            
            System.out.println(" el valor del area es: " + area);
            
        }
        
        
    
    
    

    
}
