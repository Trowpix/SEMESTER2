package Kuliah.Praktikums.Praktikum4A;

public class Book {
    private Publisher Pub;
    private Author Aut;
    private String Name;
    private Integer Price;

    public Book(Publisher pub, String name, Integer price) {
        Pub = pub;
        Name = name;
        Price = price;
    }

    public Book(String name, Integer price) {
        Name = name;
        Price = price;
        Pub = new Publisher(new Author());
    }

    public Book() {
        Pub = new Publisher(new Author());
        Name = "";
        Price = 0;
    }


    public Publisher getPub() {
        return Pub;
    }

    public void setPub(Publisher pub) {
        Pub = pub;
    }

    public Author getAut() {
        return Aut;
    }

    public void setAut(Author aut) {
        Aut = aut;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer price) {
        Price = price;
    }
}
