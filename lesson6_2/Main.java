package lesson6_2;

import lesson6_2.animals.*;

public class Main {
    public static void main(String[] args) {

        int obstacleLength;
        double height;


        Animal cat = new Cat("LediWinter", "red", 5);
        Animal dog = new Dog("Atos", "red", 2);
        Animal dog1 = new Dog1("Aramis", "red", 2);
        Animal dog2 = new Dog2("Partos", "red", 2);

        dog.run(500);
        dog.jumpingOverObstacles(0.5);
        ((Dog) dog).swimming(10);
        cat.run(200);
        cat.jumpingOverObstacles(1.8);
        dog1.run(400);
        dog2.run(600);
        ((Dog2) dog2).swimming(19);
        dog2.jumpingOverObstacles(1.0);

    }
}
