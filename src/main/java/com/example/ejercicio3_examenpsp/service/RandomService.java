package com.example.ejercicio3_examenpsp.service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.example.ejercicio3_examenpsp.model.RandomNumber;
import org.springframework.stereotype.Service;


// Anotación @Service para marcar esta clase como un componente de servicio en Spring
@Service
public class RandomService {

    // Instancia de Random para generar números aleatorios
    private final Random random = new Random();

    // Método para generar una lista de 100 números aleatorios
    public List<RandomNumber> generateRandomNumbers() {
        return IntStream.range(0, 100)
                .mapToObj(i -> new RandomNumber(random.nextInt(Integer.MAX_VALUE)))
                .collect(Collectors.toList());
    }

    // Método para generar un número aleatorio con un número específico de dígitos
    public int generateRandomNumberWithDigits(int digits) {
        int min = (int) Math.pow(10, digits - 1);
        return random.nextInt(9 * min) + min;
    }

    // Método para generar un número aleatorio con el mismo número de dígitos que otro número dado
    public int generateRandomNumberWithSameDigits(int number) {
        int digits = String.valueOf(number).length();
        return generateRandomNumberWithDigits(digits);
    }
}


