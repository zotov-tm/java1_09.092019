package lesson6_2.animals;

public class Cat extends Animal {
    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void run(int obstacleLength) {
        if (obstacleLength <= 200) {
            System.out.println("результат: run: true");
        } else {
            System.out.println("результат: run: false");
        }
    }

    @Override
    public void jumpingOverObstacles(double height) {
        if (height <= 2.0) {
            System.out.println("результат: run: true");
        } else {
            System.out.println("результат: run: false");
        }
    }

}
