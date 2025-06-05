package Latihans.Soal1;

public class main {
    public static void main(String[] args) {
        System.out.print("Masukan Nama Player >> ");
        Sistem.P.setNama(Sistem.Scstr.nextLine());
        Sistem S = new Sistem();
        S.menuselect();
        Digimon d = new Digimon();
    }
}
