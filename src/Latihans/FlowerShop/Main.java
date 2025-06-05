package Latihans.FlowerShop;

import java.util.ArrayList;
import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        GreenHouse GH = getGreenHouse();
        int pilih = -1;
        while (pilih != 0) {
            System.out.print("==MENU==\n" +
                    "1. Entry Penjualan\n" +
                    "2. Laporan Hasil Penjualan\n" +
                    "3. Exit\n"+
                    "Pilih : ");
            pilih = Sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("\n==OPSI==\n" +
                            "1. Tanaman\n" +
                            "2. Pot\n" +
                            "3. Paket\n" +
                            "Pilih : ");
                    int pilih2 = Sc.nextInt();
                    switch (pilih2) {
                        case 1:
                            System.out.print("Nama :");
                            String t = Sc.nextLine();
                            String nama = Sc.nextLine();
                            System.out.print("Jenis :");
                            String jenis = Sc.nextLine();
                            if (CekSedia(GH, nama, jenis, pilih)) {
                                GH.setTotTanaman(GH.getTotTanaman() + AmbilHarga(GH, nama, jenis, pilih));
                                System.out.println(AmbilHarga(GH, nama, jenis, pilih));
                            } else {
                                System.out.println("Barang Tidak Ada");
                            }
                            break;
                        case 2:
                            System.out.print("Bentuk : ");
                            t = Sc.nextLine();
                            String bentuk = Sc.nextLine();
                            System.out.print("Ukuran : ");
                            String ukuran = Sc.nextLine();
                            if (CekSedia(GH, bentuk, ukuran, pilih)) {
                                GH.setTotPot(GH.getTotPot() + AmbilHarga(GH, bentuk, ukuran, pilih));
                            } else {
                                System.out.println("Barang Tidak Sedia");
                            }
                            break;
                        case 3:
                            System.out.println("Tanaman");
                            System.out.print("Nama : ");
                            t = Sc.nextLine();
                            String nama2 = Sc.nextLine();
                            System.out.print("Jenis : ");
                            String jenis2 = Sc.nextLine();
                            if (!CekSedia(GH, nama2, jenis2, 1)) {
                                System.out.println("barang Tidak Sedia");
                            } else {
                                System.out.print("Pot");
                                System.out.print("Bentuk : ");
                                String bentuk2 = Sc.nextLine();
                                System.out.print("Ukuran : ");
                                String ukuran2 = Sc.nextLine();
                                if (!CekSedia(GH, bentuk2, ukuran2, 2)) {
                                    System.out.println("Barang Tidak Sedia");
                                } else {
                                    int total = 0;
                                    total += AmbilHarga(GH, nama2, jenis2, 1);
                                    total += AmbilHarga(GH, bentuk2, ukuran2, 2);
                                    if (total > 50000){
                                        GH.setTotTanaman(GH.getTotTanaman() + AmbilHarga(GH, nama2, jenis2, 1));
                                        GH.setTotPot(GH.getTotPot() + (int) (AmbilHarga(GH, bentuk2, ukuran2, 2)*0.9));
                                    }else {
                                        GH.setTotTanaman(GH.getTotTanaman() + AmbilHarga(GH, nama2, jenis2, 1));
                                        GH.setTotPot(GH.getTotPot() + AmbilHarga(GH, bentuk2, ukuran2, 2));
                                    }
                                }
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Total Penjualan Tanaman : " + GH.getTotTanaman());
                    System.out.println("Total Penjualan Pot : " + GH.getTotPot());
                    break;
            }
        }
    }

    private static GreenHouse getGreenHouse() {
        ArrayList<Hias> hias = new ArrayList<>();
        ArrayList<Berbungan> bunga = new ArrayList<>();
        ArrayList<PotBunga> pot = new ArrayList<>();
        Hias lidah = new Hias("Lidah Mertua", "Sansevieria", 15000);
        Hias Baby = new Hias("baby Rubberplant", "Peperromia", 30000);
        hias.add(lidah);
        hias.add(Baby);
        Berbungan Parodia = new Berbungan("Paraodia", "Kaktus", "kuning", 20000);
        Berbungan Mawar = new Berbungan("Mawar Eden", "Mawar", "Pink", 50000);
        bunga.add(Parodia);
        bunga.add(Mawar);
        PotBunga bulat = new PotBunga("bulat", "Kecil", 10000);
        PotBunga kotak = new PotBunga("kotak", "sedang", 20000);
        PotBunga silinder = new PotBunga("silinder", "besar", 30000);
        PotBunga artistik = new PotBunga("artistik", "besar", 15000);
        PotBunga gantung = new PotBunga("gantung", "kecil", 25000);
        pot.add(bulat);
        pot.add(silinder);
        pot.add(kotak);
        pot.add(artistik);
        pot.add(gantung);
        GreenHouse GH = new GreenHouse(0, 0, hias, bunga, pot);
        return GH;
    }

    public static boolean CekSedia(GreenHouse GH, String ceknama, String cekjenis, int pilih) {
        if (pilih == 1) {
            for (int A = 0; A < GH.getStorHias().size(); A++) {
                Hias cek = GH.getStorHias().get(A);
                String nama = cek.getNama().toLowerCase();
                String jenis = cek.getJenis().toLowerCase();
                if (ceknama.toLowerCase().equals(nama) && cekjenis.toLowerCase().equals(jenis)) {
                    return true;
                }
            }
            for (int A = 0; A < GH.getStorBernbunga().size(); A++) {
                Berbungan cek = GH.getStorBernbunga().get(A);
                String nama = cek.getNama().toLowerCase();
                String jenis = cek.getJenis().toLowerCase();
                if (ceknama.toLowerCase().equals(nama) && cekjenis.toLowerCase().equals(jenis)) {
                    return true;
                }
            }
        } else if (pilih == 2) {
            for (int A = 0; A < GH.getStorBernbunga().size(); A++) {
                PotBunga cek = GH.getStorPot().get(A);
                String nama = cek.getNama().toLowerCase();
                String jenis = cek.getJenis().toLowerCase();
                if (ceknama.toLowerCase().equals(nama) && cekjenis.toLowerCase().equals(jenis)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int AmbilHarga(GreenHouse GH, String ceknama, String cekjenis, int pilih) {
        if (pilih == 1) {
            for (int A = 0; A < GH.getStorHias().size(); A++) {
                Hias cek = GH.getStorHias().get(A);
                String nama = cek.getNama().toLowerCase();
                String jenis = cek.getJenis().toLowerCase();
                if (ceknama.toLowerCase().equals(nama) && cekjenis.toLowerCase().equals(jenis)) {
                    return cek.getHarga();
                }
            }
            for (int A = 0; A < GH.getStorBernbunga().size(); A++) {
                Berbungan cek = GH.getStorBernbunga().get(A);
                String nama = cek.getNama().toLowerCase();
                String jenis = cek.getJenis().toLowerCase();
                if (ceknama.toLowerCase().equals(nama) && cekjenis.toLowerCase().equals(jenis)) {
                    return cek.getHarga();
                }
            }
        } else if (pilih == 2) {
            for (int A = 0; A < GH.getStorBernbunga().size(); A++) {
                PotBunga cek = GH.getStorPot().get(A);
                String nama = cek.getNama().toLowerCase();
                String jenis = cek.getJenis().toLowerCase();
                if (ceknama.toLowerCase().equals(nama) && cekjenis.toLowerCase().equals(jenis)) {
                    return cek.getHarga();
                }
            }
        }
        return 0;
    }
}