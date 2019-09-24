import java.util.Random;
import java.util.Scanner;

public class lesson4 {


    public static Random rand = new Random();
    public static Scanner sc = new Scanner(System.in);
    public static char map[][];
    public static int SIZE = 5;
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static final char DOT_EMPTY = '•';
    public static final int Strike = 4;


    public static void main(String[] args) {

        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWin0(DOT_X)) {
                System.out.println("Вы победили, поздравляем!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin0(DOT_O)) {
                System.out.println("Победил компьютер");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }

    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }

        }
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");

        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координату в форамате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x));
        map[y][x] = DOT_X;

    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(y, x));
        map[y][x] = DOT_O;
    }

    public static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkWin0(char c) {
        int symbolsOnLineOne;
        int symbolsOnLineTwo;
        int symbolsOnLineThree = 0;
        int symbolsOnLineFour = 0;

        for (int i = 0; i < SIZE; i++) {
            symbolsOnLineOne = 0;
            symbolsOnLineTwo = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == c) {
                    symbolsOnLineOne++;
                }
                if (map[j][i] == c) {
                    symbolsOnLineTwo++;
                }
                if (i == j && map[i][j] == c) {
                    symbolsOnLineThree++;
                }
                if ((i + j == SIZE - 1) && map[i][j] == c) {
                    symbolsOnLineFour++;
                }
            }
            if (symbolsOnLineOne == Strike || symbolsOnLineTwo == Strike || symbolsOnLineThree == Strike || symbolsOnLineFour == Strike) {
                return true;
            }
        }
        return false;
    }
}
       /* if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
        if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
        if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
        return false;
    }
}*/