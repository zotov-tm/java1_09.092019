package lesson7_1;

public class Main {
    public static void main(String[] args) {

        Plate plate = new Plate(40, 0);

        Cat[] cats = {
                new Cat("кот ", "Barsik", 10, false),
                new Cat("кот ", "Mursik", 15, false),
                new Cat("кот ", "Masha", 20, false),

        };

        plate.info();

        for (int i = 0; i < cats.length; i++) {


            cats[i].eat(plate);
        }
        plate.info();
        plate.addFood(60);
        cats[2].eat(plate);

    }
}
