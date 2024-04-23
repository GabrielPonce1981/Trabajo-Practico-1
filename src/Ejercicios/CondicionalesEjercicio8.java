package Ejercicios;


public class CondicionalesEjercicio8 {

    public void leerCaracter(char letra)
    {
        if(Character.isLowerCase(letra))
        {
            System.out.println("La letra ingresada es minuscula");
        }
        else if(Character.isUpperCase(letra))
        {
            System.out.println("La letra ingresada es Mayuscula");
        }
       
    }

}
