package lesson7_1;

import java.util.OptionalInt;

public class Plate {
    private int food;
    private int addFood = 0;


    public Plate(int food, int addFood) {
        this.food = food;
        this.addFood = addFood;
    }

    public void addFood(int addFood) {
        food += addFood;
        System.out.println("добавили " + addFood + " еды в тарелу, еды в тарелке теперь " + food);
    }

    public void decreaseFood(int appetite, String type, String name, boolean satiety) {

        if (food < appetite) {
            System.out.println(type + name + " не стал кушать, так как в тарелке мало еды, " + name + " голодный " + satiety);

        } else {
            food -= appetite;
            satiety = true;
            System.out.println(type + name + " покушал " + appetite + " еды, в тарелке осталось " + food + " еды, " + name + " сытый " + satiety);
        }
    }

    public void info() {
        System.out.println("Еды в тарелке : " + food);
    }
}
