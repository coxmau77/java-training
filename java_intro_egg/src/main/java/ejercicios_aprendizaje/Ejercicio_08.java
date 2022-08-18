
package ejercicios_aprendizaje;

import java.util.Scanner;

public class Ejercicio_08 {
    public static void main(String[] args) {
        //Realizar un programa que permita introducir solo frases o palabras de 8 de largo. 
        //Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un 
        //mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
        //Nota: investigar la función Lenght() en Java.
        Scanner reed = new Scanner(System.in);
        System.out.println("Ingrese frases o palabras de hasta 8 caracteres de largo");
        String frase = reed.nextLine();
        int limit = 8;
        
        if(frase.length() > limit){
            System.out.println("INCORRECTO");
        }else{
            System.out.println("CORRECTO");
        }
    }
}
