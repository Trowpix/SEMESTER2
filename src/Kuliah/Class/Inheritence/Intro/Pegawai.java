package Kuliah.Class.Inheritence.Intro;

public class Pegawai {
    private String Nama;
    private Integer Nip;
    private String TglLahir;

    public Pegawai(String nama, Integer nip, String tglLahir) {
        Nama = nama;
        Nip = nip;
        TglLahir = tglLahir;
    }
    public Pegawai() {
        Nama = "";
        Nip = 123456789;
        TglLahir = "- - -";
    }

    public String getTglLahir() {
        return TglLahir;
    }

    public void setTglLahir(String tglLahir) {
        TglLahir = tglLahir;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public Integer getNip() {
        return Nip;
    }

    public void setNip(Integer nip) {
        Nip = nip;
    }

    public void Display(){
        System.out.println("nama: " + getNama());
        System.out.println("NIP : " + getNip());
    }
    public void HitungGaji(){

    }
}
