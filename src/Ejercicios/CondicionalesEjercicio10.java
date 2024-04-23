package Ejercicios;

public class CondicionalesEjercicio10 {

     public static void hacertriangulo(double l1, double l2, double l3)
    {
            
        
            if(l1==l2 && l1==l3)
            {
                System.out.println("El triangulo es Equilatero");
            }
            else if(l1==l2 && l1!=l3)
            {
                System.out.println("El triangulo es Isoceles");
            }
            else if((l1!=l2 && l2!=l3 && l1!=l3)){
                System.out.println("El triangulo es Escaleno");
            }
            else if((l1+l2<=l3) && (l1+l3<=l2) && (l2+l3<=l1)){
                System.out.println("Algun dato fue ingresado incorrectamente, por favor ingrese 3 numeros enteros positivos");
            }
        }   
    }

