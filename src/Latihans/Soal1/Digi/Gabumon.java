package Latihans.Soal1.Digi;

import Latihans.Soal1.Digimon;

public class Gabumon extends Digimon {
    public Gabumon(String nick){
        super(1,1,2,3,10,nick,"Gabumon",false,false,true);
    }

    public Gabumon(){
        super(1,1,2,3,10,"","Gabumon",false,false,true);
    }

    public String prectiction() {
        String predict = "";
        if (getStr() > getAgi() && getStr() > getIntel()) {
            predict = "Leomon";
        } else if (getAgi() > getStr() && getAgi() > getIntel()) {
            predict = "Garurumon";
        } else if (getIntel() > getStr() && getIntel() > getAgi()){
            predict = "icemon";
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
        return "1. Soul Strike" + "\n" +
                "2. soul Chain" + "\n" +
                "3. soul Blast";
    }

    public void evolved() {
        if (getStr() >= 15 && (getAgi() < 15 && getIntel() < 15)) {
            System.out.println("Your Gabumon Evolved into A Leomon");
            setType("Leomon");
            setStr(getStr() + 14);
            setAgi(getAgi() + 7);
            setIntel(getIntel() + 7);
            setHp(getHp() + 5);
        } else if (getAgi() >= 15 && (getStr() < 15 && getIntel() < 15)) {
            System.out.println("Your Gabumon Evolved into A Garurumon");
            setType("Garurumon");
            setStr(getStr() + 7);
            setAgi(getAgi() + 14);
            setIntel(getIntel() + 14);
            setHp(getHp() + 6);
        } else if (getIntel() >= 15 && (getStr() < 15 && getAgi() < 15)){
            System.out.println("Your Gabumon Evolved into A Icemon");
            setType("Icemon");
            setStr(getStr() + 7);
            setAgi(getAgi() + 7);
            setIntel(getIntel() + 14);
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
                "class : " + getType() + "\n" +
                "Status : " + mangan + "\n" +
                "Str : " + getStr() + "\n" +
                "Agi : " + getAgi() + "\n" +
                "Int : " + getIntel() + "\n" +
                "Health : " + getHp() + "\n" +
                "Prediction : " + prectiction() + "\n" +
                "live status : " + live();
    }
}
