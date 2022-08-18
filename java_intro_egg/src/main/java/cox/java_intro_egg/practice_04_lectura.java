
package cox.java_intro_egg;
//La importación de clases se hacen debajo de la sentencia package.
import java.util.Scanner;

public class practice_04_lectura {
    public static void main(String[] args) {
        
        Scanner reed = new Scanner(System.in);
//        
//        System.out.println("Ingrese su edad");
//        byte age = reed.nextByte();
//               
//        System.out.println("Ingrese su nombre");
//        String name = reed.next();
//        
//        System.out.println("Ingrese monto a cobrar");
//        double amount = reed.nextDouble();
//        
//         System.out.println("Hola "+name+" tu Edad ingresada es "+age+", el monto a cobrar es $"+amount);
         
        //         EJERCICIO 5
        //Define una variable de tipo boolean, double y char. Guarda información en ellas a través del Scanner.
        
        System.out.println("Ingrese un valor booleano");//true or false
        boolean access;         
        
        
        int opcion1 = reed.nextInt();
        int opcion2 = reed.nextInt();
        access = opcion1 == opcion2;
        System.out.println();
        
        
        System.out.println("Ingrese un valor double");
        double price = reed.nextDouble();
        System.out.println("Double: "+price);
        
        System.out.println("Ingrese una letra");
        char letter = reed.next().charAt(0);
        System.out.println("Char: "+letter);

        //DETECCIÓN DE ERRORES
        //Arreglar la siguiente porción de codigo.
        //public static void main(String[] args) { 
            //Scanner leer = new Scanner(); 
            //System.out.println("Ingresa tu edad");
            //int edad = leer.next();
            //System.out.println("Ingresa tu nombre");
            //String nombre = leer.nextLine();
        //}
        
        
        
    }
}
