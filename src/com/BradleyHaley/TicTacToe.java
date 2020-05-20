package com.BradleyHaley;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
	// write your code here
        Game game = new Game();
        char[][] board = game.getBoard();
        Scanner scan = new Scanner(System.in);

//        while(!game.over()) {
            System.out.println("Where would you like to place a piece?");
            game.printBoard(board);
            game.showOptions(board);
//            int position = scan.nextInt();
//            Prompter.printGameBoardOptions(board, position);
//            game.printBoard();
//        }



    }


}
