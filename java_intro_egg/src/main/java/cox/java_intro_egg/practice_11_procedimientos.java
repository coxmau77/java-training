
package cox.java_intro_egg;
import java.util.Scanner;

public class practice_11_procedimientos {
    
    public static void main(String[] args) {
        
        //EJERCICIO 12
        //Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
        //validando que el primer numero múltiplo del segundo y e imprima si el primer numero 
        //es múltiplo del segundo, sino informe que no lo son.
        
        Scanner reed = new Scanner(System.in);
        double numberA, numberB;
        
        System.out.println("Ingrese el primer número");
        numberA = reed.nextInt();
        System.out.println("Ingrese el psegundo número");
        numberB = reed.nextInt();

        esMultiplo(numberA,numberB);
    }
    
    public static void esMultiplo(double numberA,double numberB){
        
        if (numberA % numberB == 0){
            System.out.println("El número "+numberA+" es múltiplo de "+numberB);
        }else{
            System.out.println("Los números "+numberA+" y "+numberB+" no son múltiplos");
        }
    }
}
