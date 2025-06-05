package Latihans.Soal1.EnemyType;

import Latihans.Soal1.CombatSystem.encounter;
import Latihans.Soal1.Sistem;

public class Boss extends encounter {
    public Boss(){
        super (Sistem.acak.nextInt(70,100),21,"high");
    }
}
