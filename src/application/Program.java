package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ChessMatch chessMat = new ChessMatch();
		while (true) {
			try {
				UI.clearScreen();
				UI.printBoard(chessMat.getPieces());
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(sc);

				boolean[][] possibleMoves = chessMat.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(chessMat.getPieces(), possibleMoves);

				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(sc);

				ChessPiece capturedPiece = chessMat.performChessMove(source, target);
			} catch (ChessException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
				sc.nextLine();

			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
				sc.nextLine();

			}
		}
	}

}
