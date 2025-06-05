package Latihans.LatihanUTS.Soal1;

public class Book {
    private String Title,Author;
    private int Year;

    public Book(String title, String author, int year) {
        Title = title;
        Author = author;
        Year = year;
    }
    public Book() {
        Title = "Buku";
        Author = "Seorang";
        Year = 1234;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }
}
