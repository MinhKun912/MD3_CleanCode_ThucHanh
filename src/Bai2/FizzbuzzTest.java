package Bai2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzbuzzTest {
    @Test
    void testFizz(){
        int number=3;
        String expected="fizz";
        String result=FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }
}
