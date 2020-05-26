package com.BradleyHaley;

import java.util.Arrays;
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

    public int bestMove(char[] placements) {

        int bestScore = -1000;
        int bestMove = 0;
        for( char i=0; i < placements.length; i++) {
            if (placements[i] == ' ' ) {
                int score = minimax(i, placements, 0, true);
                if (score > bestScore) {
                    bestScore = score;
                    bestMove = i;
                }
            }
        }


        return bestMove;
    }

    private static int minimax(int placement, char [] placements, int depth, boolean isMaximizing) {
        Game game = new Game();
        char[] copyPlacements = recreateGame(game, placements);
//        System.out.println("placement = " + placement);

        if(isMaximizing) {
        game.placeComputerPosition(placement, 'O');
        System.out.println(Arrays.toString(game.getPlacements()));
        }

        return 1;

    }

    private static char[] recreateGame(Game game, char[] placements) {
        for (char i=0; i < placements.length; i++) {
            if(placements[i] == 'X') {
                game.placeUserPosition(i+1, 'X');
            } else if (placements[i] == 'O') {
                game.placeComputerPosition(i, 'O');
            }
        }
        return game.getPlacements();
    }


}



