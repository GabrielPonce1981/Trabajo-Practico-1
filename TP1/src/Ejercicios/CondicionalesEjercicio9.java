package Ejercicios;

public class CondicionalesEjercicio9 {


    public static boolean esTriangulo(double l1, double l2, double l3)
    {
        if((l1+l2>l3) && (l1+l3>l2) && (l2+l3>l1))
        {
            System.out.println("Los lados ingresados representan un triangulo");
            return true; 
        }
        else
        {
            System.out.println("Los lados ingresados no representan un triangulo");    
            return false;
        }
    }

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

 

}
