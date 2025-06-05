package Kuliah.Praktikums.Praktikum3A;

public class MahaSiswa {
    private String Nama,Nrp;
    public MahaSiswa(String nrp, String nama) {
        Nrp = nrp;
        Nama = nama;
    }
    public MahaSiswa() {
        Nrp = "";
        Nama = "";
    }

    public String getNrp() {
        return Nrp;
    }

    public void setNrp(String nrp) {
        Nrp = nrp;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

}
