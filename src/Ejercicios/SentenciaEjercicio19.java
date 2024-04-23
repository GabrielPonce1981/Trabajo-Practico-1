package Ejercicios;

import java.util.Scanner;

public class SentenciaEjercicio19 {

    Scanner ingreso = new Scanner(System.in);

    public void ejercicio19(){
       
        String palabra, cadena = "";
        
        
        while(true){
    
            System.out.print("Ingrese una palabra para agragar a la cadena: ");
            palabra = ingreso.nextLine(); 
            cadena += palabra + " ";

            if(palabra.isEmpty()){
                System.out.println("La cadena es: " + cadena);
                break;
            }
            
        }
        
    }
}

