package Kuliah.Praktikums.Praktikum1C.Soal1;

public class Product {
    public String Name;
    public int Price,Stock;

    public Product(String name, int price, int stock){
        Name = name;
        Price = price;
        Stock = stock;
    }
    public void Purchase(int Quantity){
        if (Quantity > Stock){
            System.out.println("Stock is not enough");
            System.out.println("You tried to take " + Quantity + " out of " + Stock);
        }else {
            int oldstock = Stock;
            Stock -= Quantity;
            System.out.println("Stock : " + oldstock + " ----> " + Stock);
        }
    }
    public void ApplyDiscount(double Percentage){
        double PercentageX = Percentage/100;
        if (Percentage > 50){
            System.out.println("Diskon terlalu besar ");
        }else if (Percentage > 0 && Percentage < 51){
            int oldprice = Price;
            Price -= Price * PercentageX;
            System.out.println("Old price = " + oldprice + "\n" + "New Price = " + Price);
        }
    }
}
