package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;


    @BeforeEach
    void beforeEach() {

       calculator = new Calculator();
    }

//    jeśli mam supliera i test przechodzi to nic nie drukuje a jak jest fail to drukuje createMessage
//    to samo jak w Optionalu orElseGET
    @Test
    void assertionTest(){
        Assertions.assertEquals(1,2,()-> createMessage(1));

    }

//    jak asercja nie przejdzie to drukuje wiadomość failure message
    private String createMessage(int param){
        System.out.println("message creation "+ param);
        return "failure message";
    }








    @Test

    void add() {
//    given
        int left = 5;
        int right = 3;
        Integer expected = 8;

//    when
        Integer result = Calculator.add(left, right);

//    then
        Assertions.assertEquals(expected, result);

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