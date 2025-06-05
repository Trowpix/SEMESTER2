package Kuliah.Praktikums.Praktikum6A;

public class Kendaraan {
    private String NamaKen;
    private Integer KapEner;
    private double TotJarak = 0;

    public Kendaraan(String namaKen, Integer kapEner) {
        NamaKen = namaKen;
        KapEner = kapEner;
    }

    public Kendaraan() {
        NamaKen = "";
        KapEner = 0;
    }

    public Kendaraan(String namaKen) {
        NamaKen = namaKen;
    }

    public String getNamaKen() {
        return NamaKen;
    }

    public void setNamaKen(String namaKen) {
        NamaKen = namaKen;
    }

    public Integer getKapEner() {
        return KapEner;
    }

    public void setKapEner(Integer kapEner) {
        KapEner = kapEner;
    }

    public double getTotJarak() {
        return TotJarak;
    }

    public void setTotJarak(double totJarak) {
        TotJarak = totJarak;
    }

    void GunakanEnergi() {
        setKapEner(getKapEner() - 1);
    }

    double HitungKecepatan() {
        return 0;
    }

    boolean MasihBisaJalan() {
        return getKapEner() > 0;
    }

    double GetTotJarak() {
        return HitungKecepatan();
    }
}

class Listrik extends Kendaraan {

    public Listrik(String namaKen, Integer kapEner) {
        super(namaKen, kapEner);
    }

    public Listrik() {
    }

    @Override
    double HitungKecepatan() {
        return 1.2 * getKapEner();
    }

    @Override
    void GunakanEnergi() {
        setKapEner(getKapEner() - 5);
    }
}

class Bensin extends Kendaraan {
    public Bensin(String namaKen, Integer kapEner) {
        super(namaKen, kapEner);
    }

    public Bensin() {
    }

    @Override
    double HitungKecepatan() {
        return 0.8 * getKapEner();
    }

    @Override
    void GunakanEnergi() {
        setKapEner(getKapEner() - 3);
    }
}

class Hybrid extends Kendaraan {
    private int Ben, Lis;

    public Hybrid(String namaKen, int ben, int lis) {
        super(namaKen);
        Ben = ben;
        Lis = lis;
    }

    public Hybrid() {
        super();
        Ben = 0;
        Lis = 0;
    }

    public int getBen() {
        return Ben;
    }

    public void setBen(int ben) {
        Ben = ben;
    }

    public int getLis() {
        return Lis;
    }

    public void setLis(int lis) {
        Lis = lis;
    }

    @Override
    double HitungKecepatan() {
        if (GetMode().equals("Mode Listrik")) {
            return 1.2 * getLis();
        }
        if (GetMode().equals("Mode Bensin")) {
            return 0.8 * getBen();
        }
        return 0;
    }

    @Override
    void GunakanEnergi() {
        if (GetMode().equals("Mode Listrik")) {
            setLis(getLis() - 5);
        } else if (GetMode().equals("Mode Bensin")) {
            setBen(getBen() - 3);
        }
    }

    String GetMode() {
        if (getLis() >= getBen()) {
            return "Mode Listrik";
        }
        return "Mode Bensin";
    }

    boolean MasihBisaJalan() {
        return getLis() > 0 || getBen() > 0;
    }
}
