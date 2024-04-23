package Ejercicios;
import java.util.Scanner;

public class SentenciaEjercicio14 {

    Scanner ingreso = new Scanner(System.in);

    public void mostrarPares(){

        int A, B;
        do
        {
            System.out.print("ingrese el valor de A: ");
            A = ingreso.nextInt();
            System.out.print("ingrese el valor de B: ");
            B = ingreso.nextInt();

            if(A<B)
            {
                for(int i=A;i<B;i++)
                {
                    if(i%2==0)
                    {
                        System.out.print(i + " - ");
                    }
                }
            }
            else
            {
                System.out.println("El valor de A debe ser menor a B, ingrese nuevamente los valores");
            }
    
        }while(A>B);
        System.out.println();        
    }

}
