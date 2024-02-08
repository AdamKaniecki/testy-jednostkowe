package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;


    @SuppressWarnings("InstantiationOfUtilityClass")
    @BeforeEach
    void beforeEach() {

       calculator = new Calculator();
    }



    @Test
    void assertionTest(){

    }

//    jak asercja nie przejdzie to drukuje wiadomość failure message
    private String createMessage(int param){
        System.out.println("message creation "+ param);
        return "failure message";
    }



    @Test
    @Disabled("This test is disabled")
    void testCalculator() {
//    given
        String left = "4";
        String right = "5";

//    then,when
        Assertions.assertThrows(EnumConstantNotPresentException.class,() ->  calculator.add(left, right)) ;

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