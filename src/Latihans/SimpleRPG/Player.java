package Latihans.SimpleRPG;

public class Player {
    private String Name;
    private Integer Level,Exp,Levelup;
    private Integer Hp;
    private Integer Agi;
    private Integer Strength;
    private Integer Intel;
    private Integer Defence;
    private Integer Speed;

    public Player(String name) {
        Name = name;
        Level = 0;
        Levelup = 100;
        Exp = 0;
        Hp = 50;
        Agi = 10;
        Strength = 15;
        Intel = 10;
        Defence = 5;
        Speed = 5;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getLevel() {
        return Level;
    }

    public void setLevel(Integer level) {
        Level = level;
    }

    public Integer getLevelup() {
        return Levelup;
    }

    public void setLevelup(Integer levelup) {
        Levelup = levelup;
    }

    public Integer getExp(){
        return Exp;
    }

    public void setExp(Integer exp){
        Exp = exp;
    }

    public Integer getHp() {
        return Hp;
    }

    public void setHp(Integer hp) {
        Hp = hp;
    }

    public Integer getStrength() {
        return Strength;
    }

    public void setStrength(Integer strength) {
        Strength = strength;
    }

    public Integer getAgi() {
        return Agi;
    }

    public void setAgi(Integer agi) {
        Agi = agi;
    }

    public Integer getIntel() {
        return Intel;
    }

    public void setIntel(Integer intel) {
        Intel = intel;
    }

    public Integer getDefence() {
        return Defence;
    }

    public void setDefence(Integer defence) {
        Defence = defence;
    }

    public Integer getSpeed() {
        return Speed;
    }

    public void setSpeed(Integer speed) {
        Speed = speed;
    }

    public static void ViewStat(Player P){
        System.out.println("Name : " + P.getName());
        System.out.println("Level : " + P.getLevel());
        System.out.println("Health : " + P.getHp());
        System.out.println("Strenght : " + P.getStrength());
        System.out.println("Agility : " + P.getAgi());
        System.out.println("Intelligence : " + P.getIntel());
        System.out.println("Defence : " + P.getDefence());
        System.out.println("Speed : " + P.getSpeed());
        System.out.println("Exp : " + P.getExp() + " / " + P.getLevelup());
    }

    public static void LevelUp(Player P){
        System.out.println("You Leveled Up!!");
        System.out.println("Level : " + P.getLevel() + " ---> " + (P.getLevel()+1));
        P.setLevel(P.getLevel()+1);
        System.out.println("Health : " + P.getHp() + " ---> " + (P.getHp()+20));
        P.setHp(P.getHp()+20);
        System.out.println("Strenght : " + P.getStrength() + " ---> " + (P.getStrength()+7));
        P.setStrength(P.getAgi()+5);
        System.out.println("Agility : " + P.getAgi() + " ---> " + (P.getAgi()+5));
        P.setAgi(P.getAgi()+5);
        System.out.println("Intelligence : " + P.getIntel() + " ---> " + (P.getIntel()+3));
        P.setIntel(P.getIntel()+3);
        System.out.println("Defence : " + P.getDefence() + " ---> " + (P.getDefence()+2));
        P.setDefence(P.getDefence()+2);
        System.out.println("Speed : " + P.getSpeed() + " ---> " + (P.getSpeed()+1));
        P.setSpeed(P.getSpeed()+1);
        P.setExp(P.getExp()-P.getLevelup());
        P.setLevelup((int) (P.getLevelup() * 1.5));
        if (IsLevelUp(P)){
            LevelUp(P);
        }
    }

    public static boolean IsLevelUp(Player P){
        if (P.getExp() >= P.getLevelup()){
            return true;
        }
        return false;
    }
}
