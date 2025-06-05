package Latihans.FarmLand;

import Latihans.FarmLand.Animal.Animal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Field {
    Random Acak = new Random();
    private Character[][] Field =
            {{'.','.','.','.','.','.'},
            {'.','.','.','.','.','.'},
            {'.','.','.','.','.','.'},
            {'.','.','.','.','.','.'},
            {'.','.','.','.','.','.'},
            {'.','.','.','.','.','.'}};
    private ArrayList<Animal> Den = new ArrayList<>();

    public Character[][] getField() {
        return Field;
    }

    public void setField(Character[][] field) {
        Field = field;
    }

    public ArrayList<Animal> getDen() {
        return Den;
    }

    public void setDen(Animal A) {
        Den.add(A);
    }

    void PrintField(){
        for (int A = 0 ; A < getField().length ; A++){
            for (int B = 0 ; B < getField().length ; B++){
                System.out.print(getField()[A][B] + " ");
            }
            System.out.println();
        }
    }
    void AddStuff(Player P){
        getField()[P.getX()][P.getY()] = P.getSimb();
        for (int A = 0 ; A < getDen().size() ; A++){
            Animal animal = getDen().get(A);
            ValidSpace(animal);
        }
    }
    void ValidSpace(Animal animal){
        boolean valid = false;
        while (!valid){
            int x = animal.getX();
            int y = animal.getY();
            if (getField()[x][y] == '.'){
                getField()[x][y] = animal.getSimb();
                valid = true;
            }else {
                animal.setX(Acak.nextInt());
                animal.setY(Acak.nextInt());
            }
        }
    }
}
