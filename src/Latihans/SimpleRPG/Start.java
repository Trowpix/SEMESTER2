package Latihans.SimpleRPG;

public class Start {
    public static void main(String[] args) {
        System.out.print("Hello Adventurer, Please State Your name >> ");
        String name = Menu.Sc.next();
        Player P = new Player(name);
        Backpack Bag = new Backpack(10000);
        Menu.Menu(P,Bag);
    }
}
