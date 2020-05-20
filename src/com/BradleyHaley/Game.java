package com.BradleyHaley;

public class Game {
    private char[][] board = {
            {' ','|',' ','|',' '},
            {'-','+','-','+','-'},
            {' ','|',' ','|',' '},
            {'-','+','-','+','-'},
            {' ','|',' ','|',' '}
    };

    public char[][] getBoard() {
        return board;
    }

    public boolean over() {
        return false;
    }

    public void printBoard(char[][] board) {
        for (char[] row : board) {
            for(char col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public void showOptions(char[][] board) {
        int count = 1;
        for (char[] row : board) {
            for (char col : row) {
                if (col == ' ') {
                    col = (char)count;
                    count++;
                }
                System.out.print(col);
            }
            System.out.println();
        }
    }




}
