
package cox.java_intro_egg;
import java.util.Scanner;

public class practice_07_while {
    public static void main(String[] args) {
        
        Scanner reed = new Scanner(System.in);
        
//        String respuesta = "S";
//        String seleccion = "A";
//        
//        while (respuesta.equalsIgnoreCase("S")){
//            System.out.println("Desea continuar, presione `S`");
//            respuesta = reed.next();
//        }
//        
//        // DO / WHILE
//        do {
//            System.out.println("Desea continuar, presione `"+seleccion+"`");
//            seleccion = reed.next();
//            
//        }while(seleccion.equalsIgnoreCase("A"));
        
//        EJERCICIO 9
//        Escriba un programa que lea 20 números. Si el número leído es igual a cero 
//        se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
//        El programa deberá calcular y mostrar el resultado de la suma de los números leídos, 
//        pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
         double numbers;
         int count = 0;
         int limit = 20;
         
         
         do {
             System.out.println(count+1+"/"+limit+" - Ingrese un numero, cero para finalizar");
             numbers = reed.nextDouble();
             count++;
             
             if(numbers == 0){
                 System.out.println("El numero es igual a "+numbers);
             }
         }while(numbers != 0 && count < limit);
         
         System.out.println("Se ingresaron "+count+" números en total.");
    }
}
