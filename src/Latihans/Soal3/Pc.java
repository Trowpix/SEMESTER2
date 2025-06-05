package Latihans.Soal3;

public class Pc {
    private Casing Case;
    private Monitor Monitor;
    private MotherBoard MB;
    private Integer Daya;
    private Integer Storage;

    public Pc(Casing aCase, Latihans.Soal3.Monitor monitor, MotherBoard mb, Integer daya, Integer storage) {
        Case = aCase;
        Monitor = monitor;
        MB = mb;
        Daya = daya;
        Storage = storage;
    }

    public Integer getStorage() {
        return Storage;
    }

    public void setStorage(Integer storage) {
        Storage = storage;
    }

    public Casing getCase() {
        return Case;
    }

    public void setCase(Casing aCase) {
        Case = aCase;
    }

    public Latihans.Soal3.Monitor getMonitor() {
        return Monitor;
    }

    public void setMonitor(Latihans.Soal3.Monitor monitor) {
        Monitor = monitor;
    }

    public MotherBoard getMB() {
        return MB;
    }

    public void setMB(MotherBoard MB) {
        this.MB = MB;
    }

    public Integer getDaya() {
        return Daya;
    }

    public void setDaya(Integer daya) {
        Daya = daya;
    }

}
