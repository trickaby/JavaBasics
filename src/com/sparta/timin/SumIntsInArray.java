package com.sparta.timin;

public class SumIntsInArray {

    public static int sumOfNOdd (int[] arrayOfInts) {
        int sum = 0;
        for(int i=0;  i < arrayOfInts.length; i = i+2){
            sum += arrayOfInts[i];
        }
        return sum;
    }

    public static int sumOfNEven (int[] arrayOfInts) {
        int sum = 0;
        for(int i=1;  i < arrayOfInts.length; i = i+2){
            sum += arrayOfInts[i];
        }
        return sum;
    }


}
