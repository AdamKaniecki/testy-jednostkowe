package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;
    //    stosowana gdy zawsze coś się powtarza jakaś częśc kodu- to działa raz i afterAll również
    @BeforeAll
    static void beforeAll() {
        System.out.println("before all..");


    }

    //        Before Each nie jest już satyczne
//    dzięki takiemu zapisowi nie musimy tego pisać 4 razy
    @BeforeEach
    void beforeEach() {
        System.out.println("before each...");
       calculator = new Calculator();
    }

    @AfterAll
    static void afterAll() {
        System.out.println("after all...");


    }

    @AfterEach
    void afterEach(){
        System.out.println("after each...");
    }

    @Test
    @DisplayName("metoda add własna nazwa")
    void add() {
//    given
        int left = 5;
        int right = 3;
        Integer expected = 8;
        System.out.println("add");
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
        System.out.println("subtract");
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
        System.out.println("multiply");
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
        System.out.println("divide");
    }


}