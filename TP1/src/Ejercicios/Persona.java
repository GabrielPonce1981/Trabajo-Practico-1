package Ejercicios;
public class Persona {
    private String nombre;
    private String apellido;
    private char sexo;
    private int edad;
    private String ciudad;

    public Persona(String nombre, String apellido, char sexo, int edad, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void mostrarDatospersona1(){
        System.out.println("\n");
        System.out.println("Aqui se muestran los datos de la persona 1:");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Edad: " + this.edad);
        System.out.println("Ciudad: " + this.ciudad);
    }

    public void mostrarDatospersona2(){
        System.out.println("\n");
        System.out.println("Aqui se muestran los datos de la persona 2:");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
    }

    public void mayorEdad(){
        if(this.edad >= 18){
            System.out.println("La persona es mayor de edad");
        }else{
            System.out.println("La persona es menor de edad");
        }
    }


    // public static void main(String[] args) {
    //     Persona persona1 = new Persona("Gabriel", "Ponce", 'M', 42, "Bahia Blanca");
        
    //     Persona persona2 = new Persona("Gabriel", "Ponce");
        
    //     persona1.mostrarDatospersona1();
    //     persona1.mayorEdad();    
    
    
    // }


}



