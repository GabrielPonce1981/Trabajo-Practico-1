package Ejercicios;
import java.util.Scanner;



public class Sentencias {

    static Scanner ingreso = new Scanner(System.in);


    // public void imprimir()
    // {
    //     int numero=100;
    //     do
    //     {
    //         System.out.print(numero + " - ");
    //         numero= numero-1;
           
    //     }while(numero!=0);
    //     System.out.println("\n");
    // }

    public void calcularFactorial(int num)
    {
        int factorial = 1;
        
        for(int i=1; i<=num; i++){

            factorial = factorial * i;
        }
        System.out.println("El factorial del numero " + num + " es " + factorial);
    }
    
    public void mostrarnumeros()
    {
        for(int i=500; i>=200;i--)
        {
            System.out.print(i + " - ");    
        }
    }


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
            
    }
    
    public void Ejercicio15a(){
        int num;
        System.out.print("Ingrese un numero: ");
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

    public void ejercicio15c(){

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

            System.out.println("Desea ingresar otro numero?(S/N)");
            letra = ingreso.next().charAt(0);

            if(letra =='n' || letra =='N'){
                System.out.println("Saliendo");
            }


        }while(numero !=0 && !(letra =='n' || letra =='N'));

        

    }

    public void ejercicio16(){
        double millas, kilometros;
        
        do{
            System.out.print("Ingrese la cantidad de millas para convertir a kilometros: ");
            millas = ingreso.nextDouble();

            if(millas == 0){
                break;
            }

            kilometros = (millas * 1.6093);
            
            System.out.println("El equivalente a " + millas + " millas es: " + String.format("%.2f", kilometros));

        }while(true);
    }


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

    public void ejercicio18(){
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

        switch(day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("El dia de la semana es laboral");
                break;
            case 6:
            case 7:
                System.out.println("El dia de la semana es no laboral");
                break;
            default:
                System.out.println("El dia de la semana no existe");
                break;
        }   

    }

    public void ejercicio19(){
        String palabra, cadena = "";
        
        
        while(true){
    
            System.out.print("Ingrese una palabra para agragar a la cadena: ");
            palabra = ingreso.nextLine(); 
            cadena += palabra + " ";

            if(palabra.isEmpty()){
                System.out.println("La cadena es: " + cadena);
                break;
            }
            
        }
        
    }

    public static void main(String[] args) {
        
        Sentencias sentencia = new Sentencias();
       
        sentencia.imprimir();

        System.out.print("Ingrese un numero para calcular el factorial: ");    
        int num = ingreso.nextInt(); 
    
        sentencia.calcularFactorial(num);


        System.out.println("Mostrar los numeros desde 500 a 200 inclusive: ");
        sentencia.mostrarnumeros();

        sentencia.mostrarPares();
    
        sentencia.Ejercicio15a();

        sentencia.Ejercicio15b();

        sentencia.ejercicio15c();

        sentencia.ejercicio16();

        sentencia.ejercicio17(); 
        
        sentencia.ejercicio18(); 


        sentencia.ejercicio19(); 

        
        
    }
    
}
