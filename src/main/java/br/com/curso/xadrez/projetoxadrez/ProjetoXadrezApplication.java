package br.com.curso.xadrez.projetoxadrez;

import br.com.curso.xadrez.projetoxadrez.chess.ChessMatch;

public class ProjetoXadrezApplication {

	public static void main(String[] args) {

		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}

}
