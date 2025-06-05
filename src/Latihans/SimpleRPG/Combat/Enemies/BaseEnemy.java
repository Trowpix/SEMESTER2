package Latihans.SimpleRPG.Combat.Enemies;

public class BaseEnemy {
    private Integer Health;
    private Integer Attack;
    private Integer Exp;
    private String Type;

    public BaseEnemy(Integer health, Integer attack,Integer exp, String type) {
        Health = health;
        Attack = attack;
        Type = type;
        Exp = exp;
    }

    public BaseEnemy(BaseEnemy B){
        Health = B.getHealth();
        Attack = B.getAttack();
        Type = B.getType();
        Exp = B.getExp();
    }

    public Integer getHealth() {
        return Health;
    }

    public void setHealth(Integer health) {
        Health = health;
    }

    public Integer getAttack() {
        return Attack;
    }

    public void setAttack(Integer attack) {
        Attack = attack;
    }

    public Integer getExp() {
        return Exp;
    }

    public void setExp(Integer exp) {
        Exp = exp;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
}
