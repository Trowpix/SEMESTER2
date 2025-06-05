package Latihans.LatihanUTS.Soal4;

import java.util.ArrayList;

public class Racing extends OlahRaga{
    private final ArrayList<String> Top3;
    private final ArrayList<String> Top3Time;
    private String Race;

    public Racing(String comp, String race,int tgl, int bln, int thn, ArrayList<String> top3, ArrayList<String> top3Time) {
        super(comp, tgl, bln, thn);
        Race = race;
        Top3 = top3;
        Top3Time = top3Time;
    }

    public Racing() {
        super();
        Race = "";
        Top3 = new ArrayList<>();
        Top3Time = new ArrayList<>();
    }

    public String getRace() {
        return Race;
    }

    public void setRace(String race) {
        Race = race;
    }

    public ArrayList<String> getTop3() {
        return Top3;
    }

    public void setTop3(String name) {
        Top3.add(name);
    }

    public ArrayList<String> getTop3Time() {
        return Top3Time;
    }

    public void setTop3Time(String time) {
        Top3Time.add(time);
    }

    @Override
    void Display(){
        super.Display();
        System.out.println("Podium                                Race:        " + getRace());
        System.out.println(getTop3().get(0) + "      " + getTop3Time().get(0));
        System.out.println(getTop3().get(1) + "      " + getTop3Time().get(1));
        System.out.println(getTop3().get(2) + "      " + getTop3Time().get(3));
    }
}
