package Kuliah.Class.Anonymus_class_Lambda;

public class Anonymus_class {
    public static void main(String[] args) {
        Button btn = new Button();
        btn.setAction(new Clickable() {
            @Override
            public void onclick() {
                System.out.println("CLICKED");
            }

            @Override
            public void onhover() {
                System.out.println("HOVERED");
            }
        });

        Clickable btn2 = new Clickable() {
            @Override
            public void onclick() {
                System.out.println("WOmp");
            }

            @Override
            public void onhover() {
                System.out.println("wimp");
            }
        };
         btn.setAction(btn2);
    }
}

interface Clickable{
     void onclick();
     void onhover();
}

class Button{
    void setAction(Clickable click){
        click.onclick();
        click.onhover();
    }
}