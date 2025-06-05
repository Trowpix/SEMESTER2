package Latihans.Soal3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Casing casing =  new Casing("V530", "Lenovo", new Dimensi(20, 30, 15));
        Monitor monitor = new Monitor("21,5 Inch", "ThinkVision", 21, 1920, 1080);
        Ram ram1 = new Ram("TridentZ", "Gskill", 8, "DDR4 PC28800 3600Mhz");
        Ram ram2 = new Ram("TridentZ", "Gskill", 8, "DDR4 PC28800 3600Mhz");
        Ram ram3 = new Ram("Fury Beast", "Kingston", 16, "DDR4 PC25600 3200Mhz");
        Ram ram4 = new Ram("Fury Beast", "Kingston", 16, "DDR4 PC25600 3200Mhz");
        ArrayList <Ram> listRam = new ArrayList<Ram>();
        listRam.add(ram1);
        listRam.add(ram2);
        listRam.add(ram3);
        listRam.add(ram4);
        Cpu cpu = new Cpu("Intel", "I9-10900K", "5000");
        MotherBoard motherboard = new MotherBoard("Z490", "Asus", listRam, cpu);
        Pc pc = new Pc(casing, monitor, motherboard, 750, 1000);
        pc.getMonitor().DrawPixelAt(50,50,"yellow");
        pc.getMB().LoadOS("Windows 11");
        pc.getCase().PressPowerButton();




    }
}
