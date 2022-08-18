
package cox.java_intro_egg;
import java.util.Scanner;
public class practice_05_operadores_bifurcacion_condicionales {
    public static void main(String[] args) {
        
        Scanner reed = new Scanner(System.in);
        
        //Condicional en java
        boolean condicion = false;
        
        if(condicion) {
            //código ...
        }else if(condicion){
            //código ...
        }else{
            //código ...
        }
        
//        EJERCICIO 6
//        Implementar un programa que le pida dos números enteros a usuario y determine si ambos o alguno de ellos es mayor a 25.
        int highNumber = 25;
        
        System.out.println("Ingrese un numero entero");
        int numberA = reed.nextInt();
        
        System.out.println("Ingrese un numero entero");
        int numberB = reed.nextInt();
        
        if (numberA > highNumber || numberB > highNumber){
            System.out.println("Uno de los números es mayor a "+highNumber);
        }
        
        if(numberA > highNumber){
            System.out.println("El numero mayor es A: "+numberA);
        }else{
            System.out.println("El numero mayor es B: "+numberB);
        }
    }
}
