package Kuliah.Praktikums.Praktikum2A;

import java.util.ArrayList;
import java.util.Scanner;

public class Mahasiswa {
    private String Nrp,Nama,Fakultas;
    private ArrayList<String> Courses = new ArrayList<>();
    private Integer Fee;

    public Mahasiswa(String nama,String nrp) {
        Nama = nama;
        Nrp = nrp;
    }

    public Mahasiswa() {
        Nama = "";
        Nrp = "";
    }

    public ArrayList<String> getCourses() {
        return Courses;
    }

    public void setCourses(String courses) {
        Courses.add(courses);
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getNrp() {
        return Nrp;
    }

    public void setNrp(String nrp) {
       Nrp = nrp;
    }

    public String getFakultas() {
        return Fakultas;
    }

    public void setFakultas(String fakultas) {
        Fakultas = fakultas;
    }

    public static void DisplayMahasiswa(Mahasiswa M){
        DetermineFaculty(M);
        System.out.println("=======================================================");
        System.out.println("Nama: " + M.getNama());
        System.out.println("Nrp : " + M.getNrp());
        System.out.println(M.getFakultas());
        System.out.println("=======================================================");

    }

    public static void DetermineFaculty(Mahasiswa M){
        String nrp = M.getNrp();
        char firstchar = nrp.charAt(0);
        String Prodi = nrp.substring(1,3);
        switch (firstchar){
            case 'A','H':
                switch (Prodi){
                    case "11":
                        M.setFakultas("Fakultas Sastra, Prodi Sastra Inggris");
                        break;
                    case "12":
                        M.setFakultas("Fakultas Sastra, Prodi Bahasa Mandarin");
                        break;
                    case "21":
                        M.setFakultas("Fakultas Sastra, Prodi Magister Sastra");
                        break;
                }
                break;
            case 'B':
                switch (Prodi){
                    case "11":
                        M.setFakultas("Fakultas Teknik, Prodi Teknik Sipil");
                        break;
                    case "12":
                        M.setFakultas("Fakultas Teknik, Prodi Arsitektur");
                        break;
                    case "21":
                        M.setFakultas("Fakultas Teknik, Prodi Magister Teknik Sipil");
                        break;
                    case "22":
                        M.setFakultas("Fakultas Teknik, Prodi Magister Arsitektur");
                        break;
                    case "31":
                        M.setFakultas("Fakultas Teknik, Prodi Doctor Teknik Sipil");
                        break;
                }
                break;
            case 'C':
                switch (Prodi){
                    case "11":
                        M.setFakultas("Fakultas TI, Prodi Teknik Electro");
                        break;
                    case "12":
                        M.setFakultas("Fakultas TI, Prodi Teknik Mesin");
                        break;
                    case "13":
                        M.setFakultas("Fakultas TI, Prodi Teknik Industri");
                        break;
                    case "14":
                        M.setFakultas("Fakultas TI, Prodi Informatika");
                        break;
                    case "21":
                        M.setFakultas("Fakultas TI, Prodi Magister teknik Industri");
                        break;
                }
                break;
            case 'D':
                switch (Prodi){
                    case "11":
                        M.setFakultas("Fakultas Business, Prodi Manajemen");
                        break;
                    case "12":
                        M.setFakultas("Fakultas Business, Prodi Akutansi");
                        break;
                    case "21":
                        M.setFakultas("Fakultas Business, Prodi MAgister Manajemen");
                        break;
                }
                break;
            case 'E':
                switch (Prodi){
                    case "11":
                        M.setFakultas("Fakultas Seni, Prodi Desain Interior");
                        break;
                    case "12":
                        M.setFakultas("Fakultas Seni, Prodi Desain Interior");
                        break;
                }
                break;
            case 'F':
                M.setFakultas("Fakultas Ilmu Komunikasi, Prodi Ilmu Komunikasi");
               break;
            case 'G':
                switch (Prodi){
                    case "11":
                        M.setFakultas("Fakultas Ilmu Pendidikan, Prodi Guru SD");
                        break;
                    case "12":
                        M.setFakultas("Fakultas Ilmu Pendidikan, Prodi Pendidikan Usia Dini");
                        break;
                }
                break;
        }
    }

    public static void DisplayCourseSummary(Mahasiswa M){
        int hargafakul = 0;
        int hargacourse = 0;
        char firstchar = M.getNrp().charAt(0);
        switch (firstchar){
            case 'A','B','C','H':
                hargafakul = 4000000;
                hargacourse = 500000;
                break;
            case 'D','E','F':
                hargafakul = 3000000;
                hargacourse = 750000;
                break;
            case 'G':
                hargafakul = 2500000;
                hargacourse = 1000000;
                break;
        }
        int total = 0;
        total += hargafakul;
        total += (M.getCourses().size() * hargacourse);
        System.out.println("================== COURSE SUMMARY ================================");
        for (int A = 0 ; A < M.getCourses().size() ; A++){
            System.out.println((A+1) + ": " + M.getCourses().get(A));
        }
        System.out.println("Total fee: " + total + ".00");
        System.out.println("=======================================================");
    }
}
