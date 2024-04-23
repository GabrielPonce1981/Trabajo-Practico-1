package Ejercicios;
public class Celular {
    private String Modelo;
    private String Marca;
    private int memoria;
    private boolean radio;
    private int nroCelular;


    public Celular(String Modelo, String Marca, int memoria, boolean radio, int nroCelular){
        this.Modelo = Modelo;
        this.Marca = Marca;
        this.memoria = memoria;
        this.radio = radio;
        this.nroCelular = nroCelular;
    }

    public Celular(String Modelo, String Marca){
        this.Modelo = Modelo;
        this.Marca = Marca;
    }

    public void realizarLlamada()
    {
        System.out.println("Llamando!!!");
    }

    public void cortarLlamada()
    {
        System.out.println("Llamada terminada...");
    }

    // public static void main(String[] args) 
    // {
    //     Celular cel1 = new Celular("A52", "Samsung Galaxi");

    //     cel1.realizarLlamada();
    //     cel1.cortarLlamada();
    // }

}
