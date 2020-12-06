package com.sparta.timin;

import java.util.Arrays;

public class Starter {

    public static void start(){


        SwapIntegers.swap(1,2);


        int[] arrayToSum = {7, 22, 9, 0, 501};
        Printer.printMessage("Array to sum: " + Arrays.toString(arrayToSum));
        Printer.printMessage("The sum of odds is: " + SumIntsInArray.sumOfNOdd(arrayToSum));
        Printer.printMessage("The sum of evens is: " + SumIntsInArray.sumOfNEven(arrayToSum));

        int[] fibonacciValues=Fibonacci.fibonacciIterative(5);
        Printer.printMessage("The Fibonacci series is::");
        for(int i:fibonacciValues){
            Printer.printMessage(i);
        }

        Printer.printMessage("The eigth term of Fibonacci is " + Fibonacci.fibonacciIterative(8)[8]);
        Printer.printMessage("The fourth term of Fibonacci is " +Fibonacci.fibonacciRecursive(4));


    }
}
