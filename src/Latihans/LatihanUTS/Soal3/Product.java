package Latihans.LatihanUTS.Soal3;

import java.text.NumberFormat;
import java.util.Locale;

public class Product {
    private String Name;
    private int Price;

    public Product(String name, int price) {
        Name = name;
        Price = price;
    }
    public Product() {
        Name = "";
        Price = 0;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
    public void Display(){
        NumberFormat n = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        System.out.println("Nama Produk : " + getName());
        System.out.println("Harga Produk : " + n.format(getPrice()));
    }
}

class Electronic extends Product{
    private String Warrent;

    public Electronic(String name, int price, String warrent) {
        super(name, price);
        Warrent = warrent;
    }

    public Electronic() {
        super();
        Warrent = "";
    }

    public String getWarrent() {
        return Warrent;
    }

    public void setWarrent(String warrent) {
        Warrent = warrent;
    }
    @Override
    public void Display(){
        super.Display();
        System.out.println("Jangka Warranty : " + getWarrent());
    }
}

class Clothing extends Product{
    private String Colour,Size;

    public Clothing(String name, int price, String colour, String size) {
        super(name, price);
        Colour = colour;
        Size = size;
    }

    public Clothing() {
        super();
        Colour = "";
        Size = "";
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String colour) {
        Colour = colour;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }
    public void Display(){
        super.Display();
        System.out.println("Warna : " + getColour());
        System.out.println("Ukuran : " + getSize());
    }
}
