package com.BradleyHaley;

public class Game {
    private char[][] board = {
            {' ','|',' ','|',' '},
            {'-','+','-','+','-'},
            {' ','|',' ','|',' '},
            {'-','+','-','+','-'},
            {' ','|',' ','|',' '}
    };
    private char[] placements = {' ',' ',' ',' ',' ',' ',' ',' ',' '};

    public char[][] getBoard() {
        return this.board;
    }

    public char[] getPlacements() {
        return this.placements;
    }

    public boolean isOver() {
        return false;
    }

    public void printBoard() {
        int count = 0;
        for (char[] row : this.board) {
            for(char col : row) {
                if (col == ' ') {
                    System.out.print(this.placements[count]);
                    count++;
                } else {
                    System.out.print(col);
                }
            }
            System.out.println();
        }
    }

    public void showOptions() {
        int count = 1;
        for (char[] row : this.board) {
            for (char col : row) {
                if (col == ' ') {
                    System.out.print(count);;
                    count++;
                } else {
                    System.out.print(col);
                }
            }
            System.out.println();
        }
    }

    public void placePosition(int position, char XorO) {
        this.placements[position-1] = XorO;
//        int count = 1;
//        for (char[] row : this.board) {
//            for (char col : row) {
//                if (col == ' ' && count == position) {
//                    col = 'X';
//                    count++;
//                } else if (col == ' ') {
//                    count++;
//                }
//                System.out.print(col);
//            }
//            System.out.println();
//        }
    }




}
