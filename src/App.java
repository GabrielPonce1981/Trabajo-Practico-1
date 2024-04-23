
import java.util.Scanner;


import Ejercicios.Auto;
import Ejercicios.Celular;
import Ejercicios.Persona;
import Ejercicios.CondicionalesEjercicio7;
import Ejercicios.CondicionalesEjercicio8;
import Ejercicios.CondicionalesEjercicio9;
import Ejercicios.CondicionalesEjercicio10;
import Ejercicios.SentenciaEjercicio11;
import Ejercicios.SentenciaEjercicio12;
import Ejercicios.SentenciaEjercicio13;
import Ejercicios.SentenciaEjercicio14;
import Ejercicios.SentenciaEjercicio15a;
import Ejercicios.SentenciaEjercicio15b;
import Ejercicios.SentenciaEjercicio15c;
import Ejercicios.SentenciaEjercicio16;
import Ejercicios.SentenciaEjercicio17;
import Ejercicios.SentenciaEjercicio18;
import Ejercicios.SentenciaEjercicio19;



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
            System.out.println("10. Ejercicio 13 - Sentencia");
            System.out.println("11. Ejercicio 14 - Sentencia");
            System.out.println("12. Ejercicio 15a - Sentencia");
            System.out.println("13. Ejercicio 15b - Sentencia");
            System.out.println("14. Ejercicio 15c - Sentencia");
            System.out.println("15. Ejercicio 16 - Sentencia");
            System.out.println("16. Ejercicio 17 - Sentencia");
            System.out.println("17. Ejercicio 18 - Sentencia");
            System.out.println("18. Ejercicio 19 - Sentencia");
            System.out.println("19. Salir ");
            System.out.println("--------------------------------");
            System.out.println();
    
            
    
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
                    int num = ingreso.nextInt(); 

                    sent1Ejercicio12.calcularFactorial(num);

                    break;
                case 10:
                    SentenciaEjercicio13 sent1Ejercicio13 = new SentenciaEjercicio13();
                    sent1Ejercicio13.mostrarnumeros();
                    break;
                case 11:
                    SentenciaEjercicio14 sent1Ejercicio14 = new SentenciaEjercicio14();
                    sent1Ejercicio14.mostrarPares();
                    break;
                case 12:
                    SentenciaEjercicio15a sent1Ejercicio15 = new SentenciaEjercicio15a();
                    sent1Ejercicio15.Ejercicio15a();
                    break;
                case 13:
                    SentenciaEjercicio15b sent1Ejercicio15b = new SentenciaEjercicio15b();
                    sent1Ejercicio15b.Ejercicio15b();
                    break;
                case 14:
                    SentenciaEjercicio15c sent1Ejercicio15c = new SentenciaEjercicio15c();
                    sent1Ejercicio15c.Ejercicio15c();
                    break;
                case 15:
                    SentenciaEjercicio16 sent1Ejercicio16 = new SentenciaEjercicio16();
                    sent1Ejercicio16.Ejercicio16();
                    break;
                case 16:
                    SentenciaEjercicio17 sent1Ejercicio17 = new SentenciaEjercicio17();
                    sent1Ejercicio17.ejercicio17();
                    break;
                case 17:
                    SentenciaEjercicio18 sent1Ejercicio18 = new SentenciaEjercicio18();
                    sent1Ejercicio18.ejercicio18();
                    break;
                case 18:
                    SentenciaEjercicio19 sent1Ejercicio19 = new SentenciaEjercicio19();
                    sent1Ejercicio19.ejercicio19();
                    break;
                case 19: 
                    break;    
                default:
                    System.out.println("Debe ingresar un numero entre 1 y 18");
            }
    
        }while(opcion!=19);





    }

}
