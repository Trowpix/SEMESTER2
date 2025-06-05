package Latihans.SimpleRPG;

import java.util.ArrayList;

public class Backpack {
    private ArrayList<String> Bag = new ArrayList<>();
    private Integer Gold;

    public Backpack(Integer gold) {
        Gold = gold;
    }

    public Integer getGold() {
        return Gold;
    }

    public void setGold(Integer gold) {
        Gold = gold;
    }

    public ArrayList<String> getBag() {
        return Bag;
    }

    public void setBag(String bag) {
        Bag.add(bag);
    }

    public static void ShowBag(ArrayList<String> BagI, Backpack Bag){
        System.out.println("Gold : " + Bag.getGold());
        if (BagI.isEmpty()){
            System.out.println("Items : ---");
        }else {
            System.out.println("Items : ");
            for (int A = 0; A < BagI.size(); A++) {
                System.out.println((A + 1) + ". " + BagI.get(A));
            }
        }
    }
}
