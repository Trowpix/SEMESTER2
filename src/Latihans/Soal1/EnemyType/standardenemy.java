package Latihans.Soal1.EnemyType;

import Latihans.Soal1.CombatSystem.encounter;
import Latihans.Soal1.Sistem;

public class standardenemy extends encounter {
    public standardenemy(){
        super (Sistem.acak.nextInt(15,35),7,"normal");
    }
}
