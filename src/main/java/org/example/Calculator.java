package org.example;

import lombok.extern.slf4j.Slf4j;

public class Calculator {

    public int add(int left, int right){

        return left + right;
    }
    public static int subtract(int left, int right){
        return left - right;
    }

    public static int multiply(int left, int right){
        return left * right;
    }

    public static int divide(int left, int right){
        return left / right;
    }
}
