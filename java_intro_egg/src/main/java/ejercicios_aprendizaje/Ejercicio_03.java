
package ejercicios_aprendizaje;

import java.util.Scanner;

public class Ejercicio_03 {
    public static void main(String[] args) {
        //Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
        //después toda en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
        Scanner reed = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        String txt = reed.nextLine();
        String upperCase = txt.toUpperCase();
        String lowerCase = txt.toLowerCase();
        
        System.out.println("txt en Mayúscula: "+upperCase);
        System.out.println("txt en Minúscula: "+lowerCase);
        
    }
}
