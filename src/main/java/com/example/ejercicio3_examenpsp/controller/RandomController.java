package com.example.ejercicio3_examenpsp.controller;

import com.example.ejercicio3_examenpsp.model.RandomNumber;
import com.example.ejercicio3_examenpsp.service.RandomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/random")
public class RandomController {

    @Autowired
    private RandomService randomService;

    //http://localhost:8080/random/numbers
    @GetMapping("/numbers")
    public ResponseEntity<List<RandomNumber>> getRandomNumbers() {
        List<RandomNumber> numbers = randomService.generateRandomNumbers();
        return ResponseEntity.ok(numbers);
    }

    //http://localhost:8080/random/number/4
    @GetMapping("/number/{d}")
    public ResponseEntity<RandomNumber> getRandomNumberWithDigits(@PathVariable int d) {
        int randomNumber = randomService.generateRandomNumberWithDigits(d);
        return ResponseEntity.ok(new RandomNumber(randomNumber));
    }

    //
    @PutMapping("/number")
    public ResponseEntity<RandomNumber> putRandomNumber(@RequestBody RandomNumber randomNumber) {
        int newRandom = randomService.generateRandomNumberWithSameDigits(randomNumber.getRandom());
        return ResponseEntity.ok(new RandomNumber(newRandom));
    }

}

