package Lesson1;


import Lesson1.Array.ArrayGeneric;
import Lesson1.FruitBox.Apple;
import Lesson1.FruitBox.Box;
import Lesson1.FruitBox.Orange;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayGeneric<Integer> arrayGeneric = new ArrayGeneric<>(initArrayInteger(10));
        arrayGeneric.replacement(1, 5);

        System.out.println(arrayToList(arrayGeneric.getT()));

        Box<Apple> box1 = getNewBox(new Apple(), 15);
        Box<Orange> box2 = getNewBox(new Orange(), 10);
        Box<Apple> box3 = getNewBox(new Apple(), 10);

        System.out.println(box1.compare(box2));

        box1.pourOut(box3);
        System.out.println(box1);
        System.out.println(box3);
    }

    private static Integer[] initArrayInteger(int size) {
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = i * size;
        }
        return array;
    }

    public static <T> List<T> arrayToList(T[] array) {
        return Arrays.asList(array);
    }

    private static <T> Box<T> getNewBox(T t, int size) {
        Box<T> box = new Box<>(t);
        for (int i = 0; i < size; i++) {
            box.addFruit(t);
        }
        System.out.println(box);
        return box;
    }
}
