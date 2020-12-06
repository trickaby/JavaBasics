package com.sparta.timin;

public class SwapIntegers {

    public static void swap(int firstVar, int secondVar) {
        int swapperVar;
        Printer.printMessage("Before swap:: " + firstVar + ", " + secondVar);
        swapperVar = firstVar;
        firstVar = secondVar;
        secondVar = swapperVar;
        Printer.printMessage("After swap:: " + firstVar + ", " + secondVar);
    }


//would be good if could return these values but not sure how to return multiple vars

}
