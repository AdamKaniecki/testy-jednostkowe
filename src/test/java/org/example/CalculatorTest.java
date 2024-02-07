package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("metoda add własna nazwa")
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

    @Test
    void subtract() {
//    given
        int left = 5;
        int right = 3;
        Integer expected = 2;

//    when
        Integer result = Calculator.subtract(left, right);

//    then
        Assertions.assertEquals(expected,result);
    }

    @Test
    void multiply() {
//    given
        int left = 5;
        int right = 3;
        Integer expected = 15;

//    when
        Integer result = Calculator.multiply(left, right);

//    then
        Assertions.assertEquals(expected,result);
    }

    @Test
    void divide() {
//    given
        int left = 5;
        int right = 3;
        Integer expected = 1;

//    when
        Integer result = Calculator.divide(left, right);

//    then
        Assertions.assertEquals(expected,result);
    }


}