package com.example.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * ============================================================
 * CYCLE 1 — RED / GREEN / REFACTOR
 * ============================================================
 *
 * 🔴 RED — État initial (test échouait avec l'erreur suivante) :
 *
 *   [ERROR] COMPILATION ERROR :
 *   cannot find symbol: class FizzBuzz
 *   location: class com.example.fizzbuzz.FizzBuzzTest
 *   → BUILD FAILURE
 *
 *   Raison : la classe FizzBuzz n'existait pas encore.
 *
 * 🟢 GREEN — Correction minimale :
 *
 *   Création de FizzBuzz.java avec la méthode :
 *     public String convert(int number) {
 *         return String.valueOf(number);
 *     }
 *   → Tests run: 1, Failures: 0 — BUILD SUCCESS
 *
 * 🔵 REFACTOR — Rien à refactorer, le code est déjà minimal.
 * ============================================================
 *
 * ============================================================
 * CYCLE 2 — RED / GREEN / REFACTOR
 * ============================================================
 *
 * 🔴 RED — Test ajouté (échouait avec l'erreur suivante) :
 *
 *   should_return_Fizz_when_given_3
 *   AssertionFailedError: expected: <Fizz> but was: <3>
 *   → Tests run: 2, Failures: 1 — BUILD FAILURE
 *
 *   Raison : convert() retournait String.valueOf(number) sans condition.
 *
 * 🟢 GREEN — Correction minimale :
 *
 *   Ajout dans FizzBuzz.java :
 *     if (number % 3 == 0) return "Fizz";
 *   → Tests run: 2, Failures: 0 — BUILD SUCCESS
 *
 * 🔵 REFACTOR — Rien à refactorer, le code est déjà minimal.
 * ============================================================
 */
class FizzBuzzTest {

    @Test
    void should_return_1_when_given_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.convert(1));
    }

    @Test
    void should_return_Fizz_when_given_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.convert(3));
    }
}
