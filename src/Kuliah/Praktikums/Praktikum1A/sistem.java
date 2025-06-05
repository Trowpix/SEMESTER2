package Kuliah.Praktikums.Praktikum1A;

import java.util.Scanner;

public class sistem {
    public Scanner Scint = new Scanner(System.in);
    public Scanner Scstr = new Scanner(System.in);

    public boolean validasitanggal(Mahasiswa S) {
        if (S.getBln() > 12 || S.getHari() > 31) {
            return false;
        }
        if (S.getBln() == 2) {
            if (S.getThn() % 4 == 0) {
                if (S.getHari() > 29) {
                    return false;
                }
            } else if (S.getThn() % 4 != 0) {
                if (S.getHari() > 28) {
                    return false;
                }
            }
        }
        int bln = S.getBln();
        if (bln == 1 || bln == 3 || bln == 4 || bln == 7 || bln == 8 || bln == 10 || bln == 12) {
            if (S.getHari() > 31) {
                return false;
            }
        } else if (bln == 4 || bln == 6 || bln == 9 || bln == 10) {
            if (S.getHari() > 30) {
                return false;
            }
        }
        return true;
    }

    public void print(Mahasiswa S) {
        System.out.println("NRP : " + S.getNRP());
        System.out.println("Nama : " + S.getNama());
        System.out.println("Alamat : " + S.getAlamat());
        System.out.println("waktu penerbitan KTM : " + S.getHari() + "-" + S.getBln() + "-" + S.getThn());
        System.out.println("waktu Kadarluasa KTM : " + S.getHari() + "-" + S.getBln() + "-" + (S.getThn() + 5));
    }
}