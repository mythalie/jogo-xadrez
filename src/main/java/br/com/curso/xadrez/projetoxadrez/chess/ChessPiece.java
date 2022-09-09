package br.com.curso.xadrez.projetoxadrez.chess;

import br.com.curso.xadrez.projetoxadrez.boardgame.Board;
import br.com.curso.xadrez.projetoxadrez.boardgame.Piece;
import br.com.curso.xadrez.projetoxadrez.boardgame.Position;
import lombok.Getter;

@Getter
public abstract class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public ChessPosition getChessPosition() {
        return ChessPosition.fromPosition(position);
    }

    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }
}
