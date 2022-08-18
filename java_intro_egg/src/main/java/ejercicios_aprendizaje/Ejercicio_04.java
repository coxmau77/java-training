
package ejercicios_aprendizaje;

public class Ejercicio_04 {
    public static void main(String[] args) {
//        Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
//        La fórmula correspondiente es: F = 32 + (9 * C / 5).
        double gradosCentigrados = 40.0;
//        double gradosFahrenheit = 32 + (9 * gradosCentigrados / 5);
        double gradosFahrenheit = (gradosCentigrados * 9 / 5) + 32;
        System.out.println(gradosCentigrados+"ºC son "+gradosFahrenheit+"ºF");
    }
}
