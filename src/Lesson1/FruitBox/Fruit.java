package Lesson1.FruitBox;

public abstract class Fruit {
    private final Float weight;
    private final String fruit;

    public Fruit(String fruit, Float weight){
        this.weight = weight;
        this.fruit = fruit;
    }

    public Float getWeight(){
        return weight;
    }

    public String toString(){
        return fruit;
    }
}
