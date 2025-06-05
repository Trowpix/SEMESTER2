package Kuliah.Praktikums.Praktikum4A;

public class Publisher {
    private String Name,Id,City;
    private Author Aut;

    public Publisher(String name, String id, String city,Author aut) {
        Name = name;
        Id = id;
        City = city;
        Aut = aut;
    }

    public Publisher(Author aut) {
        Name = "";
        Id = "";
        City = "";
        Aut = new Author("","",0);
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public Author getAut() {
        return Aut;
    }

    public void setAut(Author aut) {
        Aut = aut;
    }
}

class Author {
    private String Name,Place;
    private Integer Age;

    public Author(String name, String place, Integer age) {
        Name = name;
        Place = place;
        Age = age;
    }
    public Author() {
        Name = "";
        Place = "";
        Age = 0;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPlace() {
        return Place;
    }

    public void setPlace(String place) {
        Place = place;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }
}