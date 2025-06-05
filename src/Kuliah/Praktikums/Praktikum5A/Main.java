package Kuliah.Praktikums.Praktikum5A;

public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("M001", "Jakarta", "Bandung", 1000, 150, 50000);
        Mobil mobil2 = new Mobil("M002", "Surabaya", "Malang", 1200, 90, 0);

        Pesawat pesawat1 = new Pesawat("P003", "Jakarta", "Bali", 2000, 1000, "Ekonomi");
        Pesawat pesawat2 = new Pesawat("P004", "Jakarta", "Bali", 2000, 1000, "Bisnis");
        Pesawat pesawat3 = new Pesawat("P005", "Jakarta", "Bali", 2000, 1000, "First Class");

        Kereta kereta1 = new Kereta("K006", "Yogyakarta", "Surabaya", 500, 300, 6);
        Kereta kereta2 = new Kereta("K007", "Semarang", "Bandung", 600, 400, 10);

        Kapal kapal1 = new Kapal("KA008", "Makassar", "Manado", 800, 700, 100000, 5);
        Kapal kapal2 = new Kapal("KA009", "Batam", "Medan", 900, 800, 50000, 3 );

        mobil1.Display();
        System.out.println();
        mobil2.Display();
        System.out.println();

        pesawat1.Display();
        System.out.println();
        pesawat2.Display();
        System.out.println();
        pesawat3.Display();
        System.out.println();

        kereta1.Display();
        System.out.println();
        kereta2.Display();
        System.out.println();
        // Kapal LAwd
        kapal1.Display();
        System.out.println();
        kapal2.Display();
        System.out.println();
    }
}
