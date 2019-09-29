package lesson6_2.animals;

public class Dog2 extends Dog1 {
    public Dog2(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void run(int obstacleLength) {
        if (obstacleLength > 0 && obstacleLength <= 600) {
            System.out.println("результат: run: true");
        } else {
            System.out.println("результат: run: false");
        }
    }

    @Override
    public void swimming(int height) {
        if (height > 0 && height <= 20) {
            System.out.println("результат: run: true");
        } else {
            System.out.println("результат: run: false");
        }
    }

    @Override
    public void jumpingOverObstacles(double height) {
        if (height <= 1.0) {
            System.out.println("результат: run: true");
        } else {
            System.out.println("результат: run: false");
        }

    }

}
