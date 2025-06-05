package Latihans.LatihanUTS.Soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        ShoppingCart SC = new ShoppingCart();
        Menu:
        while (true){
            System.out.println("1. Add Item\n" + "2. Show Cart\n" + "0. Exit");
            System.out.print(">> ");
            int pilih = Sc.nextInt();
            switch (pilih){
                case 1:
                    AddItem(SC);
                    break;
                case 2:
                    SC.ShowCart();
                    break;
                case 0:
                    break Menu;
            }
        }
    }
    public static void AddItem(ShoppingCart SC){
        Scanner Sc = new Scanner(System.in);
        System.out.println("1. Add Electronics\n" + "2. Add Clothing");
        System.out.print(">> ");
        int pilih = Sc.nextInt();
        System.out.print("Masukan Nama Produk >> " );
        String name = Sc.next();
        System.out.print("Masukan Harga Produk >> ");
        int price = Sc.nextInt();
        switch (pilih){
            case 1:
                System.out.print("Masukan Warranty (yyyy-yyyy) >> " );
                String warr = Sc.next();
                Electronic E = new Electronic(name,price,warr);
                SC.AddItem(E);
                break;
            case 2:
                System.out.print("Masukan Warna >> ");
                String col = Sc.next();
                System.out.print("Masukan ukuran >> ");
                String size = Sc.next();
                Clothing C = new Clothing(name,price,col,size);
                SC.AddItem(C);
                break;
        }
    }
}
