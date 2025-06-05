package Kuliah.Praktikums.Praktikum3A;

import java.util.ArrayList;

public class Kelas {
    private String NamaRuang;
    private String Jam;
    private String Pelajaran;
    private ArrayList<MahaSiswa> Daftar =  new ArrayList<MahaSiswa>();

    public Kelas(String namaRuang,String jam, String pelajaran, ArrayList<MahaSiswa> daftar) {
        NamaRuang = namaRuang;
        Jam = jam;
        Pelajaran = pelajaran;
        Daftar = daftar;

    }

    public Kelas() {
        NamaRuang = "";
        Jam = "";
        Pelajaran = "";
        Daftar = new ArrayList<MahaSiswa>();
    }

    public ArrayList<MahaSiswa> getDaftar() {
        return Daftar;
    }

    public void setDaftar(ArrayList<MahaSiswa> daftar) {
        Daftar = daftar;
    }

    public String getNamaRuang() {
        return NamaRuang;
    }

    public void setNamaRuang(String namaRuang) {
        NamaRuang = namaRuang;
    }

    public String getPelajaran() {
        return Pelajaran;
    }

    public void setPelajaran(String pelajaran) {
        Pelajaran = pelajaran;
    }

    public String getJam() {
        return Jam;
    }

    public void setJam(String jam) {
        Jam = jam;
    }

    public void PrintKelas(){
        System.out.println("======================Course Info========================");
        System.out.println(getJam() + " || " + getNamaRuang() + " || " + getPelajaran());
        System.out.println("===========================================================");
        for (int A = 0 ; A < getDaftar().size() ; A++){
            MahaSiswa m = getDaftar().get(A);
            System.out.println(m.getNrp() + " - " + m.getNama());
        }
    }

}
