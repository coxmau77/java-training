
package cox.java_intro_egg;

public class practice_02_variables {
    public static void main(String[] args) {
        
//        Crear un proyecto de Java y definir al menos 6 variables en tu IDE de distintos tipos de datos.
//        ¿Recuerdas las variables que creaste en el ejercicio anterior? Ahora deberás asignarles un valor.
        
/*
        Java es un lenguaje de tipado estático, esto significa que todas las variables deben ser declaradas antes que ellas puedan ser utilizadas y que no podemos cambiar el tipo de dato de una variable, a menos que, sea a traves de una conversión.
        */
        //TIPOS DE DATOS PRIMITIVOS
        
//        byte: Es un entero con signo de 8 bits, el mínimo valor que se puede almacenar es -128 y el máximo valor es de 127 (inclusive).
        byte age = 35;
        
//        short: Es un entero con signo de 16 bits. El valor mínimo es -32,768 y el valor máximo 32,767 (inclusive).
        short idNumber = 32767;
        
//        int: Es un entero con signo de 32 bits. El valor mínimo es -2,147,483,648 y el valor máximo es 2,147,483,64 (inclusive). Generalmente es la opción por defecto.
        int personalNumber = 214748364;
        
//        long: Es un entero con signo de 64 bits, el valor mínimo que puede almacenar este tipo de dato es -9,223,372,036,854,775,808 y el máximo valor es
//9,223,372,036,854,775,807 (inclusive).
        long cardNumber = 922337203;
        
//        float: Es un número decimal de precisión simple de 32 bits (IEEE 754 Punto Flotante).
        float amount = 99.99f;
        
//        double: Es un número decimal de precisión doble de 64 bits (IEEE 754 Punto Flotante).
        double score = 999999999.99999999;
        
//        boolean: Este tipo de dato sólo soporta dos posibles valores: verdadero o falso y el dato es representado con tan solo un bit de información.
        boolean access = false;
        
//        char: El tipo de dato carácter es un simple carácter unicode de 16 bits. Su valor mínimo es de '\u0000' (En entero es 0) y su valor máximo es de '\uffff' (En entero es 65,535). Nota: un dato de tipo carácter se puede escribir entre comillas simples, por ejemplo 'a', o también indicando su valor Unicode, por ejemplo '\u0061'.
        char firstLetter = 'a';
        
//        String: Además de los tipos de datos primitivos el lenguaje de programación Java provee también un soporte especial para cadena de caracteres a través de la clase String.
//Encerrando la cadena de caracteres con comillas dobles se creará de manera automática una nueva instancia de un objeto tipo String.
//String cadena = “Sebastián”;
//Los objetos String son inmutables, esto significa que una vez creados, sus valores no pueden ser cambiados. Si bien esta clase no es técnicamente un tipo de dato primitivo, el lenguaje le da un soporte especial y hace parecer como si lo fuera.
        String fullName = "Mauricio Cox";


    }
}
