
package cox.java_intro_egg;

public class practice_3_operadores {
    public static void main(String[] args) {
        byte numberA = 5;
        byte numberB = 3;
        int plus = numberA + numberB;
        double division = numberA / numberB;
        boolean isBigger = numberA > numberB;
        System.out.println("Suma = "+plus);
        System.out.println("Division = "+division);
        System.out.println("Boolean = "+isBigger);
        
//        Operadores de incremento y decremento
        System.out.println("numberA = "+numberA);
        //incremento prefijo
        ++numberA;
        System.out.println("++numberA = "+numberA);
        //incremento sufijo
        numberA++;
        System.out.println("numberA++ = "+numberA);
        System.out.println("numberB = "+numberB);
        //Decremento
        numberB--;
        System.out.println("numberB-- = "+numberB);
        
    }
}
