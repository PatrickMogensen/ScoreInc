package com.company;

public class Main {

    public static void main(String[] args) {
	ScoreIncreasing sc = new ScoreIncreasing();
        int[] intArray = new int[]{ 1,2,3,4,4 };
        int[] intArray2 = new int[]{ 1,20,3,4,4 };

        System.out.println( sc.scoresIncreasing(intArray));
        System.out.println( sc.scoresIncreasing(intArray2));


    }
}
