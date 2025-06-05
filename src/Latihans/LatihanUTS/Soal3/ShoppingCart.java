package Latihans.LatihanUTS.Soal3;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> Cart;

    public ShoppingCart() {
        Cart = new ArrayList<>();
    }

    public ArrayList<Product> getCart() {
        return Cart;
    }

    public void setCart(Product P) {
        Cart.add(P);
    }

    void AddItem(Product P){
        setCart(P);
    }

    void ShowCart(){
        System.out.println("=========================================");
        for (Product P : Cart){
            P.Display();
        }
    }
}
