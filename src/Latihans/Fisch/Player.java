package Latihans.Fisch;

public class Player {
    private String Name,Level = "Noob";
    private int BC = 30, SC = 20, TC = 0;
    private int Gold = 20,CaughtTotal = 0,PoolHP = 5;

    public Player(String name) {
        Name = name;
    }
    public Player() {
        Name = "";
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getGold() {
        return Gold;
    }

    public void setGold(int gold) {
        Gold = gold;
    }

    public int getCaughtTotal() {
        return CaughtTotal;
    }

    public void setCaughtTotal(int caughtTotal) {
        CaughtTotal = caughtTotal;
    }

    public int getPoolHP() {
        return PoolHP;
    }

    public void setPoolHP(int poolHP) {
        PoolHP = poolHP;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String level) {
        Level = level;
    }

    public int getTC() {
        return TC;
    }

    public void setTC(int TC) {
        this.TC = TC;
    }

    public int getSC() {
        return SC;
    }

    public void setSC(int SC) {
        this.SC = SC;
    }

    public int getBC() {
        return BC;
    }

    public void setBC(int BC) {
        this.BC = BC;
    }

    public String GetPoolStatus(){
        if (getPoolHP() > 0){
            return "Baik";
        }
        return "Rusak";
    }

    void LevelUp(){
        if (getCaughtTotal() >= 10 && getCaughtTotal() < 20){
            setLevel("Beginner");
            setBC(50); setSC(40); setTC(5);
        } else if (getCaughtTotal() >= 20 && getCaughtTotal() < 25) {
            setLevel("Advanced");
            setBC(70); setSC(60); setTC(45);
        } else if (getCaughtTotal() >= 25){
            setLevel("Pro");
            setBC(100); setSC(80); setTC(60);
        }
    }
}
