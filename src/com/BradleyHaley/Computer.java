package com.BradleyHaley;

import java.util.Random;

public class Computer {

    Random rand = new Random();

    public int move(char[] placements) {
        int randomChoice;
        do {
            randomChoice = rand.nextInt(placements.length);
        } while(placements[randomChoice] != ' ');

        return randomChoice;
    }
}



