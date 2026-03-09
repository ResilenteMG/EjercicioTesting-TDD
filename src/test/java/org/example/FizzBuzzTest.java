package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    private final FizzBuzz fizzBuzz = new FizzBuzz();

    // --- PARTE 1: VERIFICACIÓN MANUAL PASO A PASO (1 al 7) ---
    @Test
    public void check_1_to_1() {
        assertEquals("1", fizzBuzz.convert(1));
    }

    @Test
    public void check_2_to_2() {
        assertEquals("2", fizzBuzz.convert(2));
    }

    @Test
    public void check_3_to_Fizz() {
        assertEquals("Fizz", fizzBuzz.convert(3));
    }

    @Test
    public void check_4_to_4() {
        assertEquals("4", fizzBuzz.convert(4));
    }

    @Test
    public void check_5_to_Buzz() {
        assertEquals("Buzz", fizzBuzz.convert(5));
    }

    @Test
    public void check_6_to_Fizz() {
        assertEquals("Fizz", fizzBuzz.convert(6));
    }

    @Test
    public void check_7_to_7() {
        assertEquals("7", fizzBuzz.convert(7));
    }


    @Test
    public void check_all_numbers_up_to_15() {
        for (int i = 1; i <= 15; i++) {
            String result = fizzBuzz.convert(i);
            System.out.println("Procesando número " + i + ": " + result);

            if (i % 3 == 0 && i % 5 == 0) assertEquals("FizzBuzz", result);
            else if (i % 3 == 0) assertEquals("Fizz", result);
            else if (i % 5 == 0) assertEquals("Buzz", result);
            else assertEquals(String.valueOf(i), result);
        }
    }
}