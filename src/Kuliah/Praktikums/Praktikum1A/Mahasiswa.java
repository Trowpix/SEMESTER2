package Kuliah.Praktikums.Praktikum1A;

public class Mahasiswa {
    private String NRP;
    private String Nama;
    private String Alamat;
    private int Hari,Bln,Thn;

    public Mahasiswa(String NRP, String nama, String alamat, int hari, int bln, int thn) {
        this.NRP = NRP;
        Nama = nama;
        Alamat = alamat;
        Hari = hari;
        Bln = bln;
        Thn = thn;

    }
    public Mahasiswa() {
        this.NRP = "";
        Nama = "";
        Alamat = "";
        Hari = 0;
        Bln = 0;
        Thn = 0;
    }
    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }

    public String getNRP() {
        return NRP;
    }

    public void setNRP(String NRP) {
        this.NRP = NRP;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }
    public int getHari() {
        return Hari;
    }

    public void setHari(int hari) {
        Hari = hari;
    }

    public int getBln() {
        return Bln;
    }

    public void setBln(int bln) {
        Bln = bln;
    }

    public int getThn() {
        return Thn;
    }

    public void setThn(int thn) {
        Thn = thn;
    }
}
