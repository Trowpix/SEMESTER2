package Kuliah.Class.Inheritence.Testsoal;

public class Admin extends Pekerja {
    public Admin(String id, Integer salary, Integer workHour) {
        super(id, salary, workHour);
    }

    @Override
    public int HitungGaji() {
        int total = super.HitungGaji();
        if (getWorkHour() > 30){
            int lebih = getWorkHour() % 30;
            total += (getSalary() + 5000) * lebih;
            return total;
        }
        return total;
    }
}
