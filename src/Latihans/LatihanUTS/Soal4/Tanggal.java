package Latihans.LatihanUTS.Soal4;

public class Tanggal {
    private Integer Tgl,Bln,Thn;

    public Tanggal(Integer tgl, Integer bln, Integer thn) {
        Tgl = tgl;
        Bln = bln;
        Thn = thn;
    }
    public Tanggal() {
        Tgl = 0;
        Bln = 0;
        Thn = 0;
    }

    public Integer getTgl() {
        return Tgl;
    }

    public void setTgl(Integer tgl) {
        Tgl = tgl;
    }

    public Integer getBln() {
        return Bln;
    }

    public void setBln(Integer bln) {
        Bln = bln;
    }

    public Integer getThn() {
        return Thn;
    }

    public void setThn(Integer thn) {
        Thn = thn;
    }

    String DateSout(){
       return "Date     " + getTgl() + "-" + getBln() + "-" + getThn();
    }
    String Date(){
        return getTgl()+"-"+getBln()+"-"+getThn();
    }
}
