package com.BradleyHaley;

import javax.swing.*;
import java.io.PrintStream;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
	// write your code here
        Game game = new Game();
        Scanner scan = new Scanner(System.in);
        Computer computer = new Computer();

        while(!game.isOver()) {
            System.out.println("Where would you like to place a piece?");
//            game.showOptions();
            int UserMove = scan.nextInt();
            game.placeUserPosition(UserMove, 'X');
            if (game.isOver()) {
                break;
            }
            int computerMove = computer.move(game.getPlacements());
            game.placeComputerPosition(computerMove, 'O');
//            System.out.println(computerMove);
            game.printBoard();
        }

        System.out.printf("%s won the game!", game.getWinner());

    }


}
