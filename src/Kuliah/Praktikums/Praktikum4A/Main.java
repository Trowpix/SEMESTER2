package Kuliah.Praktikums.Praktikum4A;

public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher("Sun Publication","JDSR-III4", "LA",new Author("John", "USA",42));
        Book b = new Book(publisher,"Java for Begginer",800);
        Print(b);
        System.out.println();
        Book b2 = new Book("Cara Mencuri Istri Orang", 500000);
        Print(b2);

    }
    public static void Print(Book b){
        System.out.println("Book Name: "+b.getName());
        System.out.println("Book Price: "+b.getPrice());
        System.out.println("------------Author Details----------");
        System.out.println("Auther Name: "+b.getPub().getAut().getName());
        System.out.println("Auther Age: "+ b.getPub().getAut().getAge());
        System.out.println("Auther place: "+b.getPub().getAut().getPlace());
        System.out.println("------------Publisher Details-------");
        System.out.println("Publisher Name: "+b.getPub().getName());
        System.out.println("Publisher ID: "+b.getPub().getId());
        System.out.println("Publisher City: "+b.getPub().getCity());
    }
}

/*
    Book - Author = Komposisi (Sebuah buku tidak mungkin muncul tanpa Seorang Author/penulis)
    Author - Publisher = Agregasi (Seorang author bisa menjual/mempublis bukunya tanpa bantuan sebuah perusahaan publisher)
 */