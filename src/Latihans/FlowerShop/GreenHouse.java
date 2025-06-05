package Latihans.FlowerShop;

import java.util.ArrayList;

public class GreenHouse {
    private Integer TotTanaman,TotPot;
    private ArrayList<Hias> StorHias = new ArrayList<Hias>();
    private ArrayList<Berbungan> StorBernbunga = new ArrayList<Berbungan>();
    private ArrayList<PotBunga> StorPot = new ArrayList<PotBunga>();

    public GreenHouse(int tanaman, int pot,ArrayList<Hias> storHias, ArrayList<Berbungan> storBernbunga, ArrayList<PotBunga> storPot) {
        TotTanaman = tanaman;
        TotPot = pot;
        StorHias = storHias;
        StorBernbunga = storBernbunga;
        StorPot = storPot;
    }
    public GreenHouse() {
        TotTanaman = 0;
        TotPot = 0;
        StorHias = new ArrayList<Hias>();
        StorBernbunga = new ArrayList<Berbungan>();
        StorPot = new ArrayList<PotBunga>();
    }

    public ArrayList<Hias> getStorHias() {
        return StorHias;
    }

    public void setStorHias(ArrayList<Hias> storHias) {
        StorHias = storHias;
    }

    public ArrayList<Berbungan> getStorBernbunga() {
        return StorBernbunga;
    }

    public void setStorBernbunga(ArrayList<Berbungan> storBernbunga) {
        StorBernbunga = storBernbunga;
    }

    public ArrayList<PotBunga> getStorPot() {
        return StorPot;
    }

    public void setStorPot(ArrayList<PotBunga> storPot) {
        StorPot = storPot;
    }

    public Integer getTotTanaman() {
        return TotTanaman;
    }

    public void setTotTanaman(Integer totTanaman) {
        TotTanaman = totTanaman;
    }

    public Integer getTotPot() {
        return TotPot;
    }

    public void setTotPot(Integer totPot) {
        TotPot = totPot;
    }

}
