package Kuliah.Praktikums.Praktikum6A;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Kendaraan> pesertaBalapan = new ArrayList<>();
        pesertaBalapan.add(new Listrik("Tesla Model S", 30));
        pesertaBalapan.add(new Bensin("Toyota Supra", 20));
        pesertaBalapan.add(new Hybrid("Prius", 50, 40));
        pesertaBalapan.add(new Listrik("Nissan Leaf", 80));
        pesertaBalapan.add(new Bensin("Ford Mustang", 55));
        pesertaBalapan.add(new Hybrid("Hyundai Ioniq", 50, 50));
        ArrayList<Integer> keluar = new ArrayList<>();
        for (int lap = 1; lap <= 10; lap++) {
            System.out.println("\n🏁 LAP " + lap + " 🏁");
            for (Kendaraan K : pesertaBalapan) {
                double kecepatan = K.HitungKecepatan();
                if (K instanceof Listrik){
                    System.out.printf("🔋 [Listrik] %s melaju dengan kecepatan %.2f km/h%n",
                            K.getNamaKen(), kecepatan);
                }else if (K instanceof Bensin){
                    System.out.printf("⛽ [Bensin] %s melaju dengan kecepatan %.2f km/h%n",
                            K.getNamaKen(), kecepatan);
                } else if (K instanceof Hybrid) {
                    String mode = ((Hybrid) K).GetMode();
                    System.out.printf("🔄 [Hybrid - %s] %s melaju dengan kecepatan %.2f km/h%n",
                            mode, K.getNamaKen(), kecepatan);
                }
                K.GunakanEnergi();
                K.setTotJarak(K.getTotJarak() + kecepatan);
                System.out.println(K.getTotJarak());
                if (!K.MasihBisaJalan()){
                    System.out.println("🚨 " + K.getNamaKen() + " KEHABISAN ENERGI! KELUAR DARI BALAPAN.");
                    keluar.add(pesertaBalapan.indexOf(K));
                }
            }
            for (int i : keluar){
                pesertaBalapan.remove(i);
            }
            keluar.clear();
            if (pesertaBalapan.isEmpty()){
                System.out.println("\n❌ Semua kendaraan keluar dari balapan! Balapan selesai!");
                break;

            }
        }
        System.out.println("\n=== HASIL AKHIR BALAPAN ===");
        for (Kendaraan k : pesertaBalapan) {
            System.out.printf("%s masih bertahan dan menempuh total jarak %.2f km%n",
                    k.getNamaKen(), k.getTotJarak());
        }
    }
}

