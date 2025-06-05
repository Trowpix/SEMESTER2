package Latihans.FlowerShop;

public class PotOrHias {
    private String Nama,Jenis;
    private Integer Harga;

    public PotOrHias(String nama, String jenis, Integer harga) {
        Nama = nama;
        Jenis = jenis;
        Harga = harga;
    }
    public PotOrHias() {
        Nama = "";
        Jenis = "";
        Harga = 0;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String jenis) {
        Jenis = jenis;
    }

    public Integer getHarga() {
        return Harga;
    }

    public void setHarga(Integer harga) {
        Harga = harga;
    }

}
