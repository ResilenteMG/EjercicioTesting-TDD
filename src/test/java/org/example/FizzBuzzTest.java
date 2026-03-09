package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void check_1_to_1() {
        assertEquals("1", new FizzBuzz().convert(1));
    }
}