package Ejercicios;
import java.util.Scanner;


public class Condicionales {

    // public void esPar(int numero)
    // {
    //     if(numero % 2 ==0)
    //     {
    //         System.out.println("El numero " + numero + " es par");
    //     }else
    //     {
    //         System.out.println("El numero " + numero + " es impar");
    //     }
    // }

    // public void leerCaracter(char letra)
    // {
    //     if(Character.isLowerCase(letra))
    //     {
    //         System.out.println("La letra ingresada es minuscula");
    //     }
    //     else if(Character.isUpperCase(letra))
    //     {
    //         System.out.println("La letra ingresada es Mayuscula");
    //     }
    //     else
    //     {
    //         System.out.println("Debe ingresar una letra");
    //     }
    // }


    // public void esTriangulo(double l1, double l2, double l3)
    // {
    //     if((l1+l2>l3) && (l1+l3>l2) && (l2+l3>l1))
    //     {
    //         System.out.println("Los lados ingresados representan un triangulo");    
    //     }
    //     else
    //     {
    //         System.out.println("Los lados ingresados no representan un triangulo");    
    //     }
    // }

    // public boolean esTriangulobool(double l1, double l2, double l3)
    // {
    //     if((l1+l2>l3) && (l1+l3>l2) && (l2+l3>l1))
    //     {
    //         return true; 
    //     }
    //     else
    //     {
    //         return false;   
    //     }
    // }

    // public void hacertriangulo(double l1, double l2, double l3)
    // { 
        
    //     if(esTriangulobool(l1, l2, l3)==true)
    //     {
    //         if(l1==l2 && l1==l3)
    //         {
    //             System.out.println("El triangulo es Equilatero");
    //         }
    //         else if(l1==l2 && l1!=l3)
    //         {
    //             System.out.println("El triangulo es Isoceles");
    //         }
    //         else if((l1!=l2 && l2!=l3 && l1!=l3)){
    //             System.out.println("El triangulo es Escaleno");
    //         }
    //         else if((l1+l2<=l3) && (l1+l3<=l2) && (l2+l3<=l1)){
    //             System.out.println("Algun dato fue ingresado incorrectamente, por favor ingrese 3 numeros enteros positivos");
    //         }
    //     }   
    // }

     public static void main(String[] args) {
        
        Condicionales cond1 = new Condicionales();
     
        // Scanner entrada = new Scanner (System.in);
        // int numero;

        // do{
        //     System.out.print("Ingrese un numero entero distinto de 0: ");
        //     numero = entrada.nextInt();

        // }while(numero==0);
     
        // cond1.esPar(numero);
        
        // Scanner entrada = new Scanner (System.in);
        // //ingresar una letra por favor:
        // char caracter;
        // do{
        //     System.out.print("Ingrese una letra por favor: ");//preguntar como hacer para que tome la ñ como letra
        //     caracter = entrada.next().charAt(0);  

        // }while(caracter !=' ');//condicion para que no ingrese una cadena vacia o un caracter no valido o un numero
          
        // cond1.leerCaracter(caracter);
        
        

        //Pedir 3 numeros y verificar que sea triangulo y en caso de serlo decir que tipo
        // System.out.println("Ingresaremos 3 lados para saber el tipo de triangulo que representan: ");
        // System.out.print("Ingrese el lado 1: ");
        // double lado1= entrada.nextDouble();
        // System.out.print("Ingrese el lado 2: ");    
        // double lado2= entrada.nextDouble();
        // System.out.print("Ingrese el lado 3: ");    
        // double lado3= entrada.nextDouble();
        
        System.out.println();

        cond1.esTriangulo(lado1, lado2, lado3);

        System.out.println();
        
        cond1.hacertriangulo(lado1, lado2, lado3);
    }


}
