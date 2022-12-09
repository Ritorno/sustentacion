package figurasGeometricas;
import java.util.Scanner;

public class Heptagono {

    

    private double lados;

    private double perimetro;

    private double apotema;

    private double area;



    public void Heptagono(){



    }
    public void Heptagono(double lados,double perimetro, double apotema, double area){

        this.lados=lados;
        this.perimetro=perimetro;
        this.apotema=apotema;

    }

    Scanner Scan = new Scanner(System.in); 

    public void registrarPerimetro(){

        System.out.println(" ingrese el valor de un lado del Heptagono: ");
        lados = Scan.nextDouble(); 

        perimetro = lados * 7;

        System.out.println(" el valor del perimetro es de; " + perimetro );

        
    }

    public void registrarArea(){

        System.out.println(" ingrese el valor de la apotema del Heptagono: ");

        apotema = Scan.nextDouble();

        area = (apotema * perimetro)/2;

        System.out.println(" el valor del area es de: " + area );
        
    }


    












    /**
     * @return double return the lados
     */
    public double getLados() {
        return lados;
    }

    /**
     * @param lados the lados to set
     */
    public void setLados(double lados) {
        this.lados = lados;
    }

    /**
     * @return double return the perimetro
     */
    public double getPerimetro() {
        return perimetro;
    }

    /**
     * @param perimetro the perimetro to set
     */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    /**
     * @return double return the apotema
     */
    public double getApotema() {
        return apotema;
    }

    /**
     * @param apotema the apotema to set
     */
    public void setApotema(double apotema) {
        this.apotema = apotema;
    }


    /**
     * @return double return the area
     */
    public double getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(double area) {
        this.area = area;
    }

}
