package Latihans.FarmLand.Animal;

import java.util.Random;

public class Animal {
    Random Acak = new Random();
    private String Type = "",Status = "Healty";
    private Character Simb = 'o';
    private int Cost = 0,Hunger = 0,Stomach = 0,Starved = 0,X = Acak.nextInt(6),Y = Acak.nextInt(6),Sell = 0,Buy = 0,Age = 0;
    private boolean Starving = false;
    private int[] Product = new int[1];

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getCost() {
        return Cost;
    }

    public void setCost(int cost) {
        Cost = cost;
    }

    public int getHunger() {
        return Hunger;
    }

    public void setHunger(int hunger) {
        Hunger = hunger;
    }

    public boolean isStarving() {
        return Starving;
    }

    public void setStarving(boolean starving) {
        Starving = starving;
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

    public int getSell() {
        return Sell;
    }

    public void setSell(int sell) {
        Sell = sell;
    }

    public int getBuy() {
        return Buy;
    }

    public void setBuy(int buy) {
        Buy = buy;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Character getSimb() {
        return Simb;
    }

    public void setSimb(Character simb) {
        Simb = simb;
    }

    public int[] getProduct() {
        return Product;
    }

    public void setProduct(int[] product) {
        Product = product;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public int getStomach() {
        return Stomach;
    }

    public void setStomach(int stomach) {
        Stomach = stomach;
    }

    public int getStarved() {
        return Starved;
    }

    public void setStarved(int starved) {
        Starved = starved;
    }
}
