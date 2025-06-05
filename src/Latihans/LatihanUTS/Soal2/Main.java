package Latihans.LatihanUTS.Soal2;

import Latihans.Soal1.Sistem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        ArrayList<Person> Sistem = new ArrayList<>();
        Menu:
        while (true) {
            System.out.println("1. Tambah Data \n" + "2. Delete Data \n" + "3. Introduce Semua \n" + "0. Exit");
            System.out.print(">> ");
            int pilih = Sc.nextInt();
            switch (pilih) {
                case 1:
                    TambahData(Sistem);
                    break;
                case 2:
                    HapusData(Sistem);
                    break;
                case 3:
                    ShowData(Sistem);
                    break;
                case 0:
                    break Menu;
            }
        }
        System.out.println("Bye Bye");
    }

    public static void TambahData(ArrayList<Person> Sis) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("1. Tambah Person \n" + "2. Tambah Student \n" + "3. Tambah Lecturer");
        System.out.print(">> ");
        int pilih = Sc.nextInt();
        System.out.print("Masukan Nama >> ");Sc.nextLine();
        String nama = Sc.nextLine();
        System.out.print("Masukan Usia >>  ");
        int usia = Sc.nextInt();
        switch (pilih) {
            case 1:
                Person P = new Person(nama, usia);
                Sis.add(P);
                break;
            case 2:
                System.out.print("Masukan NRP >> ");
                String nrp = Sc.next();
                System.out.print("Masukan Jurusan >> ");
                String jurusan = Sc.next();
                Student S = new Student(nama, usia, nrp, jurusan);
                Sis.add(S);
                break;
            case 3:
                System.out.print("Masukan NIP >> ");
                String nip = Sc.next();
                System.out.print("Masukan Departemen >> ");
                String depart = Sc.next();
                Lecturer L = new Lecturer(nama, usia, nip, depart);
                Sis.add(L);
                break;
        }
    }

    public static void HapusData(ArrayList<Person> Sis) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Masukan ID orang Yang Ingin di hapus >> ");
        String x = Sc.next();
        boolean removed = Sis.removeIf(p ->
                (p instanceof Student && ((Student) p).getId().equalsIgnoreCase(x)) ||
                        (p instanceof Lecturer && ((Lecturer) p).getId().equalsIgnoreCase(x)));
        if (!removed) {
            System.out.println("Tidak Ada ID yang Cocok di sistem");
        }else {
            System.out.println("Data Berhasil Dihapus");
        }
    }

    public static void ShowData(ArrayList<Person> Sis) {
        for (Person P : Sis) {
            if (!(P instanceof Student) && !(P instanceof Lecturer)) {
                P.Introduce();
            }
        }
        for (Person P : Sis) {
            if (P instanceof Student) {
                P.Introduce();
            }
        }
        for (Person P : Sis) {
            if (P instanceof Lecturer) {
                P.Introduce();
            }
        }
    }
}
