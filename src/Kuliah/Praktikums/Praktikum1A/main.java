package Kuliah.Praktikums.Praktikum1A;

public class main {
    public static void main(String[] args) {
        Mahasiswa S = new Mahasiswa();
        sistem sis = new sistem();
        System.out.print("Masukan NRP >> ");
        String nrp = sis.Scstr.next();
        S.setNRP(nrp);
        System.out.print("Masukan nama >> ");
        String nama = sis.Scstr.next();
        S.setNama(nama);
        System.out.print("Masukan Alamat >> ");
        String alamat = sis.Scstr.next();
        S.setAlamat(alamat);
        System.out.print("Masukan Tanggal Terbit >> ");
        int tgl = sis.Scint.nextInt();
        S.setHari(tgl);
        System.out.print("Masukan Bulan Terbit >> ");
        int bln = sis.Scint.nextInt();
        S.setBln(bln);
        int tahun = 2000;
        tahun += Integer.parseInt(String.valueOf(S.getNRP().charAt(3))) * 10;
        tahun += Integer.parseInt(String.valueOf(S.getNRP().charAt(4)));
        S.setThn(tahun);

        if (sis.validasitanggal(S)){
            sis.print(S);
        }else {
            System.out.println("Tanggal tidak valid Mohon di input lagi...");
        }
    }
}
