package Latihans.Soal1.Digi;

import Latihans.Soal1.Digimon;

public class Renamon extends Digimon {
    public Renamon(String nick){
        super(1,2,1,4,15,nick,"Renamon",false,false,true);
    }

    public Renamon(){
        super(1,2,1,4,15,"","Renamon",false,false,true);
    }

    public String prectiction() {
        String predict = "";
        if (getStr() > getAgi() && getStr() > getIntel()) {
            predict = "Anubismon";
        } else if (getAgi() > getStr() && getAgi() > getIntel()) {
            predict = "Kyuubimon";
        } else if (getIntel() > getStr() && getIntel() > getAgi()){
            predict = "youkomon";
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
        return "1. Ice Bomb" + "\n" +
                "2. Fire Zone" + "\n" +
                "3. light zap";
    }

    public void evolved() {
        if (getStr() >= 15 && (getAgi() < 15 && getIntel() < 15)) {
            System.out.println("Your Renamon Evolved into A Anubismon");
            setType("Anubismon");
            setStr(getStr() + 20);
            setAgi(getAgi() + 10);
            setIntel(getIntel() + 10);
            setHp(getHp() + 4);
        } else if (getAgi() >= 15 && (getStr() < 15 && getIntel() < 15)) {
            System.out.println("Your Renamon Evolved into A Kyuubimon");
            setType("Kyuubimon");
            setStr(getStr() + 10);
            setAgi(getAgi() + 20);
            setIntel(getIntel() + 10);
            setHp(getHp() + 2);
        } else if (getIntel() >= 15 && (getStr() < 15 && getAgi() < 15)){
            System.out.println("Your Renamon Evolved into A Youkomon");
            setType("Youkomon");
            setStr(getStr() + 10);
            setAgi(getAgi() + 10);
            setIntel(getIntel() + 20);
            setHp(getHp() + 6);
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

