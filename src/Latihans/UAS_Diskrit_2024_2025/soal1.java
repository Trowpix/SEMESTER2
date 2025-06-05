package Latihans.UAS_Diskrit_2024_2025;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Input X of Sprite >> ");
        int Xs = Sc.nextInt();
        if (!CekReal(Xs)){
            System.out.println("Bukan Real");
            Sc.close();
        }
        System.out.print("Input Y of Sprite >> ");
        int Ys = Sc.nextInt();
        if (!CekReal(Ys)){
            System.out.println("Bukan Real");
            Sc.close();
        }
        System.out.print("Input X of Target >> ");
        int Xt = Sc.nextInt();
        if (!CekReal(Xt)){
            System.out.println("Bukan Real");
            Sc.close();
        }
        System.out.print("Input Y of Target >> ");
        int Yt = Sc.nextInt();
        if (!CekReal(Yt)){
            System.out.println("Bukan Real");
            return;
        }
        System.out.println("Desired Animation Duration >> ");
        int A = Sc.nextInt();
        double X = Math.pow(Math.abs(Ys - Yt),2);
        double Y = Math.pow(Math.abs(Xs - Xt),2);
        double Distance = Math.sqrt((X+Y));
        System.out.println("Required velocity: " + Distance/A + "grids/ms");
    }
    public static boolean CekReal(int n){
        if (n >= 0){
            return true;
        }
        return false;
    }
}
/*
You are developing a 2D game with a grid-based world. You need to create a sword
slashing animation for a sprite that must reach a specific target position.
Input:
The input consists of two positive real numbers, each entered on a new line:
- X position of sprite
- Y position of sprite
- X position of target
- Y position of target
- The desired animation duration in milliseconds
Note : distance between two (x,y) positions
𝑑𝑖𝑠𝑡𝑎𝑛𝑐𝑒 = sqrt((𝑥1 − 𝑥2)2 + (𝑦1 − 𝑦2)2)
Output:
The program should output the required velocity (in grids per millisecond) for the sprite
to reach the target position within the specified animation duration.
input :
5
0
10
0
1000
Output:
"Required velocity: 0.005 grids/ms"
 */