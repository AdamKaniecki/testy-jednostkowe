package org.example;

public class Calculator {

    public  int add(String left, String right){
        return Integer.parseInt(left) + Integer.parseInt(right);
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
