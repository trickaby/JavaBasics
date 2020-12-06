package com.sparta.timin;

public class Fibonacci {

    public static int fibonacciRecursive(int n)
    {
        if (n <= 1)
            return n;
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    public static int[] fibonacciIterative(int n) {
        int[] fibonacciValues=new int[n+1];
         fibonacciValues[0] = 0;
        fibonacciValues[1] = 1;
        if (n>1){

            for (int i = 2; i < fibonacciValues.length; i++) {
                fibonacciValues[i]  =  fibonacciValues[i-2] + fibonacciValues[i-1];

//                fibonacciValues[0] = fibonacciValues[1];
//                fibonacciValues[1] = fibonacciValues[i] ;

            }
        }
        return fibonacciValues;
    }






}
