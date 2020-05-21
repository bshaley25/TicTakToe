package com.BradleyHaley;

import java.util.Random;

public class Computer {

    static Random rand = new Random();

    public int move(char[] placements) {

        int guess;
        do {
            guess = guess();
        } while (placements[guess] != ' ');

        return guess;
    }

    public static int guess() {
        return rand.nextInt(9);
    }
}



