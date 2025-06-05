package Latihans.Soal1.CombatSystem;

public class encounter {
    private int HP,Atk;
    private String Class;

    public encounter(int HP, int atk, String aClass) {
        this.HP = HP;
        Atk = atk;
        Class = aClass;
    }
    public encounter() {
        this.HP = 0;
        Atk = 0;
        Class = "";
    }

    public String getClasss() {
        return Class;
    }

    public void setClasss(String aClass) {
        Class = aClass;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAtk() {
        return Atk;
    }

    public void setAtk(int atk) {
        Atk = atk;
    }
}
