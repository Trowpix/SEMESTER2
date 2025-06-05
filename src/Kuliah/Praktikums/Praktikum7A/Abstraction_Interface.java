package Kuliah.Praktikums.Praktikum7A;

import java.util.Random;

public class Abstraction_Interface {
    public static void main(String[] args) {
        int turn = 0;
        Hero Hero = new Hero("Udin", 400);
        Monster Monster = new Monster("Dontol", 100);
        GameOn:
        while(true){
            System.out.println("Turns : " + turn);
            if (Hero.attackble(turn)){
                Monster.attacked(Hero.attack());
            } else if (Monster.attackble(turn)) {
                Hero.attacked(Monster.attack());
            }
            turn++;
            if (!Hero.isAlive() && Monster.isAlive()){
                System.out.println("Monster Won");
                break GameOn;
            }else if (Hero.isAlive() && !Monster.isAlive()) {
                System.out.println("Hero won");
                break GameOn;
            }
        }
    }
}

interface CharActions {
    public boolean attackble(int turn);
    public int attack();
    public void attacked(int damage);
}

abstract class Char implements CharActions {
    Random acak = new Random();
    private int health;
    private String name;
    private boolean IsAlive = true;

    public Char(String name, int health) {
        this.health = health;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return IsAlive;
    }

    public void setAlive(boolean alive) {
        IsAlive = alive;
    }

    @Override
    public boolean attackble(int turn) {
        return false;
    }

    @Override
    public int attack() {
        return 0;
    }

    @Override
    public void attacked(int damage) {
        setHealth(getHealth()- damage);
        if (getHealth() < 1){
            setHealth(0);
            setAlive(false);
        }
        System.out.println(getName() + " Got Attacked " + damage + ", health now is : " + getHealth());
    }
}

class Hero extends Char implements CharActions{
    public Hero(String name, int health) {
        super(name, health);
    }
    @Override
    public boolean attackble(int turn) {
        return turn % 2 == 1;
    }
    @Override
    public int attack() {
        return acak.nextInt(6,31);
    }
}

class Monster extends Char implements CharActions{
    public Monster(String name, int health) {
        super(name, health);
    }
    @Override
    public boolean attackble(int turn) {
        return turn % 2 == 0;
    }
    @Override
    public int attack() {
        return acak.nextInt(0,26);
    }
}