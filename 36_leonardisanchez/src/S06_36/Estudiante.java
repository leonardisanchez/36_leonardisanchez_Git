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

    
    
    
    public class Estudiante {
    // Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private String numeroEstudiante;
    private String carrera;

    // Constructor
    public Estudiante(String nombre, String apellido, int edad, String genero, String numeroEstudiante, String carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.numeroEstudiante = numeroEstudiante;
        this.carrera = carrera;
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

    public String getNumeroEstudiante() {
        return numeroEstudiante;
    }

    public void setNumeroEstudiante(String numeroEstudiante) {
        this.numeroEstudiante = numeroEstudiante;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    // Método para obtener el nombre completo
    public String obtenerNombreCompleto() {
        return nombre + " " + apellido;
    }

    // Método para mostrar información del estudiante
    public void mostrarInformacion() {
        System.out.println("Nombre: " + obtenerNombreCompleto());
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("Número de Estudiante: " + numeroEstudiante);
        System.out.println("Carrera: " + carrera);
    }

    
        // Ejemplo de uso
        Estudiante estudiante1 = new Estudiante("Juan", "Pérez", 20, "Masculino", "12345", "Ingeniería Informática");
        Estudiante estudiante2 = new Estudiante("María", "Gómez", 22, "Femenino", "54321", "Ciencias de la Computación");

        
        
    
}

    

