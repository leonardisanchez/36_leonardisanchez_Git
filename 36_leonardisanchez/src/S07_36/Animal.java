/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S07_36;

/**
 *
 * @author Leonardi
 */


    public class Animal {
    // Atributos
    private String nombre;
    private int edad;
    private String genero;
    private String especie;
    private String habitat;

    // Constructor
    public Animal(String nombre, int edad, String genero, String especie, String habitat) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.especie = especie;
        this.habitat = habitat;
    }

    // Métodos para obtener y establecer atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    // Método para mostrar información del animal
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("Especie: " + especie);
        System.out.println("Habitat: " + habitat);
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        Animal animal1 = new Animal("León", 5, "Masculino", "Panthera leo", "Savannah");
        Animal animal2 = new Animal("Tigre", 6, "Femenino", "Panthera tigris", "Jungla");

        animal1.mostrarInformacion();
        animal2.mostrarInformacion();
    }
}

    

