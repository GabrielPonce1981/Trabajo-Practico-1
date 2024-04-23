package Ejercicios;
public class Auto {
    private String color;
    private String patente;
    private int anio;
    private String modelo;
    private int km;

    public Auto(String color, String patente, int anio, String modelo, int km) {
        this.color = color;
        this.patente = patente;
        this.anio = anio;
        this.modelo = modelo;
        this.km = km;
    }   

    public void encender(){
        System.out.println("El vehiculo esta encendido");
    }

    public void kilometrajeMayor(){
        if(this.km > 100000){
            System.out.println("Los autos con mas de 100000 son " + this.modelo + " " +this.anio+ " "+ this.patente);
            System.out.println("El auto tiene " + this.km + " reales");
        }else{
            System.out.println("El auto tiene menos de 100000 km");
        }
    }
    // public static void main(String[] args) {
        
    //     Auto auto1 = new Auto("Azul", "NTK214", 2021, "Volkswagen Gol", 135000);  

    //     auto1.encender();
    //     auto1.kilometrajeMayor();    
    // }

}
