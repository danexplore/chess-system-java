package application;

import chess.ChessPiece;

public class UI {

//	print board receiving a ChessPiece[][], for loop { print(8 - i + " ") 
//	for loop { printPiece(piece[i][j]) } printLine() } printLine("  a b c d e f g h") 
	public static void printBoard(ChessPiece[][] pieces) {
		for (int i = 0; i < pieces.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j = 0; j < pieces.length; j++) {
				printPiece(pieces[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
//	print piece receiving a ChessPiece, checks if the ChessPiece is null then print("-") else print(piece) 
//	after checking print(" ")
	private static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.print("-");
		}
		else System.out.print(piece);
		System.out.print(" ");
	}
}
