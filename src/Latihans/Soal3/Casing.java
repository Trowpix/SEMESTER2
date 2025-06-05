package Latihans.Soal3;

import java.util.ArrayList;
import java.util.Objects;

public class Casing {
    private String Model,Merk;
    private Dimensi XYZ;
    private Boolean Button;

    public Casing(String merk, String model, Dimensi xyz) {
        Merk = merk;
        Model = model;
        XYZ = xyz;
        Button = false;
    }
    public Casing() {
        Merk = "";
        Model = "";
        XYZ = new Dimensi(0,0,0);
        Button = false;
    }

    public Dimensi getXYZ() {
        return XYZ;
    }

    public void setXYZ(Dimensi XYZ) {
        this.XYZ = XYZ;
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

    public Boolean getButton() {
        return Button;
    }

    public void setButton(Boolean button) {
        Button = button;
    }

    void PressPowerButton(){
        if (!Button){
            System.out.println("Beep. Power Button Pressed. Turning On");
            setButton(!getButton());
        }else {
            System.out.println("Beep. Power Button Pressed. Turning Off");
            setButton(!getButton());
        }
    }
}
class Dimensi{
    private Integer X,Y,Z;

    public Dimensi(Integer x, Integer y, Integer z) {
        X = x;
        Y = y;
        Z = z;
    }
    public Dimensi() {
        X = 0;
        Y = 0;
        Z = 0;
    }

    public Integer getX() {
        return X;
    }

    public void setX(Integer x) {
        X = x;
    }

    public Integer getY() {
        return Y;
    }

    public void setY(Integer y) {
        Y = y;
    }

    public Integer getZ() {
        return Z;
    }

    public void setZ(Integer z) {
        Z = z;
    }

}
