package Ejercicios;
import java.util.Scanner;

public class SentenciaEjercicio17 {

    Scanner ingreso = new Scanner(System.in);

    public void ejercicio17(){
        int day;
        System.out.print("Ingrese un numero entre 1 y 7 para saber que dia de la semana es: ");
        day = ingreso.nextInt();

        switch (day) {
            case 1:
                System.out.println("Es Lunes");
                break;
            case 2:
                System.out.println("Es Martes");
                break;
            case 3:
                System.out.println("Es Miercoles");
                break;
            case 4:
                System.out.println("Es Jueves");
                break;
            case 5:
                System.out.println("Es Viernes");
                break;
            case 6:
                System.out.println("Es Sabado");
                break;
            case 7:
                System.out.println("Es Domingo");
                break;
        
            default:
            System.out.println("Debe ingresar un numero entre 1 y 7");  
                break;
        }
        
    }

}
