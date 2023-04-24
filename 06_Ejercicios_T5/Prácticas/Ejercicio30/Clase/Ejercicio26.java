package ejercicio26;
import daw.geometria.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.List;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean continua = true;
        ArrayList<FiguraGeométrica> l1 = new ArrayList<>();
        
        while(continua){
            System.out.println("1) Añadir un rectángulo"
                    + "\n2) Añadir un cuadrado"
                    + "\n3) Añadir un círculo"
                    + "\n4) Añadir un triángulo"
                    + "\n5) Dibujar todo");
            
            System.out.println("Introduce un numero: ");
            int n = new Scanner(System.in).nextInt();
            
            if(n >= 1 && n <=5) {
                switch(n) {
                    case 1:
                        Point p1 = new Point(0,5);
                        Point p2 = new Point(0,10);
                        Color c1 = new Color(0, 0, 0);
                        Rectangulo r = new Rectangulo(p1, p2, c1);
                        l1.add(r);
                        break;
                    case 2:
                        Point p3 = new Point(0,5);
                        Color c2 = new Color(0, 0, 5);
                        Cuadrado c = new Cuadrado
                        (p3, 5, c2);
                        l1.add(c);
                        break;
                    case 3:
                        Point p4 = new Point(0,5);
                        Color c3 = new Color(0, 0, 10);
                        Circulo cir = new Circulo(p4,5, c3);
                        l1.add(cir);
                        break;
                    case 4:
                        Point p5 = new Point(0,5);
                        Point p6 = new Point(0,15);
                        Point p7 = new Point(0,25);
                        Triángulo t = new Triángulo(p5, p6, p7);
                        l1.add(t);
                        break;
                    case 5:
                        System.out.println("Donde lo quieres dibujar? "
                            + "PDF o ConsolaDAW");
                        String lugar = new Scanner(System.in). nextLine();
                        for (int i = 0; i < l1.size(); i++) {
                            try{
                            Thread.sleep(3000);
                            }catch(InterruptedException e){}
                            System.out.println("Dibujo numero "
                                    +(i+1)+ " terminado");
                        }
                        System.out.println("Dibujos terminados");
                        break;
                } 
            }
        }
    }

}
