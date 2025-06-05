package Kuliah.Class.Inheritence.Intro;

public class Dosen extends Pegawai{
    private String Mengajar;
    public Dosen() {
        Mengajar = "";
    }

    public Dosen(String nama, Integer nip, String tglLahir,String mengajar) {
        super(nama, nip, tglLahir);
        Mengajar = mengajar;
    }

    public String getMengajar() {
        return Mengajar;
    }

    public void setMengajar(String mengajar) {
        Mengajar = mengajar;
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println("Mengajar : " + getMengajar());
    }
}
