package Latihans.SimpleRPG;

public class City {
    public static void CityView(Player P, Backpack Bag) {
        while (true) {
            System.out.println("Welcome to the City");
            System.out.println("1. go to shopping center");
            System.out.println("2. go to Fountain Of Life");
            System.out.println("0. return");
            System.out.print(">> ");
            int travel = Menu.Sc.nextInt();
            switch (travel) {
                case 1:
                    viewshop(Bag);
                    break;
                case 2:
                    FoL(P,Bag);
                    break;
                case 0:
                    return;
            }
        }
    }

    public static void viewshop(Backpack Bag) {
        while (true) {
            System.out.println("1. Potion Of Healing (50g)");
            System.out.println("2. Potion Of Strength (200g)");
            System.out.println("3. Potion Of Swiftness (150g)");
            System.out.println("4. Potion of IronSkin (175g)");
            System.out.println("5. Corrosive Potion (225g)");
            System.out.println("0. Return");
            int pilih = Menu.Sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("You Bought A Potion Of Healing");
                    Bag.setBag("Potion Of Healing");
                    Bag.setGold((Bag.getGold() - 50));
                    break;
                case 2:
                    System.out.println("You Bought A Potion Of Strength");
                    Bag.setBag("Potion Of Strength");
                    Bag.setGold((Bag.getGold() - 200));
                    break;
                case 3:
                    System.out.println("You Bought A Potion Of Swiftness");
                    Bag.setBag("Potion Of Swiftness");
                    Bag.setGold((Bag.getGold() - 150));
                    break;
                case 4:
                    System.out.println("You Bought A Potion of IronSkin");
                    Bag.setBag("Potion of IronSkin");
                    Bag.setGold((Bag.getGold() - 175));
                    break;
                case 5:
                    System.out.println("You Bought A Corrosive Potion");
                    Bag.setBag("Corrosive Potion");
                    Bag.setGold((Bag.getGold() - 225));
                    break;
                case 0:
                    System.out.println("Leaving Shop");
                    return;
                default:
                    System.out.println("Theres no such Item Option....");
            }
            System.out.println("Continue Shopping?");
            System.out.println("1. yes");
            System.out.println("2. no");
            pilih = Menu.Sc.nextInt();
            switch (pilih) {
                case 1:
                    continue;
                case 2:
                    System.out.println("Comeback next time...");
                    return;
            }
        }
    }

    public static void FoL(Player P, Backpack Bag){
        System.out.println("1. Bless Status");
        int pilih = Menu.Sc.nextInt();
        switch (pilih){
            case 1:
                break;
        }
    }
}


