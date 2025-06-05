package Latihans.FlowerShop;

public class DataBungaBerbunga {
    private String Nama,Jenis,Warna;
    private Integer Harga;

    public DataBungaBerbunga(String nama, String jenis, String warna, Integer harga) {
        Nama = nama;
        Jenis = jenis;
        Warna = warna;
        Harga = harga;
    }

    public DataBungaBerbunga() {
        Nama = "";
        Jenis = "";
        Warna = "";
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

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String warna) {
        Warna = warna;
    }

    public Integer getHarga() {
        return Harga;
    }

    public void setHarga(Integer harga) {
        Harga = harga;
    }
}
