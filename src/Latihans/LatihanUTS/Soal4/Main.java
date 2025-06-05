package Latihans.LatihanUTS.Soal4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        ArrayList<OlahRaga> olah = new ArrayList<>();
        olah.add(new FootBall("Premier League",19,3,2023,"Lazio","Roma",1,0));
        Menu:
        while (true) {
            System.out.println("1. Show All Football Result\n" +
                    "2. Show All Racing Result\n" +
                    "3. Query Result by Competition Name\n" +
                    "4. Query Result by Date\n" +
                    "0. Exit\n" +
                    "Choice >> ");
            int pilih = Sc.nextInt();
            switch (pilih) {
                case 1:
                    Result(olah,1);
                    break;
                case 2:
                    Result(olah,2);
                    break;
                case 3:
                    Query(olah,1);
                    break;
                case 4:
                    Query(olah,2);
                    break;
                case 0:
                    break Menu ;
            }
        }
        System.out.println("Bye-Bye");
    }

    static void Result(ArrayList<OlahRaga> OR, int type) {
        if (type == 1) {
            System.out.println("FootBall");
            for (OlahRaga or : OR) {
                System.out.println("---------------------------------------------------------------");
                if (or instanceof FootBall) {
                    or.Display();
                }
            }
        } else if (type == 2) {
            System.out.println("Racing");
            for (OlahRaga or : OR) {
                System.out.println("---------------------------------------------------------------");
                if (or instanceof Racing) {
                    or.Display();
                }
            }
        }
    }

    static void Query(ArrayList<OlahRaga> OR, int type) {
        Scanner Sc = new Scanner(System.in);
        if (type == 1) {
            System.out.println("Masukan Nama kompetisis yang ingin di cari : ");Sc.nextLine();
            String comp = Sc.nextLine().toLowerCase();
            for (OlahRaga or : OR) {
                if (or.getComp().toLowerCase().equals(comp)) {
                    or.Display();
                }
            }
        } else if (type == 2) {
            System.out.print("Masukan Tanggal kompetisis yang ingin di cari : ");
            String date = Sc.next();
            for (OlahRaga or : OR) {
                if (or.getDate().Date().equals(date)) {
                    or.Display();
                }
            }
        }
    }
}
