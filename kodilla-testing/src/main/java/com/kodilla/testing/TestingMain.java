package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        //test for Calculator.add
        Calculator calculatorAdd = new Calculator();
        int sum = calculatorAdd.add(0,0);
        if (sum == 0){
            System.out.println(" add operation for 0+0 mut gives result 0, calculator gives: "+sum+", toll works!");
        }else {
            System.out.println(" add operation for 0+0 mut gives result 0, calculator gives: "+sum+", toll error!");
        }

        //test for Calculator.subtract
        Calculator calculatorSubtract = new Calculator();
        int difference = calculatorSubtract.subtract(0,0);
        if (difference == 0){
            System.out.println(" add operation for 0-0 mut gives result 0, calculator gives: "+difference+", toll works!");
        }else {
            System.out.println(" subtract operation for 0-0 mut gives result 0, calculator gives: "+difference+", toll error!");
        }
    }
}