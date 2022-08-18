
package cox.java_intro_egg;

public class practice_10_procedimientos {
    
    public static void main(String[] args) {
        String name = "Mauricio";
        short age = 44;  
        saludarPersona(name,age);
    }
    
    public static void saludarPersona(String name,int age){
        System.out.println("Hola "+name+", tienes "+age+" años.");
    }
}
