package Latihans.LatihanUTS.Soal1;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public Scanner Sc = new Scanner(System.in);
    private final ArrayList<Book> Shelf;


    public Library(){
        Shelf = new ArrayList<>();
    }

    public ArrayList<Book> getShelf() {
        return Shelf;
    }

    public void setShelf(Book B) {
        Shelf.add(B);
    }

    public void AddBook(){
        System.out.print("Masukan Title Buku >> ");Sc.nextLine();
        String title = Sc.nextLine();
        System.out.print("Masukan Nama Author >> ");
        String aut = Sc.nextLine();
        System.out.print("Masukan Tahun Terbit >> ");
        int year = Sc.nextInt();
        Book B = new Book(title,aut,year);
        setShelf(B);
        System.out.println("Buku Telah Di tambah");
    }

    public void DeleteByTitle(ArrayList<Book> S){
        if (!S.isEmpty()) {
            System.out.print("Masukan Title Buku Untuk Dihapus >> ");Sc.nextLine();
            String n = Sc.nextLine();
            boolean ada = false;
            for (Book B : S) {
                if (B.getTitle().equalsIgnoreCase(n)) {
                    System.out.println("Buku " + n + " Berhasil Di Hapus");
                    ada = true;
                }
            }
            if (!ada) {
                System.out.println("Tidak Ada Buku Dengan Title " + n);
            }
        }else {
            System.out.println("Belum Ada Buku Untuk Di Hapus");
        }
    }

    public void SearchByTitle(ArrayList<Book> S){
        if (!S.isEmpty()) {
            System.out.print("Masukan Title Buku Untuk Dicari >> "); Sc.nextLine();
            String n = Sc.nextLine();
            boolean ada = false;
            for (Book B : S) {
                if (B.getTitle().equalsIgnoreCase(n)) {
                    System.out.println("Buku Di Dapatkan");
                    DisplaySolo(B);
                }
            }
            if (!ada) {
                System.out.println("Tidak Ada Buku Dengan Title " + n);
            }
        }else {
            System.out.println("Belum Ada Buku Untuk Di Cari");
        }
    }

    public void SearchByAuthor(ArrayList<Book> S){
        if (!S.isEmpty()) {
            System.out.print("Masukan Nama Author Buku >> "); Sc.nextLine();
            String n = Sc.nextLine();
            boolean ada = false;
            for (Book B : S) {
                if (B.getAuthor().equalsIgnoreCase(n)) {
                    DisplaySolo(B);
                    ada = true;
                }
            }
            if (!ada) {
                System.out.println("Tidak Ada Author Dengan Nama " + n);
            }
        }else {
            System.out.println("Belum Ada Buku Untuk Di Cari");
        }
    }

    public void SearchByYear(ArrayList<Book> S){
        if (!S.isEmpty()) {
            System.out.print("Dari Tahun >> ");
            int awal = Sc.nextInt();
            System.out.print("Sampe Tahun >> ");
            int akhir = Sc.nextInt();
            boolean ada = false;
            for (Book B : S) {
                if (B.getYear() >= awal && B.getYear() <= akhir) {
                    DisplaySolo(B);
                    ada = true;
                }
            }
            if (!ada) {
                System.out.println("Tidak Ada Buku Dengan tahun Terbit " + awal + "-" + akhir);
            }
        }else {
            System.out.println("Belum Ada Buku Untuk Di Cari");
        }
    }

    public void DisplayAll(ArrayList<Book> S){
        for (Book B : S){
           DisplaySolo(B);
        }
    }

    public void DisplaySolo(Book B){
        System.out.println("========================================================");
        System.out.println("Title : " + B.getTitle());
        System.out.println("Author : " + B.getAuthor());
        System.out.println("Year Published : " + B.getYear());
        System.out.println("========================================================");
    }
}
