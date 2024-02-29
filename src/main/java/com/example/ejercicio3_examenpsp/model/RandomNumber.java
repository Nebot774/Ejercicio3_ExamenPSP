package com.example.ejercicio3_examenpsp.model;

public class RandomNumber {
    // Variable para almacenar el número aleatorio
    private int random;

    // Constructor predeterminado (sin parámetros)
    public RandomNumber() {}

    // Constructor que acepta un número aleatorio como parámetro
    public RandomNumber(int random) {
        this.random = random;
    }

    // Método para obtener el número aleatorio
    public int getRandom() {
        return random;
    }

    // Método para establecer el número aleatorio
    public void setRandom(int random) {
        this.random = random;
    }
}


