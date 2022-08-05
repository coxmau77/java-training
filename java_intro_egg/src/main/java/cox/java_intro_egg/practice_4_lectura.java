
package cox.java_intro_egg;
//La importación de clases se hacen debajo de la sentencia package.
import java.util.Scanner;

public class practice_4_lectura {
    public static void main(String[] args) {
        
        Scanner reed = new Scanner(System.in);
        
        System.out.println("Ingrese su edad");
        byte age = reed.nextByte();
               
        System.out.println("Ingrese su nombre");
        String name = reed.next();
        
        System.out.println("Ingrese monto a cobrar");
        double amount = reed.nextDouble();
        
         System.out.println("Hola "+name+" tu Edad ingresada es "+age+", el monto a cobrar es $"+amount);
    }
}
