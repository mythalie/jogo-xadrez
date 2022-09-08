package br.com.curso.xadrez.projetoxadrez.boardgame;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Position {
    private int row;
    private int column;

    public void setValues(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString() {
        return row + ", " + column;
    }
}
