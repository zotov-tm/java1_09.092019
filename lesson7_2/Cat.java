package lesson7_1;

public class Cat {

    private String type;
    private String name;
    private int appetite;
    boolean satiety = false;

    public Cat(String type, String name, int appetite, boolean satiety) {
        this.type = type;
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate plate) {

        plate.decreaseFood(appetite, type, name, satiety);

    }
}
