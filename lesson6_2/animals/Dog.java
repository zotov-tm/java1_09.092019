package lesson6_2.animals;

public class Dog extends Animal {
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    public void swimming(int height) {

        if (height > 0 && height <= 10) {
            System.out.println("результат: run: true");
        } else {
            System.out.println("результат: run: false");
        }
    }
}
