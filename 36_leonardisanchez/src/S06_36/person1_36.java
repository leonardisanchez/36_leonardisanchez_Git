/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S06_36;

/**
 *
 * @author Leonardi
 */
public class person1_36 {
    
    
    
    public class Persona {
    // Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;

    // Constructor
    public Persona(String nombre, String apellido, int edad, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
    }

    // Métodos para obtener y establecer atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Método para obtener el nombre completo
    public String obtenerNombreCompleto() {
        return nombre + " " + apellido;
    }

    // Método para mostrar información de la persona
    public void mostrarInformacion() {
        System.out.println("Nombre: " + obtenerNombreCompleto());
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
    }

  
    // Ejemplo de uso
        Persona persona1 = new Persona("Juan", "Pérez", 30, "Masculino");
        Persona persona2 = new Persona("María", "Gómez", 25, "Femenino");

       
}

}
