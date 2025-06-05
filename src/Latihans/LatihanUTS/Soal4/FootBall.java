package Latihans.LatihanUTS.Soal4;

import java.util.ArrayList;

public class FootBall extends OlahRaga {
    private String Team1,Team2;
    private Integer Scor1,Scor2;

    public FootBall(String comp, int tgl, int bln, int thn, String team1, String team2, Integer scor1, Integer scor2) {
        super(comp, tgl, bln, thn);
        Team1 = team1;
        Team2 = team2;
        Scor1 = scor1;
        Scor2 = scor2;
    }

    public FootBall() {
        super();
        Team1 = "";
        Team2 = "";
        Scor1 = 0;
        Scor2 = 0;
    }

    public String getTeam1() {
        return Team1;
    }

    public void setTeam1(String team1) {
        Team1 = team1;
    }

    public String getTeam2() {
        return Team2;
    }

    public void setTeam2(String team2) {
        Team2 = team2;
    }

    public Integer getScor1() {
        return Scor1;
    }

    public void setScor1(Integer scor1) {
        Scor1 = scor1;
    }

    public Integer getScor2() {
        return Scor2;
    }

    public void setScor2(Integer scor2) {
        Scor2 = scor2;
    }

    @Override
    void Display(){
        super.Display();
        System.out.println(getTeam1() + "    " + getScor1());
        System.out.println(getTeam2() + "    " + getScor2());
    }
}
