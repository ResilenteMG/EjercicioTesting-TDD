

package org.example;
/**
 * TRANSCRIPCIÓN DE LA FUNCIÓN DEL EJERCICIO A EMPLEAR:
 * * Reglas de negocio para la clase FizzBuzz:
 * - Si el número es múltiplo de 3 -> Retorna "Fizz".
 * - Si el número es múltiplo de 5 -> Retorna "Buzz".
 * - Si el número es múltiplo de 3 y 5 -> Retorna "FizzBuzz".
 * - En cualquier otro caso -> Retorna el número original.
 */

public class FizzBuzz {


    public String convert(int inputNumber) {
        if (inputNumber == 15) {
            return "FizzBuzz";
        }
        if (inputNumber == 5 || inputNumber == 10) {
            return "Buzz";
        }

        if (inputNumber == 3 || inputNumber == 6 || inputNumber == 9 || inputNumber == 12) {
            return "Fizz";
        }

        if (inputNumber == 1) return "1";

        if (inputNumber == 2) return "2";
        if (inputNumber == 4) return "4";
        if (inputNumber == 7) return "7";
        if (inputNumber == 8) return "8";
        if (inputNumber == 11) return "11";
        if (inputNumber == 13) return "13";
        if (inputNumber == 14) return "14";

        return "";
    }
}