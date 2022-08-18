
package ejercicios_aprendizaje;

import java.util.Scanner;

public class Ejercicio_05 {
    public static void main(String[] args) {
//        Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, 
//        el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
        Scanner reed = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
//        int number = reed.nextInt();
        int number = 3;        
        
        System.out.println(mostrarDoble(number));
        System.out.println(mostrarTriple(number));
        System.out.println(mostrarRaizCuadrada(number));
    }
    
    public static int mostrarDoble(int number){       
        double value = number;
        double resultado = Math.pow(value, 2);
        int result  = (int) resultado;
        return result;
    }
    
    public static int mostrarTriple(int number){
        double value = number;
        double calculo = Math.pow(value, 3);
        int result = (int) calculo;
        return result;        
    }
    
    public static int mostrarRaizCuadrada(int number){
        double num = number;
        double resultado = Math.sqrt(num);
        int result = (int)resultado;
        return result;
    }
}