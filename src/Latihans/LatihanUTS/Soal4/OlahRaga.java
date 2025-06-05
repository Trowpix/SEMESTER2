package Latihans.LatihanUTS.Soal4;

public class OlahRaga {
    private String Comp;
    private Tanggal Date;

    public OlahRaga(String comp,int tgl, int bln, int thn) {
        Comp = comp;
        Date = new Tanggal(tgl,bln,thn);
    }
    public OlahRaga() {
        Comp = "";
        Date = new Tanggal();
    }

    public String getComp() {
        return Comp;
    }

    public void setComp(String comp) {
        Comp = comp;
    }

    public Tanggal getDate() {
        return Date;
    }

    public void setDate(Tanggal date) {
        Date = date;
    }

    void Display(){
        System.out.println("Competition:     " + getComp() + "                         " + getDate().DateSout());
    }
}
