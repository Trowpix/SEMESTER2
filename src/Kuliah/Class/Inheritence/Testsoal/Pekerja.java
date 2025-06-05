package Kuliah.Class.Inheritence.Testsoal;

import java.util.Objects;

public class Pekerja {
    private String Id;
    private Integer Salary;
    private Integer WorkHour;

    public Pekerja(String id, Integer salary, Integer workHour) {
        Id = id;
        Salary = salary;
        WorkHour = workHour;
    }

    public Pekerja() {
        Id = "";
        Salary = 0;
        WorkHour = 0;
    }

    public String getId() {
        return Id;
    }

    public void setID(String id) {
        Id = id;
    }

    public Integer getSalary() {
        return Salary;
    }

    public void setSalary(Integer salary) {
        Salary = salary;
    }

    public Integer getWorkHour() {
        return WorkHour;
    }

    public void setWorkHour(Integer workHour) {
        WorkHour = workHour;
    }

    public int HitungGaji() {
        if (getWorkHour() > 30){
            return getSalary() * 30;
        }
        return getWorkHour() * getSalary();
    }
}
