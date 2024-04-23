package Ejercicios;

import java.util.Scanner;


public class SentenciaEjercicio15a {

    Scanner ingreso = new Scanner(System.in);

    public void Ejercicio15a(){
        int num;
        System.out.print("Ingrese un numero entero ( o 0 para salir): ");	
        num = ingreso.nextInt();
        
            while(num !=0)
            {
                if(num>0){
                    System.out.println("El numero ingresado es positivo");
                    if(num%2==0){
                        System.out.println("El numero ingresado es Par");
                    }
                    else
                    {
                        System.out.println("El numero ingresasdo es Impar");
                    }
                }
                else
                {
                    System.out.println("El numero ingresado es negativo");
                    if(num%2==0){
                        System.out.println("El numero ingresado es Par");
                    }
                    else
                    {
                        System.out.println("El numero ingresasdo es Impar");
                    }
                }
                System.out.print("Ingrese un numero: ");
                num = ingreso.nextInt();

            }

    }

}
