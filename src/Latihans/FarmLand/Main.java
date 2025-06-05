package Latihans.FarmLand;

import Latihans.FarmLand.Animal.Ayam;
import Latihans.FarmLand.Animal.Domba;
import Latihans.FarmLand.Animal.Sapi;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Player P = new Player();
        Field F = new Field();
        F.setDen(new Ayam()); F.setDen(new Sapi()); F.setDen(new Domba());
        F.AddStuff(P);
        Menu:
        while (true) {
            F.PrintField();
            System.out.println("Money: " + P.getGold());
            System.out.println("Move (WASD), B: Buy, Q: Quit");
            System.out.print(">> ");
            String pilih = Sc.next().toUpperCase();
            switch (pilih) {
                case "W":
                    P.Move("W",F.getField(),F);
                    break;
                case "A":
                    P.Move("A",F.getField(),F);
                    break;
                case "S":
                    P.Move("S",F.getField(),F);
                    break;
                case "D":
                    P.Move("D",F.getField(),F);
                    break;
                case "B":
                    System.out.println("Buy Menu:");
                    System.out.println("1. Chicken (20 Gold)");
                    System.out.println("2. Cow (100 Gold)");
                    System.out.println("3. Sheep (60 Gold)");
                    System.out.println("0. Back");
                    System.out.print(">> ");
                    int buy = Sc.nextInt();
                    switch (buy){
                        case 1:
                            if (P.getGold() < 20){
                                System.out.println("Uang Tidak Cukup");
                                break;
                            }else {
                                System.out.println("Ayam Berhasil Dibeli");
                                F.setDen(new Ayam());
                                break;
                            }
                        case 2:
                            if (P.getGold() < 100){
                                System.out.println("Uang Tidak Cukup");
                                break;
                            }else {
                                System.out.println("Sapi Berhasil Dibeli");
                                F.setDen(new Sapi());
                                break;
                            }
                        case 3:
                            if (P.getGold() < 60){
                                System.out.println("Uang Tidak Cukup");
                                break;
                            }else {
                                System.out.println("Domba Berhasil Dibeli");
                                F.setDen(new Domba());
                                break;
                            }
                        case 0:
                            break;
                    }
                    break;
                case "Q":
                    break Menu;
            }
        }
    }
}
