package lesson6_2.animals;

public class Dog1 extends Dog {
    public Dog1(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void run(int obstacleLength) {
        if (obstacleLength > 0 && obstacleLength <= 400) {
            System.out.println("результат: run: true");
        } else {
            System.out.println("результат: run: false");
        }
    }
}
