package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;



    @BeforeEach
    void beforeEach() {

       calculator = new Calculator();
    }



//do testów parametryzowanych wchodzą dane, czyli zmienia się sygnatura metody
// w ten sposób można zrobić wiele testów do 1 metody za jednym zamachem
 @ParameterizedTest
 @MethodSource(value = "testData")
    void testCalculator(int[] testData ) {
//        nie ma sensu zapisywać tego w taki sposób
//        int left = testData[0];
//        int right = testData[1];
//        Integer expected = testData[2];

//        tylko tak:
//   given, when, then

        Assertions.assertEquals(testData[0],calculator.add(testData[1],testData[2] ));

    }
//w taki sposób ustawiam dane wchodzące
    public static int[][]testData(){
         return new int[][] {
                 {5,2,3},
                 {10,2,8},
                 {6,2,4}};
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
        Assertions.assertEquals(expected, result);

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
        Assertions.assertEquals(expected, result);

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
        Assertions.assertEquals(expected, result);

    }


}