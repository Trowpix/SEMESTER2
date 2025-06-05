package Latihans.Soal3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MotherBoard {
    private String Model,Merk;
    private ArrayList<Ram> ListRam = new ArrayList<Ram>();
    private Cpu NewCpu;

    public MotherBoard(String model, String merk,ArrayList<Ram> listRam, Cpu cpu) {
        Model = model;
        Merk = merk;
        ListRam = listRam;
        NewCpu = cpu;
    }
    public MotherBoard() {
        Model = "";
        Merk = "";
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getMerk() {
        return Merk;
    }

    public void setMerk(String merk) {
        Merk = merk;
    }

    public Cpu getNewCpu() {
        return NewCpu;
    }

    public void setNewCpu(Cpu newCpu) {
        NewCpu = newCpu;
    }

    public ArrayList<Ram> getListRam() {
        return ListRam;
    }

    public void setListRam(ArrayList<Ram> listRam) {
        ListRam = listRam;
    }

    public void LoadOS(String os){
        System.out.println("Starting " + os);
    }
}

class Cpu {
    private String Merek;
    private String Model;
    private String Id;

    public Cpu(String merek, String model, String id) {
        Merek = merek;
        Model = model;
        Id = id;
    }

    public Cpu() {
        Merek = "";
        Model = "";
        Id = "";
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getMerek() {
        return Merek;
    }

    public void setMerek(String merek) {
        Merek = merek;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }
}
class Ram{
    private String Model,Merek,Kecepatan;
    private Integer Ukuran;


    public Ram(String model, String merek, Integer ukuran,String kecepatan ) {
        Model = model;
        Merek = merek;
        Kecepatan = kecepatan;
        Ukuran = ukuran;
    }

    public Ram() {
        Model = "";
        Merek = "";
        Kecepatan = "";
        Ukuran = 0;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getMerek() {
        return Merek;
    }

    public void setMerek(String merek) {
        Merek = merek;
    }

    public String getKecepatan() {
        return Kecepatan;
    }

    public void setKecepatan(String kecepatan) {
        Kecepatan = kecepatan;
    }

    public Integer getUkuran() {
        return Ukuran;
    }

    public void setUkuran(Integer ukuran) {
        Ukuran = ukuran;
    }
}
