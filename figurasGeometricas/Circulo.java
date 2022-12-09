package figurasGeometricas;
import java.util.Scanner;



public class Circulo {
    
    private double radio;
    
    private double pi = 3,1415;
    

    public class Circulo(){
        
        
    }
    
    public class Circulo(double radio, double pi){
        
        this.radio=radio;
        this.pi=pi;
        
    }
    
    Scanner Scan = new Scanner(System.in)
    
    public void registrarPerimetro(){
        
        System.out.println(" ingrese el valor del radio ");
        
        radio = Scan.nextDouble;
        
        double perimetro;
        
        perimetro = (pi * radio)*2;
        
        System.out.println(" el valor del perímetro es: " + perimetro);
        
    }
    
    public void registrarArea(){
        
        double area;
        
        area = pi * (math.Pow(radio,2));
        
        System.out.println(" el valor del area es: " + area);
        
    }
    
    
}

