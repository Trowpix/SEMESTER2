package Latihans.FarmLand;

import Latihans.FarmLand.Animal.Animal;

import java.util.Random;

public class Player {
    Random Acak = new Random();
    private Character Simb = 'P';
    private int X = Acak.nextInt(6), Y = Acak.nextInt(6), Gold = 100;

    public Character getSimb() {
        return Simb;
    }

    public void setSimb(Character simb) {
        Simb = simb;
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

    public int getGold() {
        return Gold;
    }

    public void setGold(int gold) {
        Gold = gold;
    }

    public void Move(String M, Character[][] ladang, Field F) {
        int newx = getX();
        int newy = getY();
        switch (M) {
            case "W" -> newx--;
            case "A" -> newy--;
            case "S" -> newx++;
            case "D" -> newy++;
        }
        if (newx > 5 || newx < 0 || newy > 5 || newy < 0) {
            System.out.println("Move invalid");
        } else if (ladang[newx][newy] == '.') {
            ladang[X][Y] = '.';
            X = newx;
            Y = newy;
            ladang[X][Y] = 'P';
        }
    }
}