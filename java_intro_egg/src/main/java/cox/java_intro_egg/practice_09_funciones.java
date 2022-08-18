package cox.java_intro_egg;

import java.util.Scanner;

public class practice_09_funciones {

    public static void main(String[] args) {

        Scanner reed = new Scanner(System.in);

//    EJERCICIO 11
//    Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto,
//    y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el 
//    carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) 
//    se mantienen sin cambios.
        String letrasReemplazo = "aeiou";
        
//        System.out.println(secuencia);
//        
//        String lower = secuencia.toLowerCase();
//        System.out.println(lower);
//        
//        System.out.println(secuencia.charAt(1));
//        System.out.println(secuencia.length());
//        System.out.println(secuencia.concat("###"));
//        System.out.println(secuencia.indent(22));
//        System.out.println(secuencia.indexOf(3));        
//        System.out.println(secuencia.compareTo(letrasReemplazo) == 0);

//            System.out.println(palabra.concat(txt.charAt(i)));
//            System.out.println(txt.charAt(i) == 'a');
//            System.out.println(txt.charAt(i));
//            System.out.println("**" + txt.charAt(i));
        
        
        String secuencia = "Ayer, lunes, salimos a las once y 10";
        System.out.println(secuencia);
        
        secuencia = reemplazarVocal(secuencia);
        System.out.println(secuencia); //@y#r, l*n#s, s@l$m%s @ l@s %nc# y 10
    }

    public static String reemplazarVocal(String txt) {

        String palabra = "";
        txt = txt.toLowerCase();
        
        for (int i = 0; i < txt.length(); i++) {
            
            switch(txt.charAt(i)){
                
                case 'a':
                    palabra = palabra + "@";
                    break;
                case 'e':
                    palabra = palabra + "#";
                    break;
                case 'i':
                    palabra = palabra + "$";
                    break;
                case 'o':
                    palabra = palabra + "%";
                    break;
                case 'u':
                    palabra = palabra + "*";
                    break;
                    
                default:
                    palabra = palabra + txt.charAt(i);
            }   
        }
        
        return palabra;
    }

}