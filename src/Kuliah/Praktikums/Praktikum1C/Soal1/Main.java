package Kuliah.Praktikums.Praktikum1C.Soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Product X1 = new Product("Meth",1000,10);
        Product X2 = new Product("Cocaine",1000,10);

        System.out.println(X1.Name);
        X1.Purchase(5);
        X1.ApplyDiscount(25.0);
        System.out.println(X2.Name);
        X2.Purchase(11);
        X2.ApplyDiscount(60.0);

    }
}
/*
Buat class Product dengan atribut name, price, dan stock.
Tambahkan method:
purchase(int quantity): Mengurangi stok jika cukup. Jika tidak, tampilkan pesan "Stok tidak cukup".
applyDiscount(double percentage): Mengurangi harga sesuai persentase diskon. Jika lebih dari 50%, tampilkan pesan "Diskon terlalu besar"

 */