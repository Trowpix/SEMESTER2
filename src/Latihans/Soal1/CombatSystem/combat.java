package Latihans.Soal1.CombatSystem;

import Latihans.Soal1.Digimon;
import Latihans.Soal1.EnemyType.Boss;
import Latihans.Soal1.EnemyType.MiniBoss;
import Latihans.Soal1.EnemyType.standardenemy;
import Latihans.Soal1.Sistem;

import java.util.ArrayList;

public class combat {
    Sistem S = new Sistem();

    public void selectdigi(ArrayList<Digimon> D, encounter E) {
        if (E instanceof standardenemy) {
            System.out.println("you encountered a normal enemy");
        } else if (E instanceof MiniBoss) {
            System.out.println("you encountered a Miniboss");
        } else if (E instanceof Boss) {
            System.out.println("you encountered a boss");
        }
        System.out.println("1. try to run");
        System.out.println("2. fight");
        int run = Sistem.P.getRun();
        int plh = Sistem.Scint.nextInt();
        switch (plh) {
            case 1:
                int chance = Sistem.acak.nextInt(1, 100);
                if (chance >= 1 && chance <= run) {
                    System.out.println("you succesfully run");
                    Sistem.P.setRun(10);
                    break;
                } else {
                    System.out.println("you failed to run");
                    Sistem.P.setRun(run + 10);
                }
            case 2:
                System.out.println("Chose which digimon that will fight :");
                Sistem.P.setRun(run + 5);
                S.lifestatus(Sistem.P.getBag());
                while (true) {
                    System.out.print(">> ");
                    int pilih = Sistem.Scint.nextInt();
                    if (D.get(pilih - 1).isAlive()) {
                        battlesistem(D.get(pilih - 1), E);
                        break;
                    } else {
                        System.out.println(D.get(pilih - 1).getNickname() + " is dead, please chose a another one");
                    }
                }
                break;
        }
    }

    public void battlesistem(Digimon D, encounter E) {
        int digihp = D.getHp();
        int phydmg = D.getStr();
        int magicdmg = D.getIntel();
        int block = (int) ((int) D.getStr() * 0.5);
        int dodge = D.getAgi();
        int enemyhp = E.getHP();
        int effect = 0;
        while (enemyhp > 0 && digihp > 0) {
            boolean blockused = false;
            boolean dodgestance = false;
            boolean dodgeused = false;
            boolean enemyattacked = false;
            System.out.println("Enemy Health : " + enemyhp);
            System.out.println(D.getNickname() + " health : " + digihp);
            System.out.println("=== Choose your action ===");
            System.out.println("1. normal attack ( " + phydmg + " Damage )");
            System.out.println("2. Magic attack ( " + magicdmg + " Damage )");
            System.out.println("3. Block ( " + block + " Damage blocked )");
            System.out.println("4. dodge ( " + dodge + "% to negate damage )");
            System.out.print(">> ");
            int pilih = Sistem.Scint.nextInt();
            switch (pilih) {
                case 1:
                    enemyhp -= phydmg;
                    System.out.println("you attacked and dealt " + phydmg + " physical damage");
                    if (enemyhp > 0) {
                        System.out.println("Enemy : " + enemyhp + " Health left");
                    } else {
                        break;
                    }
                    break;
                case 2:
                    enemyhp -= magicdmg;
                    System.out.println("you attacked and dealt " + magicdmg + " magic damage");
                    if (enemyhp > 0) {
                        System.out.println(E.getClasss() + " " + enemyhp + " Health left");
                    } else {
                        break;
                    }
                    break;
                case 3:
                    System.out.println(D.getNickname() + " went into blocking stance ( " + block + " damage will be blocked )");
                    blockused = true;
                    break;
                case 4:
                    dodgeused = true;
                    int dodgechance = Sistem.acak.nextInt(1, 100);
                    if (dodgechance >= 1 && dodgechance <= dodge) {
                        dodgestance = true;
                    }
                    break;
            }
            if (enemyhp > 0) {
                if (blockused) {
                    int atk = E.getAtk() - block;
                    digihp -= atk;
                    System.out.println("Enemy attacked and dealt " + atk + " damage ( " + block + " damage blocked )");
                    enemyattacked = true;
                }
                if (dodgeused) {
                    if (dodgestance) {
                        System.out.println(D.getNickname() + " succesfully dodged the attack");
                        enemyattacked = true;
                    } else {
                        digihp -= E.getAtk();
                        System.out.println(D.getNickname() + " failed to dodge, " + E.getAtk() + " Damage taken");
                        enemyattacked = true;
                    }
                }
                if (!enemyattacked) {
                    digihp -= E.getAtk();
                    System.out.println("Enemy attacked and dealt " + E.getAtk() + " damage");
                }
            }
        }
        if (enemyhp < 1) {
            System.out.println("you won the battle");
            int uang = Sistem.P.getUang();
            if (E instanceof standardenemy) {
                System.out.println("you defeated the normal enemy and earned 100$");
                Sistem.P.setUang(uang + 100);
            } else if (E instanceof MiniBoss) {
                System.out.println("you defeated the miniboss and earned 250$");
                Sistem.P.setUang(uang + 250);
            } else if (E instanceof Boss) {
                System.out.println("you defeated the boss and earned 500$");
                Sistem.P.setUang(uang + 500);
            }
        } else {
            System.out.println("you lose the battle, " + D.getNickname() + " has died");
            D.setAlive(false);
        }
    }
}
