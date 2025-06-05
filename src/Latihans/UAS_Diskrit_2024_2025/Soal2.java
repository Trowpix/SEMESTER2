package Latihans.UAS_Diskrit_2024_2025;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Initial money >> ");
        int money = Sc.nextInt();
        System.out.print("Available farmland plots >> ");
        int plots = Sc.nextInt();
        System.out.print("Price corn seed per plot >> ");
        int cornbuy = Sc.nextInt();
        System.out.print("Price sweet potato seed per plot >> ");
        int potatobuy = Sc.nextInt();
        System.out.print("Corn selling revenue per plot >> ");
        int cornsell = Sc.nextInt();
        System.out.print("Sweet potato selling revenue per plot >> ");
        int potatosell = Sc.nextInt();
        System.out.print("Available corn seed per plot in stock >> ");
        int cornX = Sc.nextInt();
        System.out.print("Available sweet potato seed per plot in stock >> ");
        int potatoX = Sc.nextInt();
        System.out.println();

        int cornpurc = 0;
        int potatopurc = 0;

        while (true) {
            if (plots - cornX <= 0) {
                cornpurc = plots;
                plots = 0;
                break;
            }
            plots -= cornX;
            cornpurc = cornX;
            int plotsleft = plots;
            if (plots - potatoX <= 0){
                plots = 0;
                potatopurc = plotsleft;
                break;
            }
            plots -= potatoX;
            potatopurc = potatobuy;
            break;
        }
        money -= (cornpurc * cornbuy) + (potatopurc * potatobuy);
        money += (cornpurc * cornsell) + (potatopurc * potatosell);
        System.out.println("Purchasing corn: " + cornpurc + " plots for $" + cornpurc*cornbuy);
        System.out.println("Purchasing Sweet Potato: " + potatopurc + " plots for $" + potatopurc*potatobuy);
        System.out.println("Remaining farmland: " + plots + " plots" );
        System.out.println("Total money after harvest: $" + money );
    }
}
/*
Farm Investment Optimization (35 points)
You are helping a farmer optimize their investment in corn and sweet potato farming. You
need to purchase such that you get maximum revenue as long as your money and available
farmland plots are available.
Input:
The program should accept the following inputs, each on a new line:
- Initial money (integer in dollars)
- Available farmland plots (integer)
- Price corn seed per plot (integer in dollars)
- Price sweet potato seed per plot (integer in dollars)
- Corn selling revenue per plot (integer in dollars)
- Sweet potato selling revenue per plot (integer in dollars)
- Available corn seed per plot in stock (integer)
- Available sweet potato seed per plot in stock (integer)
Output:
For each investment decision, the program should output:
- The type of crop being purchased
- Remaining farmland
- Total potential money after harvest
input :
1000
20
10
15
200
100
15
15
output :
"Purchasing corn: 15 plots for $150"
"Purchasing sweet potato: 5 plots for $75"
"Remaining farmland: 0 plots"
"Total money after harvest: $4225"
 */