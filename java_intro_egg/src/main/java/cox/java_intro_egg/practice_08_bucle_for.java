
package cox.java_intro_egg;
import java.util.Scanner;

public class practice_08_bucle_for {
    public static void main(String[] args) {
        
        Scanner reed = new Scanner(System.in);
        
//        int limit = 10;
//        
//        for(int i = 0; i < limit; i++){
//            System.out.println("Incremento de i++ = "+i+" hasta "+limit);
//        }
//        System.out.println("- - - - - - - - - - - - - - - ");
//        for(int i = 0; i < limit; i++){
//            System.out.println("Incremento de i++ = "+(i+1)+" hasta "+limit);
//        }
//        System.out.println("- - - - - - - - - - - - - - - ");
//        for(int i = limit; i > 0; i--){
//            System.out.println("Incremento de i++ = "+(i)+" hasta "+limit);
//        }
        
        //EJERCICIO 10
        //Realizar un programa que lea 4 números (comprendidos entre 1 y 20) 
        //e imprima el número ingresado seguido de tantos asteriscos como indique su valor. 
        //Por ejemplo:
        //5 *****
        //3 ***
        //11 *********** 
        //2 **
        int numeroA,numeroB,numeroC,numeroD;
        int limite = 4;
        int minimo = 1;
        int maximo = 20;
        int contador = 0;
             
        System.out.println("Ingrese un numero entre "+minimo+" y "+maximo);
        numeroA = reed.nextInt();
        
        System.out.println("Ingrese un numero entre "+minimo+" y "+maximo);
        numeroB = reed.nextInt();
        
        System.out.println("Ingrese un numero entre "+minimo+" y "+maximo);
        numeroC = reed.nextInt();
        
        System.out.println("Ingrese un numero entre "+minimo+" y "+maximo);
        numeroD = reed.nextInt();
        
        System.out.print(numeroA+" ");
        for(int i = 0; i < numeroA; i++){
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print(numeroB+" ");
        for(int i = 0; i < numeroB; i++){
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print(numeroC+" ");
        for(int i = 0; i < numeroC; i++){
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print(numeroD+" ");
        for(int i = 0; i < numeroD; i++){
            System.out.print("*");
        }
    }
}
