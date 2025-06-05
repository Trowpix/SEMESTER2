package Kuliah.Praktikums.Praktikum2A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Mahasiswa M = new Mahasiswa("Singgih","A12240001");
//        System.out.print("Inputkan Nama MahaSiswa >> ");
//        String nama = Sc.next(); M.setNama(nama);
//        System.out.print("Inputkan Nrp MahaSiswa >> ");
//        String nrp = Sc.next().toUpperCase(); M.setNrp(nrp);
        M.setCourses("C1"); M.setCourses("C2"); M.setCourses("C3");
        Mahasiswa.DisplayMahasiswa(M);
        Mahasiswa.DisplayCourseSummary(M);

        M.setNrp("E12240001");
        Mahasiswa.DisplayMahasiswa(M);
        Mahasiswa.DisplayCourseSummary(M);
    }
}
