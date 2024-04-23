
import java.util.Scanner;


import Ejercicios.Auto;
import Ejercicios.Celular;
//import Ejercicios.Condicionales;
import Ejercicios.Persona;

import Ejercicios.CondicionalesEjercicio7;
import Ejercicios.CondicionalesEjercicio8;
import Ejercicios.CondicionalesEjercicio9;
import Ejercicios.CondicionalesEjercicio10;
import Ejercicios.SentenciaEjercicio11;
import Ejercicios.SentenciaEjercicio12;


public class App {

    public static void main(String[] args) {
        
        int opcion;
        do{

            System.out.println("----------Menu---------");
            System.out.println("1. Ejercico 1/3/4 - Persona.java");
            System.out.println("2. Ejercico 2/3/5 - Autor.java");
            System.out.println("3. Ejercicio 6 - Celular.java");
            System.out.println("4. Ejercico 7 - Condicionales");
            System.out.println("5. Ejercicio 8 - Condicionales");
            System.out.println("6. Ejercicio 9 - Condicionales");
            System.out.println("7. Ejercicio 10 - Condicionales");
            System.out.println("8. Ejercicio 11 - Sentencia");
            System.out.println("9. Ejercicio 12 - Sentencia");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
    
            
    
            System.out.print("Ingrese una opcion: ");
            Scanner ingreso = new Scanner(System.in);
            opcion = ingreso.nextInt();
    
            switch(opcion){
                case 1:
                    Persona persona1 = new Persona("Gabriel", "Ponce", 'M', 42, "Bahia Blanca");
                
                    Persona persona2 = new Persona("Gabriel", "Ponce");
                    
                    persona1.mostrarDatospersona1();
                    persona1.mayorEdad(); 
                    
                    System.out.println();
                    break;
                case 2:
                    Auto auto1 = new Auto("Azul", "NTK214", 2021, "Volkswagen Gol", 135000);  

                    auto1.encender();
                    auto1.kilometrajeMayor(); 
                   
                    System.out.println();
                    break;
                case 3:   
                    Celular cel1 = new Celular("A52", "Samsung Galaxi");

                    cel1.realizarLlamada();
                    cel1.cortarLlamada();

                    System.out.println();
                    break;
                case 4:
                    CondicionalesEjercicio7 cond1Ejercicio7 = new CondicionalesEjercicio7();
                    
                    int numero;
            
                    do{
                        System.out.print("Ingrese un numero entero distinto de 0: ");
                        numero = ingreso.nextInt();
            
                    }while(numero==0);
             
                    cond1Ejercicio7.esPar(numero);
                    break;

                case 5:
                    CondicionalesEjercicio8 cond1Ejercicio8 = new CondicionalesEjercicio8();
                    
                    char letra;
                    do {
                        
                        System.out.print("Ingrese una letra por favor: ");
                        letra = ingreso.next().charAt(0); 

                        if(!Character.isLetter(letra)){
                            System.out.println("Dato no valido!! Debe ingresar una letra");
                        }

                    } while (!Character.isLetter(letra));
                        
                    cond1Ejercicio8.leerCaracter(letra);
                    break;

                case 6:

                    System.out.println("Ingresaremos 3 lados para saber el tipo de triangulo que representan: ");
                    System.out.print("Ingrese el lado 1: ");
                    double lado1= ingreso.nextDouble();
                    System.out.print("Ingrese el lado 2: ");    
                    double lado2= ingreso.nextDouble();
                    System.out.print("Ingrese el lado 3: ");    
                    double lado3= ingreso.nextDouble();
                    
                    System.out.println();
            
                    CondicionalesEjercicio9.esTriangulo(lado1, lado2, lado3);
            
                    System.out.println();
                    break;

                case 7:

                    System.out.println("Ingresaremos 3 lados para saber el tipo de triangulo que representan: ");
                    System.out.print("Ingrese el lado 1: ");
                    double ladoa= ingreso.nextDouble();
                    System.out.print("Ingrese el lado 2: ");    
                    double ladob= ingreso.nextDouble();
                    System.out.print("Ingrese el lado 3: ");    
                    double ladoc= ingreso.nextDouble();
                    
                    System.out.println();
                    
                    if(CondicionalesEjercicio9.esTriangulo(ladoa, ladob, ladoc))
                    {
                        CondicionalesEjercicio10.hacertriangulo(ladoa, ladob, ladoc);  
                    }
                       
                    break;
                case 8:
                    SentenciaEjercicio11 sent1Ejercicio11 = new SentenciaEjercicio11();

                    System.out.println("Imprimendo numeros desde 100 a 1");

                    sent1Ejercicio11.imprimir();

                    break;
                case 9:
                    SentenciaEjercicio12 sent1Ejercicio12 = new SentenciaEjercicio12();
                    
                    System.out.print("Ingrese un numero para calcular el factorial: ");    
                    int numero = ingreso.nextInt(); 

                    sent1Ejercicio12.calcularFactorial(numero);
                    
                    break;
                case 10:

                break;
                case 11:
                break;
                case 12:
                break;
                case 13:
                break;
                case 14:
                break;
    
            }
    
    
    
        }while(opcion!=15);





    }

}
