package ejercicios_aprendizaje;

import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args) {
//      Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
        Scanner reed = new Scanner(System.in);
        
        String myName;
        System.out.println("Ingrese su nombre");
        myName = reed.nextLine();
        
        System.out.println("Hola "+myName+" ¿Cómo estás?");
    }
}
