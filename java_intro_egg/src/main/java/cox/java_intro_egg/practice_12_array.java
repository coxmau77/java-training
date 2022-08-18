
package cox.java_intro_egg;

public class practice_12_array {
    
    public static void main(String[] args) {
        
//        Declaración de un array,vector,arreglo...
        int numbers[] = new int[5];
        
//        Declaracion de una matriz de dimension 3x3
        String users[][] = new String[3][3];
        
        //EJERCICIO 13
        //Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo
        //y define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
        
        String equipo[];
//        Este dato puede provenir de el usuario o una funcion o un array
        int equipoTotal = 7;
        
//        inicializacion del array con su dimension
        equipo = new String[equipoTotal];
        
//        Asignar elementos a una posiciondel array
        numbers[0] = 9;
        
        for(int i = 1; i < numbers.length;i++){
            numbers[i] = 5;
        }
//        mostrar los elementos del vector numbers
        for(int i = 0; i < numbers.length;i++){
            System.out.println(numbers[i]);
        }
        
//        Asignar elementos a una matriz
        users[0][0] = "bitMau";
        
        String names[] = {"suertudo77","eva@22","bitMau","bet@lafea","koko20","tete55","2dias+","pepeArgento!01","xoxo2030"};
        
        int index = 0;
        for (int i = 0; i < users.length; i++){         
                       
            for (int j = 0; j < users.length; j++){
                users[i][j] = names[index];
                index++;
            }                      
        }
        
        for (int i = 0; i < users.length; i++){
            for (int j = 0; j < users.length; j++){
                System.out.println(users[i][j]);
            }
        }
        
        //EJERCICIO 14
        //Utilizando un Bucle for, aloja en el vector Equipo, 
        //los nombres de tus compañeros de equipo
        
        String partnerName[] = {"José","Mauricio","Gastón","Gonzálo","Fernando","Julieta","Malanie"};
        for (int i=0; i<partnerName.length; i++){
            equipo[i] = partnerName[i];
        }
        
//        Mostrar compañeros
        for (int i=0; i<partnerName.length; i++){
            System.out.println("Compañero Nº"+(i+1)+": "+equipo[i]);
        }
        
        
        
    }  
}
