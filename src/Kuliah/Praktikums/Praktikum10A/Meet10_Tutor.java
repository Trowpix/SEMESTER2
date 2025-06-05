package Kuliah.Praktikums.Praktikum10A;

import java.util.ArrayList;

public class Meet10_Tutor {
    public static void main(String[] args) {
        MyList<Integer, String> listOfStrings = new MyList<>();
        listOfStrings.add(111, "aaaa");
        listOfStrings.add(112, "aaab");
        listOfStrings.add(113, "aaav");
        listOfStrings.add(114, "aaac");
        listOfStrings.add(115, "aaad");

        listOfStrings.filter(115, (data) -> {
            System.out.println("The data is: " + data);
        });

        listOfStrings.filter(new Integer[]{115, 112, 111}, (data) -> {
            System.out.println("The data are: " + data);
        });

        listOfStrings.forEach((data) -> {
            System.out.println("The data is: " + data);
        });

        MyList<String, Integer> listOfIntegers = new MyList<>();
        listOfIntegers.add("a", 11133);
        listOfIntegers.add("b", 11133);
        listOfIntegers.add("c", 11133);
        listOfIntegers.add("d", 11135);

        listOfIntegers.filter("d", (data) -> {
            System.out.println("The data is : " + data);
        });

        listOfStrings.forEach((data) -> {
            System.out.println("The data is: " + data);
        });
    }
}


interface Iterable<U> {
    void iterate(U data);
}

class MyList<T, U> {
    ArrayList<T> Key = new ArrayList<>();
    ArrayList<U> Data = new ArrayList<>();
    void add(T key, U data) {
        Key.add(key);
        Data.add(data);
    }

    void filter(T key, Iterable iterator) {
        int i = this.Key.indexOf(key);
        if (i != -1) {
            iterator.iterate(this.Data.get(i));
        }
    }

    void filter(T[] key, Iterable iterator) {
        for(T _key : key) {
            int i = Key.lastIndexOf(_key);
            if (i != -1) {
                iterator.iterate(this.Data.get(i));
            }
        }
    }

    void forEach(Iterable iterator) {
        for(U _data : this.Data) {
            iterator.iterate(_data);
        }
    }
}
