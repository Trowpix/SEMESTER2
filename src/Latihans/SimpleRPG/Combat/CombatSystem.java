package Latihans.SimpleRPG.Combat;

import Latihans.SimpleRPG.Backpack;
import Latihans.SimpleRPG.Combat.Enemies.BaseEnemy;
import Latihans.SimpleRPG.Combat.Enemies.EnemyType.Dragon;
import Latihans.SimpleRPG.Combat.Enemies.EnemyType.Goblin;
import Latihans.SimpleRPG.Combat.Enemies.EnemyType.HighOrc;
import Latihans.SimpleRPG.Menu;
import Latihans.SimpleRPG.Player;

public class CombatSystem {
    public static void Battle(Player P, Backpack Bag, BaseEnemy B) {
        

    }

    public static void encounter(Player P, Backpack B) {
        Goblin G = new Goblin((P.getLevel()*30));
        HighOrc O = new HighOrc((P.getLevel()*50));
        Dragon D = new Dragon((P.getLevel()*70));
        int GoblinC = 100;
        int OrcC = 0;
        int DragonC = 0;
        if (P.getLevel() <= 10) {
            for (int A = P.getLevel(); A <= P.getLevel(); A++) {
                GoblinC -= 5;
                OrcC += 5;
            }
        } else if (P.getLevel() >= 11 && P.getLevel() <= 20) {
            GoblinC = 50;
            OrcC = 50;
            for (int A = P.getLevel(); A <= P.getLevel(); A++) {
                GoblinC -= 5;
                OrcC += 4;
                DragonC += 1;
            }
            if (GoblinC == 0){
                GoblinC = 1;
            }
        } else if (P.getLevel() >= 21 && P.getLevel() <= 30) {
            GoblinC = 1;
            OrcC = 90;
            DragonC = 9;
            for (int A = P.getLevel(); A <= P.getLevel(); A++) {
                OrcC -= 5;
                DragonC += 5;
            }
        }else if (P.getLevel() >= 31 && P.getLevel() <= 40){
            GoblinC = 1;
            OrcC = 20;
            DragonC = 79;
        } else if (P.getLevel() >= 41) {
            GoblinC = 1;
            OrcC = 2;
            DragonC = 97;
        }
        int Chance = Menu.rand.nextInt(1, 100);
        if (Chance <= (GoblinC)){
            System.out.println("You Encountered A " + G.getType());
            Battle(P,B,G);
        }else if (Chance < 100-DragonC){
            System.out.println("You Encountered A " + O.getType());
            Battle(P,B,O);
        } else if (Chance >= (100-DragonC) ) {
            System.out.println("You Encountered A " + D.getType());
            Battle(P,B,D);
        }
    }
}
