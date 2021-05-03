package Lesson1.FruitBox;

public class Box<F> {
    F fruit;
    private int quantity = 0;

    public Box(F fruit) {
        this.fruit = fruit;
    }

    public <T> void addFruit(T fruit) {
        if (fruit.getClass().getName().equals(this.fruit.getClass().getName())) {
            quantity++;
        } else {
            System.out.println("Это ящик c " + this.fruit);
        }
    }

    public float getWeight() {
        return quantity * ((Fruit) fruit).getWeight();
    }

    public boolean compare(Box<?> box) {
        return box.getWeight() == getWeight();
    }

    public void pourOut(Box<F> box) {
        for (int i = 0; i < quantity; i++) {
            box.addFruit(fruit);
            quantity--;
        }
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruit " + fruit +
                ", weight=" + getWeight() +
                '}';
    }
}
