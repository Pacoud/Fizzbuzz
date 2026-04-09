package com.example.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    // RED: Ce test doit échouer car la classe FizzBuzz n'existe pas encore
    @Test
    void should_return_1_when_given_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.convert(1));
    }
}
