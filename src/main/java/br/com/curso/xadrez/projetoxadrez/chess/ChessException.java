package br.com.curso.xadrez.projetoxadrez.chess;

import br.com.curso.xadrez.projetoxadrez.boardgame.BoardException;

public class ChessException extends BoardException {
    private static final long serialVersionUID = 1L;

    public ChessException(String msg) {
        super(msg);
    }
}
