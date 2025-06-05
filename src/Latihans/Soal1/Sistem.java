package Latihans.Soal1;

import Latihans.Soal1.CombatSystem.combat;
import Latihans.Soal1.Digi.Agumon;
import Latihans.Soal1.Digi.Gabumon;
import Latihans.Soal1.Digi.Renamon;
import Latihans.Soal1.CombatSystem.encounter;
import Latihans.Soal1.EnemyType.Boss;
import Latihans.Soal1.EnemyType.MiniBoss;
import Latihans.Soal1.EnemyType.standardenemy;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Sistem {
    public static Scanner Scint = new Scanner(System.in);
    public static Scanner Scstr = new Scanner(System.in);
    public static Player P = new Player();
    public static encounter E =  new encounter();
    public static int Hari = 1;
    public static Random acak = new Random();
    public static combat C = new combat();

    void menuP() {
        System.out.println("Player Name : " + P.getNama());
        System.out.println("Banyak Digimon : " + P.getBag().size());
        System.out.println("- Hari " + Hari + " -");
        System.out.println("Uang : " + P.getUang());
        System.out.println("1. Buy Digimon");
        System.out.println("2. Train Digimon");
        System.out.println("3. Give Food");
        System.out.println("4. Revive Digimon");
        System.out.println("5. Look at Status");
        System.out.println("6. Next Day");
        System.out.println("0. Exit");
        System.out.print(">> ");
    }

    void menubeli() {
        System.out.println("1. Agumon");
        System.out.println("2. Gabumon");
        System.out.println("3. Renamon");
        System.out.println("0. Return");
        System.out.print(">> ");
        int pilih = Scint.nextInt();
        if (pilih == 0){
            return;
        }
        P.setUang(P.getUang() - 500);
        System.out.print("Berikan Nama >> ");
        String nick = Scstr.next();
        switch (pilih) {
            case 1:
                if (nick.equalsIgnoreCase("")) {
                    nick = "Agumon";

                } else {
                    Digimon A = new Agumon();
                    A.setNickname(nick);
                    P.setBag(A);
                }
                break;
            case 2:
                if (nick.equalsIgnoreCase("")) {
                    nick = "Gabumon";
                } else {
                    Digimon G = new Gabumon();
                    G.setNickname(nick);
                    P.setBag(G);
                }
                break;
            case 3:
                if (nick.equalsIgnoreCase("")) {
                    nick = "Renamon";
                } else {
                    Digimon R = new Renamon();
                    R.setNickname(nick);
                    P.setBag(R);
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    void menutrain(ArrayList<Digimon> bag) {
        System.out.println("train");
        for (int A = 0; A < bag.size(); A++) {
            System.out.println((A + 1) + ". " + bag.get(A).getNickname());
        }
        System.out.println("0. return");
        System.out.print(">> ");
        int pilih = Scint.nextInt();
        train(bag.get(pilih - 1));
    }

    void train(Digimon digi) {
        int roll;
        while (true) {
            P.setUang(P.getUang() - 50);
            System.out.println("1. Train Strength");
            System.out.println("2. Train Intelligence");
            System.out.println("3. Train Agility");
            System.out.println("0. return");
            System.out.print(">> ");
            int pilih = Scint.nextInt();
            switch (pilih) {
                case 1:
                    roll = acak.nextInt(1, 4);
                    digi.setStr(digi.getStr() + roll);
                    System.out.println("Strength + " + roll);
                    break;
                case 2:
                    roll = acak.nextInt(1, 4);
                    digi.setIntel(digi.getIntel() + roll);
                    System.out.println("Intelligence + " + roll);
                    break;
                case 3:
                    roll = acak.nextInt(1, 4);
                    digi.setAgi(digi.getAgi() + roll);
                    System.out.println("Agility + " + roll);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
            if (!digi.isEvolved()) {
                if (digi.getStr() >= 15 || digi.getIntel() >= 15 || digi.getAgi() >= 15) {
                    digi.setEvolved(true);
                    if (digi instanceof Agumon tempA) {
                        tempA.evolved();
                    } else if (digi instanceof Renamon tempR) {
                        tempR.evolved();
                    } else if (digi instanceof Gabumon tempG) {
                        tempG.evolved();
                    }
                }
            }
            System.out.println("Continue Training??");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print(">> ");
            pilih = Scint.nextInt();
            if (pilih == 1) {
                if (P.getUang() >= 50) {
                    continue;
                } else {
                    System.out.println("You dont have enought Money");
                    return;
                }
            } else {
                return;
            }
        }
    }

    void menumakan(ArrayList<Digimon> bag) {
        System.out.println("Give Food");
        for (int A = 0; A < bag.size(); A++) {
            System.out.println((A + 1) + ". " + bag.get(A).getNickname());
        }
        System.out.println("0. return");
        System.out.print(">> ");
        int pilih = Scint.nextInt();
        if (pilih == 0){
            return;
        }
        Digimon shortcut = P.getBag().get(pilih - 1);
        if (!shortcut.isFeed()){
        shortcut.setFeed(true);
        P.setUang(P.getUang() - 10);
        }else {
            System.out.println("Already Eaten");
        }
    }

    void menustatus(ArrayList<Digimon> bag) {
        System.out.println("Status");
        for (int A = 0; A < bag.size(); A++) {
            System.out.println((A + 1) + ". " + bag.get(A).getNickname());
        }
        System.out.println("0. return");
        System.out.print(">> ");
        int pilih = Scint.nextInt();
        if (pilih ==  0){
            return;
        }else {
            System.out.println(P.getBag().get(pilih - 1).toString());
        }
    }

    void GantiHari(ArrayList<Digimon> bag) {
        int plusuang = P.getUang();
        for (int A = 0; A < bag.size(); A++) {
            bag.get(A).setFeed(false);
            if (bag.get(A) instanceof Agumon temp) {
                if (bag.get(A).isEvolved()) {
                    plusuang += (int) (100 * 2.5);
                } else {
                    plusuang += 100;
                }
            } else if (bag.get(A) instanceof Gabumon) {
                if (bag.get(A).isEvolved()) {
                    plusuang += (int) (75 * 2.5);
                } else {
                    plusuang += 75;
                }
            } else {
                if (bag.get(A).isEvolved()) {
                    plusuang += (int) (150 * 2.5);
                } else {
                    plusuang += 150;
                }
            }
        }
        P.setUang(plusuang);
        Hari++;
        if (!P.getBag().isEmpty()) {
            if (cekalive(P.getBag())) {
                int chance = acak.nextInt(0, 10);
                if (chance >= 0 && chance <= 5) {
                    randomencounter(P.getBag());
                }
            }else {
                System.out.println("you encountered an enemy but you dont any digimon alive, skipping to the next");
            }
        }
    }

    void randomencounter(ArrayList<Digimon> D){
        int encounter = acak.nextInt(0,10);
        if (encounter >= 0 && encounter <= 5){
            encounter S = new standardenemy();
            C.selectdigi(D,S);
        } else if (encounter >= 6 && encounter <= 7) {
            encounter M = new MiniBoss();
            C.selectdigi(D,M);
        } else if (encounter >= 8 && encounter <= 10) {
            encounter B = new Boss();
            C.selectdigi(D,B);
        }
    }
    boolean cekalive(ArrayList<Digimon> D){
        int alive = D.size();
        for (int A = 0 ; A < D.size() ; A++){
            if (!D.get(A).isAlive()){
                alive --;
            }
        }
        return alive > 0;
    }
    public void lifestatus(ArrayList<Digimon> D){
        for (int A = 0; A < D.size(); A++) {
            if (D.get(A).isAlive()) {
                System.out.println((A + 1) + ". " + D.get(A).getNickname() + " ( ready )");
            } else {
                System.out.println((A + 1) + ". " + D.get(A).getNickname() + "( Died )");
            }
        }
    }
    void revive(){
        lifestatus(P.getBag());
        System.out.print("0. return");
        System.out.print(">> ");
        int pilih = Scint.nextInt();
        if (pilih == 0){
            return;
        }else {
            Digimon D = P.getBag().get(pilih-1);
            System.out.println(D.getNickname() + " is revived");
            D.setAlive(true);
            P.setUang(P.getUang()-100);
        }
    }

    void menuselect() {
        int pilih = -1;
        while (pilih != 0) {
            menuP();
            pilih = Scint.nextInt();
            switch (pilih) {
                case 1:
                    if (P.getUang() >= 500) {
                        menubeli();
                    } else {
                        System.out.println("You dont have enought Money to buy any digimon");
                        return;
                    }
                    break;
                case 2:
                    if (P.getUang() >= 50) {
                        menutrain(P.getBag());
                    } else {
                        System.out.println("You dont have enought Money too train");
                    }
                    break;
                case 3:
                    if (!P.getBag().isEmpty()) {
                        if (P.getUang() >= 10) {
                            menumakan(P.getBag());
                        } else {
                            System.out.println("You dont have enought Money to feed");
                        }
                    } else {
                        System.out.println("You Dont Have Any Digimon to give food too");
                    }
                    break;
                case 4:
                    if (P.getUang() >= 100) {
                        revive();
                    }else {
                        System.out.println("you dont enought money to revive");
                    }
                    break;
                case 5:
                    if (!P.getBag().isEmpty()) {
                        menustatus(P.getBag());
                    } else {
                        System.out.println("You Dont Have Any Digimon");
                    }
                    break;
                case 6:
                    GantiHari(P.getBag());
                    break;
            }
        }
        System.out.println("GAME OVER");
    }
}
