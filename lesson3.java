/*Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
 При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
 После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
 * */

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

import java.sql.SQLOutput;
import java.util.Scanner;

public class lesson3 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        gameGuessTheNumber();
        continueOrEndGame();

    }


    static void gameGuessTheNumber() {
        int Answer = (int) (Math.random() * 10);

        System.out.println(Answer); // вывод на консоль загаданного числа для проверки
        int counter = 0;
        int maxCounter = 3;

        do {
            System.out.println("Отгадайте число от 0 до 9\nУ вас осталось " + (maxCounter - counter) + " попытки");
            int userAnswer = sc.nextInt();
            counter++;
            System.out.println(userAnswer);
            if (userAnswer < 0 || userAnswer > 9) {
                userAnswer = validationOfInputNumber();
            }


            if (counter < maxCounter && userAnswer < Answer) {
                System.out.println("Вы не угадали, загаданное число больше: " + userAnswer
                        + "\nпо пробуйте еще раз");


            } else if (counter < maxCounter && userAnswer > Answer) {
                System.out.println("Вы не угадали, загаданное число меньше: " + userAnswer
                        + "\nпо пробуйте еще раз");
            } else if (userAnswer == Answer) {
                System.out.println("Поздравляю, вы угадали! загаданное число: " + userAnswer);
                break;
            } else if (counter == maxCounter && userAnswer < Answer || userAnswer > Answer) {
                System.out.println("Вы не угадали, правильный ответ: " + Answer);
            }

        } while (counter < maxCounter);

    }

    static void continueOrEndGame() {
        int userAnswer;
        do {

            System.out.println("Повторить игру еще раз? Если да нажмите 1, если нет нажмите 0");
            userAnswer = sc.nextInt();

            if (userAnswer == 1) {
                gameGuessTheNumber();
            } else if (userAnswer == 0) {
                System.out.println("Игра окончена");
                break;
            }

        } while (userAnswer != 1 || userAnswer != 0);
    }

    static int validationOfInputNumber() {
        int userAnswer;
        do {
            System.out.println(" Вам нужно  ввести число от 0 до 9 включительно");
            userAnswer = sc.nextInt();
        } while (userAnswer < 0 || userAnswer > 9);
        return userAnswer;
    }


}




