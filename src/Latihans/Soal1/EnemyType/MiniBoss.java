package Latihans.Soal1.EnemyType;

import Latihans.Soal1.CombatSystem.encounter;
import Latihans.Soal1.Sistem;

public class MiniBoss extends encounter {
    public MiniBoss(){
        super (Sistem.acak.nextInt(40,70),14,"Middle");
    }
}
