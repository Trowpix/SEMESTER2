package Kuliah.Praktikums.Praktikum3A;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int x;
        System.out.print("Kelas 1, berapa Banyak Siswa? ");
        x = Sc.nextInt();
        Kelas kelas1 = new Kelas("10.00 - 12.00", "TF001","PBO", InputMahasiswa(x));
        System.out.print("Kelas 2, berapa Banyak Siswa? ");
        x = Sc.nextInt();
        Kelas kelas2 = new Kelas("12.00 - 14.00", "TF002","AP", InputMahasiswa(x));
        System.out.print("Kelas 3, berapa Banyak Siswa? ");
        x = Sc.nextInt();
        Kelas kelas3 = new Kelas("14.00 - 16.00", "TF002","Struktur Data", InputMahasiswa(x));

        kelas1.PrintKelas();
        kelas2.PrintKelas();
        kelas3.PrintKelas();

    }
    public static ArrayList<MahaSiswa> InputMahasiswa(int x){
        Scanner Sc = new Scanner(System.in);
        ArrayList<MahaSiswa> daftar = new ArrayList<MahaSiswa>();
        System.out.println("Input Siswa-Siswa Untuk Kelas");
        for (int A = 0 ; A < x ; A++){
            MahaSiswa m = new MahaSiswa();
            m.setNama(Sc.next());
            m.setNrp(Sc.next());
            daftar.add(m);
        }
        return daftar;
    }
}
