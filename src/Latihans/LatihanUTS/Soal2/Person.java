package Latihans.LatihanUTS.Soal2;

public class Person {
    private String Name;
    private int Age;

    public Person(String name, int age) {
        Name = name;
        Age = age;
    }
    public Person() {
        Name = "";
        Age = 0;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
    public void Introduce(){
        System.out.println("=========================================");
        System.out.println("Name : " + getName());
        System.out.println("Usia : " + getAge());
    }
}

class Student extends Person{
    private String Id,Major;

    public Student(String name, int age, String id, String major) {
        super(name, age);
        Id = id;
        Major = major;
    }
    public Student() {
        super();
        Id = ".........";
        Major = "";
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        Major = major;
    }
    @Override
    public void Introduce(){
        super.Introduce();
        System.out.println("NRP : " + getId());
        System.out.println("Jurusan : " + getMajor());
    }
}

class Lecturer extends Person{
    private String Id,Depart;

    public Lecturer(String name, int age, String id, String depart) {
        super(name, age);
        Id = id;
        Depart = depart;
    }
    public Lecturer() {
        super();
        Id = "........";
        Depart = "";
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getDepart() {
        return Depart;
    }

    public void setDepart(String depart) {
        Depart = depart;
    }
    @Override
    public void Introduce(){
        super.Introduce();
        System.out.println("NIP : " + getId());
        System.out.println("Departemen : " + getDepart());
    }
}

