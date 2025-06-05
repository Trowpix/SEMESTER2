package Kuliah.Praktikums.Praktikum5A;

public class Transportasi {
    private String Id,Asal,Tujuan;
    private Integer Tarif,Jarak;

    public Transportasi(String id, String asal, String tujuan, Integer tarif,Integer jarak) {
        Id = id;
        Asal = asal;
        Tujuan = tujuan;
        Tarif = tarif;
        Jarak = jarak;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getAsal() {
        return Asal;
    }

    public void setAsal(String asal) {
        Asal = asal;
    }

    public String getTujuan() {
        return Tujuan;
    }

    public void setTujuan(String tujuan) {
        Tujuan = tujuan;
    }

    public Integer getTarif() {
        return Tarif;
    }

    public void setTarif(Integer tarif) {
        Tarif = tarif;
    }

    public Integer getJarak() {
        return Jarak;
    }

    public void setJarak(Integer jarak) {
        Jarak = jarak;
    }
    public int HargaPerJarak(){
        return getJarak() * getTarif();
    }
    void Display(){
        System.out.println("Kode Tiket : " + getId());
        System.out.println("Dari  : " + getAsal());
        System.out.println("Ke    : " + getTujuan());
        System.out.printf("Tarif Per Km : Rp%,d%n", getTarif());
        System.out.printf("Jarak  : %.1f km%n", (double)getJarak());
    }
}

class Mobil extends Transportasi {
    private Integer Biayatol;

    public Mobil(String id, String asal, String tujuan, Integer tarif,Integer jarak, Integer biayatol) {
        super(id, asal, tujuan, tarif, jarak);
        Biayatol = biayatol;
    }

    public Integer getBiayatol() {
        return Biayatol;
    }

    public void setBiayatol(Integer biayatol) {
        Biayatol = biayatol;
    }
    @Override
    void Display(){
        super.Display();
        System.out.printf("Biaya Tol : Rp%,d%n",  getBiayatol());
        System.out.printf("Total Harga : Rp%,d%n", (super.HargaPerJarak() + getBiayatol()));
    }
}

class Pesawat extends Transportasi {
    private String Kelas;

    public Pesawat(String id, String asal, String tujuan, Integer tarif, Integer jarak, String kelas) {
        super(id, asal, tujuan, tarif, jarak);
        Kelas = kelas;
    }

    public String getKelas() {
        return Kelas;
    }

    public void setKelas(String kelas) {
        Kelas = kelas;
    }
    @Override
    void Display(){
        double biaya = super.HargaPerJarak();
        switch (getKelas().toLowerCase()){
            case "bisnis" :
                biaya *= 1.5;
                break;
            case "first class" :
                biaya *= 2.5;
                break;
        }
        if (biaya > 500000 && biaya <= 1000000){
            biaya *= 1.1;
        } else if (biaya > 1000000) {
            biaya *= 1.15;
        }
        super.Display();
        System.out.println("Kelas : " + getKelas());
        System.out.printf("Total Harga : Rp%,d%n", Math.round(biaya));
    }
}

class Kereta extends Transportasi {
    private Integer Penumpang;

    public Kereta(String id, String asal, String tujuan, Integer tarif, Integer jarak, Integer penumpang) {
        super(id, asal, tujuan, tarif, jarak);
        Penumpang = penumpang;
    }

    public Integer getPenumpang() {
        return Penumpang;
    }

    public void setPenumpang(Integer penumpang) {
        Penumpang = penumpang;
    }
    @Override
    void Display(){
        double biaya = super.HargaPerJarak() * getPenumpang();
        if (getPenumpang() > 4){
            biaya -= biaya* 0.05;
        }
        super.Display();
        System.out.println("Penumpang : " + getPenumpang());
        System.out.printf("Total Harga : Rp%,d%n", Math.round(biaya));
    }
}

class Kapal extends Transportasi{
    private double Pelabuhan;
    private int Penumpang;
    public Kapal(String id, String asal, String tujuan, Integer tarif, Integer jarak, double pelabuhan, int penumpang) {
        super(id, asal, tujuan, tarif, jarak);
        Pelabuhan = pelabuhan;
        Penumpang = penumpang;
    }

    public double getPelabuhan() {
        return Pelabuhan;
    }

    public void setPelabuhan(double pelabuhan) {
        Pelabuhan = pelabuhan;
    }
    public int getPenumpang() {
        return Penumpang;
    }

    public void setPenumpang(int penumpang) {
        Penumpang = penumpang;
    }
    @Override
    void Display(){
        double biaya = (super.HargaPerJarak()+getPelabuhan()) * getPenumpang();
        if (biaya > 500000) {
            biaya += biaya * 0.1;
        }
        super.Display();
        System.out.printf("Pelabuhan : Rp%,d%n", (int)getPelabuhan());
        System.out.println("Penumpang : " + getPenumpang());
        System.out.printf("Total Harga : Rp%,d%n", Math.round(biaya));
    }
}

