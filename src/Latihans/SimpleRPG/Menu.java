package Latihans.SimpleRPG;


import Latihans.SimpleRPG.Combat.CombatSystem;
import Latihans.SimpleRPG.Combat.Enemies.BaseEnemy;

import java.util.Random;
import java.util.Scanner;

public class Menu {
    public static Scanner Sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void Menu (Player P, Backpack Bag){
        gamesss:
        while (true) {
            if (Player.IsLevelUp(P)){
                Player.LevelUp(P);
            }
            System.out.println("=== " + P.getName() + " ===");
            System.out.println("1. view Stats");
            System.out.println("2. View BackPack");
            System.out.println("3. Explore");
            System.out.println("4. Train");
            System.out.println("5. Travel To City");
            System.out.print(">> ");
            int pilih = Sc.nextInt();
            switch (pilih){
                case 1:
                    Player.ViewStat(P);
                    break;
                case 2:
                    Backpack.ShowBag(Bag.getBag(), Bag);
                    break;
                case 3:
                    int chance = rand.nextInt(1,100);
                     if (chance > 0 && chance <= 50){
                         System.out.println("you went into the Forest Too only find Some Fresh Air");
                     }else if (chance > 50 && chance <= 100){
                         CombatSystem.encounter(P,Bag);
                     }
                    break;
                case 4:
                    break;
                case 5:
                    City.CityView(P, Bag);
                    break;
                case 6:
                  P.setExp(P.getExp() + 1000);
                    break;
                case 7:
                    P.setExp(P.getExp() + 10000);
                    break;
                case 8:
                    P.setLevel(21);
                    break;
                case 0:
                    System.out.println("GAME OVER");
                    break gamesss;
                default:
                    System.out.println("theres no Action for that");
                    return;
            }
        }
    }
}

//30
//70
//55
