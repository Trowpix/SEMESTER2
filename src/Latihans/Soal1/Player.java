package Latihans.Soal1;

import java.util.ArrayList;

public class Player {
    private int uang;
    private int run;
    private String nama;
    private ArrayList<Digimon> bag = new ArrayList<>();

    public Player() {
        this.uang = 2000;
        this.nama = "**";
        this.run = 10;
    }

    public Player(int uang, String nama,int run) {
        this.uang = uang;
        this.nama = nama;
        this.run = run;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUang() {
        return uang;
    }

    public void setUang(int uang) {
        this.uang = uang;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public ArrayList<Digimon> getBag() {
        return bag;
    }

    public void setBag(Digimon baru) {
        bag.add(baru);
    }
}
