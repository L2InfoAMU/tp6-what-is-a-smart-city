package model;

import javafx.scene.paint.Color;

/**
 * {@link CellState} instances represent the possible states of a {@link CellState}.
 */
public enum CellState {
    ALIVERED(true, Color.RED), DEAD(false, Color.WHITE),ALIVEBLUE(true,Color.BLUE);

    public final boolean isAlive;
    public final Color color;

    CellState(boolean isAlive, Color color) {
        this.isAlive = isAlive;
        this.color = color;
    }
}
