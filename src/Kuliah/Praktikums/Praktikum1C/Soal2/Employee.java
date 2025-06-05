package Kuliah.Praktikums.Praktikum1C.Soal2;

public class Employee {
    public String Name;
    public int JamN,JamO = 0;

    public Employee(String name, int jam){
        Name = name;
        JamN = jam;
    }
    public void AddHour(int Hour){
        if (Hour + JamN > 40){
            int over = Hour + JamN - 40;
            JamO += over;
            System.out.println("Jam Berlebihan, " + over + " jam Ditambahkan ke OverTimeHours");
        }else {
            JamN += Hour;
            System.out.println(Hour + " Ditambahkan ke Jam Kerja");
        }
    }
    public void CalculateSalary(double HourRate){
        double gaji = 0;
        gaji += JamN * HourRate;
        gaji += JamO * (HourRate * 1.5);
        System.out.println("gaji : " + gaji);
    }
}
