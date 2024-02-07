package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
//    given
        int left = 5;
        int right = 3;
        Integer expected = 8;

//    when
        Integer result = Calculator.add(left, right);

//    then
        Assertions.assertEquals(expected,result);
    }
}