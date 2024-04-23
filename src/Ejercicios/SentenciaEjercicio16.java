package Ejercicios;

import java.util.Scanner;

public class SentenciaEjercicio16 {

    Scanner ingreso = new Scanner(System.in);

    public void Ejercicio16(){
        double millas, kilometros;
        
        do{
            System.out.print("Ingrese la cantidad de millas para convertir a kilometros: ");
            millas = ingreso.nextDouble();

            kilometros = (millas * 1.6093);
            
            if(millas == 0){
                System.out.println("Saliendo");
                break;
            }
            
            System.out.println("El equivalente a " + millas + " millas es: " + String.format("%.2f", kilometros ) + " km");

        }while(millas !=0);
    }

}
