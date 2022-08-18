
package ejercicios_aprendizaje;
import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) {
//        Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
//        El programa deberá después mostrar el resultado de la suma
        
        Scanner reed = new Scanner(System.in);
        int numberA;
        int numberB;
        
        
        System.out.println("Ingrese el primero numero entero");
        numberA = reed.nextInt();
        System.out.println("Ingrese el segundo numero entero");
        numberB = reed.nextInt();
        int resultado = numberA + numberB;
        System.out.println("El resultado de la suma de "+numberA+" + "+numberB+" es = "+resultado);
       
    }
}
