package br.com.curso.xadrez.projetoxadrez.boardgame;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Position {
    private int row;
    private int column;

    @Override
    public String toString() {
        return row + ", " + column;
    }
}
