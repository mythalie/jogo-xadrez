package br.com.curso.xadrez.projetoxadrez;

import br.com.curso.xadrez.projetoxadrez.chess.ChessMatch;
import br.com.curso.xadrez.projetoxadrez.chess.ChessPiece;
import br.com.curso.xadrez.projetoxadrez.chess.ChessPosition;

import java.util.Scanner;

public class ProjetoXadrezApplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();

		while (true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.println("Source: ");
			ChessPosition source = UI.readChessPosition(sc);

			System.out.println();
			System.out.println("Target: ");
			ChessPosition target = UI.readChessPosition(sc);

			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}
	}

}
