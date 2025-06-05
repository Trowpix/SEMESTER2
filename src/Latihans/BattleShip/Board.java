package Latihans.BattleShip;

import java.util.ArrayList;

public class Board {
    private final ArrayList<char[][]> Ships;
    private char[][] Board;
    private int X;
    private int Y;
    private int Score;

    public Board(int x, int y) {
        Ships = new ArrayList<>();
        Board = new char[][]{{'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}};
        X = x;
        Y = y;
        Score = 0;
    }

    public Board() {
        Ships = new ArrayList<char[][]>();
        Board = new char[0][0];
        X = 0;
        Y = 0;
        Score = 0;
    }

    public ArrayList<char[][]> getShips() {
        return Ships;
    }

    public void setShips(char[][] ship) {
        Ships.add(ship);
    }

    public char[][] getBoard() {
        return Board;
    }

    public void setBoard(char[][] board) {
        Board = board;
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

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    public void PrintBoard(Board BO) {
        char[][] Bo = BO.getBoard();
        for (int A = 0; A < BO.getX(); A++) {
            for (int B = 0; B < BO.getY(); B++) {
                System.out.print(Bo[A][B] + " ");
            }
            System.out.println();
        }
    }
}
