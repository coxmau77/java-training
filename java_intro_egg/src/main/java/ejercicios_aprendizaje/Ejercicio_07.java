
package ejercicios_aprendizaje;

import java.util.Scanner;

public class Ejercicio_07 {
    public static void main(String[] args) {
//      Crear un programa que pida una frase y si esa frase es igual a “eureka” 
//      el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
//      Nota: investigar la función equals() en Java.
        Scanner reed = new Scanner(System.in);
        System.out.println("Expresa satisfacción o júbilo al descubrir algo que se busca con empeño o se resuelve un problema difícil.");
        String fraseUsuario = reed.nextLine();
        String fraseCorrecta = "eureka";
        
        if(fraseUsuario.equals(fraseCorrecta)){
            System.out.println(fraseCorrecta+"!! es la palabra correcta");
        }else{
            System.out.println("La palabra ingresada NO es correcta :(");
        }
    }
}
