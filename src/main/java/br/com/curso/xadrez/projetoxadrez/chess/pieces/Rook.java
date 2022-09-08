package br.com.curso.xadrez.projetoxadrez.chess.pieces;

import br.com.curso.xadrez.projetoxadrez.boardgame.Board;
import br.com.curso.xadrez.projetoxadrez.chess.ChessPiece;
import br.com.curso.xadrez.projetoxadrez.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
