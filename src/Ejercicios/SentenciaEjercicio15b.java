package Ejercicios;

import java.util.Scanner;

public class SentenciaEjercicio15b {

    Scanner ingreso = new Scanner(System.in);

    public void Ejercicio15b(){
        int num;
        
        do{
            System.out.print("Ingrese un numero entero: ");
            num = ingreso.nextInt();

            if(num>0)
            {
                System.out.println("El numero ingresado es positivo");
            }
            else if(num == 0){
                System.out.println("Saliendo");
            }
            else
            {
                System.out.println("El numero ingresado es negativo");
            }

        }while(num!=0);
    }
}
