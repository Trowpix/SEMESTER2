package Latihans.Fisch;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Random Acak = new Random();
        System.out.print("Masukan Nama >> ");
        Player P = new Player(Sc.next());
        Menu:
        while(true){
            System.out.println("Welcome to menu pancing " + P.getName() + "\nStatus - Pemancing " + P.getLevel() +
                    "\nStatus Alat Pancing = " + P.GetPoolStatus() + "\n1. Pancing\n2. Repair Alat Pancing\n0. Exit" );
            int pilih = Sc.nextInt();
            switch (pilih){
                case 1:
                    if (P.getPoolHP() == 0){
                        System.out.println("Alat Pancing Anda Rusak");
                        break;
                    }else {
                        int ikan = Acak.nextInt(0, 3);
                        P.setPoolHP(P.getPoolHP() - 1);
                        System.out.println(ikan);
                        if (ikan == 0) {
                            int get = Acak.nextInt(1, 101);
                            System.out.println(get);
                            if (get <= P.getBC()) {
                                System.out.println("Selamat! Berhasil Mendapat Bass! +10 Gold");
                            } else {
                                System.out.println("Gagal mendapat Bass");
                            }
                        } else if (ikan == 1) {
                            int get = Acak.nextInt(1, 101);
                            System.out.println(get);
                            if (get <= P.getSC()) {
                                System.out.println("Selamat! Berhasil Mendapat Salmon! +20 Gold");
                            } else {
                                System.out.println("Gagal mendapat Salmon");
                            }
                        } else if (ikan == 2) {
                            int get = Acak.nextInt(1, 101);
                            System.out.println(get);
                            if (get <= P.getTC()) {
                                System.out.println("Selamat! Berhasil Mendapat Tuna! +50 Gold");
                            } else {
                                System.out.println("Gagal mendapat Tuna");
                            }
                        }
                    }
                    break;
                case 2:
                    if (P.getGold() < 10){
                        System.out.println("Uang Anda Tidak Cukup");
                    }else {
                        P.setPoolHP(5);
                        P.setGold(P.getGold() - 10);
                        System.out.println("Alat Pancing Berhasil Di Perbaiki");
                    }
                    break;
                case 3:
                    P.setGold(10);
                    break;
                case 0:
                    break Menu;
            }
            P.LevelUp();
        }
    }
}

