package Latihans.BattleShip;

import java.util.Random;

public class Ship {
     private char[][] Build;
     private int X,Y;

    public Ship() {
        Random rd = new Random();
        X = rd.nextInt(1,8);
        Y = rd.nextInt(1,8);
        Build = new char[][]{{'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}};
    }

    public char[][] getBuild() {
        return Build;
    }

    public void setBuild(char[][] build) {
        Build = build;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }
}
