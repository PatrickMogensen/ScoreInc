package com.company;

public class ScoreIncreasing {
    public boolean scoresIncreasing(int[] scores) {
        int prev = scores[0];

        for(int i =1 ; i < scores.length; i++){
            if(scores[i] < prev){
                return false;
            } prev = scores[i];

        }return true;
    }

}
