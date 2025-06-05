package Kuliah.Class.Anonymus_class_Lambda;

public class AnonymusFunct {
    public static void main(String[] args) {
        Kalkulator jumlah = Integer::sum;
        Kalkulator kurang = (a, b) -> a-b;
        System.out.println(jumlah.hitung(1,2));
    }
}

interface Kalkulator{
    public int hitung(int a, int b);

}
