
package cox.java_intro_egg;

public class practice_13_clases_de_utilidad {
    public static void main(String[] args) {
        int number = 4;
        String numberToString = String.valueOf(number);
        
        System.out.println("Numero entero: "+number);
        System.out.println("Numero a string: "+numberToString);
        System.out.println("Numero entero: "+(number+1));
        System.out.println("Numero a string: "+(numberToString+1));
        
        double value = 4;
        //MÉTODO MATH
        System.out.println("Ptencia de 4 elevado al cuadrado: "+Math.pow(value,2));
        System.out.println("Raiz cuadrada de 4: "+Math.sqrt(value));
        
        double doubleValue = 1.99;
        System.out.println("Devuelve el valor mas bajo: "+Math.floor(doubleValue));
        System.out.println("Devuelve el valor mas alto: "+Math.ceil(doubleValue));
        
        double randomNumber = Math.random()*10;
        System.out.println("\nDevuelve un numero aleatorio de 0 a 9: "+randomNumber);
        //Podemos redondear el numero decimal con el metodo ceil()
        System.out.println("Devuleve un numero aleatorio de 1 a 10: "+Math.ceil(randomNumber));
        
    }
}
