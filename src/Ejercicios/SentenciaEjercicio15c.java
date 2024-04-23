package Ejercicios;

import java.util.Scanner;

public class SentenciaEjercicio15c {

    Scanner ingreso = new Scanner(System.in);
   
    public void Ejercicio15c(){

        int numero;
        char letra;
        System.out.println( "Ingrese numeros para saber si son positivos o negativos");

        do{
            System.out.print("Ingrese el numero: "); 
            numero = ingreso.nextInt();   
           
            if(numero >0){
                System.out.println("El numero ingresado es positivo");
            }
            else{
                System.out.println("El numero ingresado es negativo");
            }
            if(numero%2==0){
                System.out.println("El numero es par ");
            }else{
                System.out.println("El numero es impar ");
            }

            System.out.print("Desea ingresar otro numero?(S/N): ");
            letra = ingreso.next().charAt(0);

            if(letra =='n' || letra =='N'){
                System.out.println("Saliendo");
            }


        }while(numero !=0 && !(letra =='n' || letra =='N'));

        

    }

}
