package br.com.elisbjr;

import java.util.function.IntBinaryOperator;

public class TesteLambda {
    public static void main(String[] args) {
        IntBinaryOperator intBinaryOperator = (int a, int b) -> {
            return a + b;
        };


        System.out.println(intBinaryOperator.applyAsInt(3,4));
    }




}
