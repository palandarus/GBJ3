/*
        1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
        2. Написать метод, который преобразует массив в ArrayList;
        3. Большая задача:
            a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
            b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
            c. Для хранения фруктов внутри коробки можете использовать ArrayList;
            d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
            e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
            f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
            g. Не забываем про метод добавления фрукта в коробку.*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private Box<? extends Fruit> box;

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        appleBox.putIn(new Apple());
        orangeBox.putIn(new Orange());
        addAppleRandomArray(appleBox);
        addOrangeRandomArray(orangeBox);
        appleBox.putOutLast();
        orangeBox.putOutLast();
        System.out.println(appleBox.compare(orangeBox));
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        orangeBox2.putIn(new Orange());
        orangeBox2.putIn(new Orange());
        appleBox2.putIn(new Apple());
        appleBox2.putIn(new Apple());
        appleBox2.putIn(new Apple());
        System.out.println(appleBox2.compare(orangeBox2));
        appleBox.putInOtherBox(appleBox2);
        Apple[] apples = {new Apple(), new Apple(), new Apple(), new Apple()};
        replace(apples, 0, 3);
        ArrayList<Apple> appleArrayList = getArrayList(apples);
        System.out.println(appleArrayList);
    }

    public static void addAppleRandomArray(Box<Apple> box) {
        ArrayList<Apple> arrayList = new ArrayList<>();
        int size = (int) (Math.random() * 1000);
        for (int i = 0; i < size; i++) {
            arrayList.add(new Apple());
        }
        box.putIn(arrayList);
    }

    public static void addOrangeRandomArray(Box<Orange> box) {
        ArrayList<Orange> arrayList = new ArrayList<>();
        int size = (int) (Math.random() * 1000);
        for (int i = 0; i < size; i++) {
            arrayList.add(new Orange());
        }
        box.putIn(arrayList);
    }

    public static <T> void replace(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static <T> ArrayList<T> getArrayList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}


