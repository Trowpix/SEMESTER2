package Kuliah.Praktikums.Praktikum1C.Intro;

public class Manusia {
    public String Nama,Gender,Ras;
    public int Umur;

    public Manusia(String gender, String nama, String ras, int umur){
        Nama = nama;
        Gender = gender;
        Ras = ras;
        Umur = umur;
    }
    public Manusia(){
        Nama = "";
        Gender = "";
        Ras = "";
        Umur = 0;
    }

    public Manusia(Manusia Orang1){
        Gender = Orang1.Gender;
        Nama = Orang1.Nama;
        Ras = Orang1.Ras;
        Umur = Orang1.Umur;
    }

    public void Berbicara (String Kata){
        System.out.println(Kata);
    }
    public void Intro (String Nama, int Umur){
        System.out.println("nama saya " + Nama + " umur " + Umur);
    }
    //bisa gini juga tanpa parameter bisa langsung pake *this*
    public void IntroAlternatif (){
        System.out.println("nama saya " + this.Nama + " umur " + this.Umur);
    }
}
