
import java.util.Scanner;


public class Doctor {
    
    
    //=> 3 Variable estática
    static int id = 0;
    
    //Atributos de la clase Doctor.
    String name;
    String speciality;
    
    //Comportamientos
    public void showName(){
        System.out.println(name);
    }
    
    //El método constructor generico se define por java al momento de crear una clase y
    //poder crear objetos con este por ejemplo en nuestra clase Main() => 1
    //Este método nos ayuda a crear nuevas instancias de una clase
    //Tiene el mismo nombre que la clase que lo inicializa.
    //Usa la palabra new para invocarlo.
    
    //El método constructor puede tener cero o mas argumentos dentro de sus parentesis
    //y no devuelve ningun valor.
    Doctor(){
        //Aqui podemos colocar cualquier codigo que necesitemos que se ejecute en el momento que se crea un objeto
        System.out.println("Creando el objeto Doctor");
        
        //Incrementa la variable id cada vez que se crea un objeto Doctor.
        id++;
    }
    
    //=> 2 Método con parámetros
    Doctor(String name){
        System.out.println("Se imprime desde el metodo con parámetro name, nombre del doctor: "+name);
    }
   
    public void showId(){
        System.out.println("Doctor id: "+id);
    }
    
}
