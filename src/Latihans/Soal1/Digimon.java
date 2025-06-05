package Latihans.Soal1;

public class Digimon {
    private int str,agi,intel,hp,mana;
    private String nickname;
    private String type;
    private boolean feed;
    private boolean evolved;
    private boolean alive;
    public Digimon() {
        this.agi = 0;
        this.str = 0;
        this.intel = 0;
        this.hp = 0;
        this.mana =0;
        this.nickname = "";
        this.type = "";
        this.feed = false;
        this.evolved = false;
        this.alive = true;
    }

    public Digimon(int str, int agi, int intel, int hp,int mana, String nickname,String type, boolean feed, boolean evolved, boolean alive) {
        this.agi = agi;
        this.str = str;
        this.intel = intel;
        this.hp = hp;
        this.mana = mana;
        this.nickname = nickname;
        this.type = type;
        this.feed = feed;
        this.evolved = evolved;
        this.alive = alive;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getAgi() {
        return agi;
    }

    public void setAgi(int agi) {
        this.agi = agi;
    }

    public int getIntel() {
        return intel;
    }

    public void setIntel(int intel) {
        this.intel = intel;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isFeed() {
        return feed;
    }

    public void setFeed(boolean feed) {
        this.feed = feed;
    }

    public boolean isEvolved() {
        return evolved;
    }

    public void setEvolved(boolean evolved) {
        this.evolved = evolved;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }


}
