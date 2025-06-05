package Kuliah.Praktikums.Praktikum1C.Soal2;

public class Main {
    public static void main(String[] args) {
        Employee X1 = new Employee("Asep",35);
        Employee X2 = new Employee("Udin",35);
        System.out.println(X1.Name);
        X1.AddHour(3);
        X1.CalculateSalary(1000);
        System.out.println(X2.Name);
        X2.AddHour(10);
        X2.CalculateSalary(1000);
    }
}
/*
Buat class Employee dengan atribut name, workHours (jam kerja per minggu), dan overtimeHours.
Tambahkan method:
addWorkHours(int hours): Menambah jam kerja normal. Jika melebihi 40 per minggu, kelebihannya masuk ke overtimeHours.
calculateSalary(double hourlyRate): Menghitung gaji, dengan upah lembur 1.5x upah biasa untuk overtimeHours.
 */
