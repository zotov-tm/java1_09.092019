package lesson6_2.animals;

public class Animal {
    protected String name;
    protected String color;
    protected int age;

    public Animal() {

    }

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }


    public void run(int obstacleLength) {
        if (obstacleLength > 0 && obstacleLength <= 500) {
            System.out.println("результат: run: true");
        } else {
            System.out.println("результат: run: false");
        }
    }


    public void jumpingOverObstacles(double height) {
        if (height > 0 && height <= 0.5) {
            System.out.println("результат: run: true");
        } else {
            System.out.println("результат: run: false");
        }
    }
}
