package Ejercicios;

public class SentenciaEjercicio12 {

    public void calcularFactorial(int num)
    {
        int factorial = 1;
        
        for(int i=1; i<=num; i++){

            factorial = factorial * i;
        }
        System.out.println("El factorial del numero " + num + " es " + factorial);
    }
    

}
