package Latihans.Soal1.Digi;

import Latihans.Soal1.CombatSystem.combat;
import Latihans.Soal1.CombatSystem.encounter;
import Latihans.Soal1.Digimon;
import Latihans.Soal1.Sistem;


public class Agumon extends Digimon {
    public Agumon(String nick) {
        super(2, 1, 1, 100,5,nick,"Agumon", false, false,true);
    }

    public Agumon() {
        super(2, 1, 1, 100,5, "", "Agumon", false, false,true);
    }

    public String prectiction() {
        String predict = "";
        if (getStr() > getAgi() && getStr() > getIntel()) {
            predict = "Greymon";
        } else if (getAgi() > getStr() && getAgi() > getIntel()) {
            predict = "Meramon";
        } else {
            predict = "Centarumon";
        }
        return predict;
    }
    public String live(){
        String livestat = "";
        if (isAlive()){
            livestat = "Alive";
        }else {
            livestat = "Dead";
        }
        return livestat;
    }
    public String skill(){
        return "1. Berserk" + "\n" +
                "2. Ground Slam" + "\n" +
                "3. Fissure";
    }
    public void skills(encounter E, combat C){
        skill();
        int pilih = Sistem.Scint.nextInt();
        switch (pilih){
            case 1:
        }
    }

    public void evolved() {
        if (getStr() >= 15 && (getAgi() < 15 && getIntel() < 15)) {
            System.out.println("Your Agumon Evolved into A Greymon");
            setType("Greymon");
            setStr(getStr() + 10);
            setAgi(getAgi() + 5);
            setIntel(getIntel() + 5);
            setHp(getHp() + 5);
        } else if (getAgi() >= 15 && (getStr() < 15 && getIntel() < 15)) {
            System.out.println("Your Agumon Evolved into A Meramon");
            setType("Meramon");
            setStr(getStr() + 5);
            setAgi(getAgi() + 10);
            setIntel(getIntel() + 5);
            setHp(getHp() + 6);
        } else if (getIntel() >= 15 && (getStr() < 15 && getAgi() < 15)){
            System.out.println("Your Agumon Evolved into a Centarumon");
            setType("Centarumon");
            setStr(getStr() + 5);
            setAgi(getAgi() + 5);
            setIntel(getIntel() + 10);
            setHp(getHp() + 10);
        }
    }

    public String toString() {
        String mangan;
        if (isFeed()) {
            mangan = "Already Ate";
        } else {
            mangan = "Havent Ate";
        }
        return "nickname : " + getNickname() + "\n" +
                "Class : " + getType() + "\n" +
                "Fed Status : " + mangan + "\n" +
                "Str : " + getStr() + "\n" +
                "Agi : " + getAgi() + "\n" +
                "Int : " + getIntel() + "\n" +
                "Health : " + getHp() + "\n" +
                "Prediction : " + prectiction() + "\n" +
                "Live Status : " + live();

    }
}
