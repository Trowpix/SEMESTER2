package Latihans.Soal3;

public class Monitor {
    private String Model,Merek;
    private int Inch;
    private int Width;
    private int Height;

    public Monitor(String model, String merek, int inch, int width, int height) {
        Model = model;
        Merek = merek;
        Inch = inch;
        Width = width;
        Height = height;
    }
    public Monitor() {
        Model = "";
        Merek = "";
        Inch = 0;
        Width = 0;
        Height = 0;
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

    public int getInch() {
        return Inch;
    }

    public void setInch(int inch) {
        Inch = inch;
    }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int width) {
        Width = width;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public void DrawPixelAt(int width, int height, String colour){
        if (width <= getWidth() && height <= getHeight()){
            System.out.println("Drawing Pixel at " + width + " " + height + " in colour " + colour);
        }else {
            System.out.println("Pixel Out of reach");
        }
    }
}
