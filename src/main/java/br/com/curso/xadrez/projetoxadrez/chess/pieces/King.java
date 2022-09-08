package br.com.curso.xadrez.projetoxadrez.chess.pieces;

import br.com.curso.xadrez.projetoxadrez.boardgame.Board;
import br.com.curso.xadrez.projetoxadrez.chess.ChessPiece;
import br.com.curso.xadrez.projetoxadrez.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
