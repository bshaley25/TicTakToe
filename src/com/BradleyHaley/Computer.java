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
                Game game = new Game();
                char[] copyPlacements = recreateGame(game, placements);
                int score = minimax(i, copyPlacements,true, game);
                if (score > bestScore) {
                    bestScore = score;
                    bestMove = i;
                }
            }
        }


        return bestMove;
    }

    private static int minimax(int placement, char [] placements, boolean isMaximizing, Game game) {

        int score = 0;

        if(isMaximizing && game.isWon()){
            return 1;
        } else if(!isMaximizing && game.isWon()) {
            return -1;
        } else if(game.isTie()) {
            return 0;
        }

        if(isMaximizing) {
            game.placeComputerPosition(placement,'O');
            for( char i=0; i < placements.length; i++) {
                if (placements[i] == ' ' ) {
                    score += minimax(i, placements, false, game);
                }
            }
        } else {
            game.placeUserPosition(placement+1,'X');
            System.out.println(Arrays.toString(placements));
            if(game.isWon()) {

            }

            for( char i=0; i < placements.length; i++) {
                if (placements[i] == ' ' ) {
                    score += minimax(i, placements, true, game);
                }
            }
        }

        return score;

    }

    private static void possibleMoves() {

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



