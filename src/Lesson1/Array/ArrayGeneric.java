package Lesson1.Array;

public class ArrayGeneric<T> {
    private T[] t;

    public ArrayGeneric(T[] t) {
        this.t = t;
    }

    public void replacement(int n1, int n2) {
        try {
            T f = t[n1];
            t[n1] = t[n2];
            t[n2] = f;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вы ввели элементы массива не входящие в этот массив. Введите элемент от 0 до " + (t.length - 1));
            e.fillInStackTrace();
        }
    }

    public T[] getT() {
        return t;
    }
}
