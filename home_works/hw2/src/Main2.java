
import java.util.Scanner;

public class Main2 {
    static String messageWelcome = "All Set. Get ready to rumble!";
    static String messageEnterRow = "Enter row number (from 1 to 5)";
    static String messageEnterColumn = "Enter column number (from 1 to 5)";
    static String messageErrorNotInteger = "Error. You entered not a number.";
    static String messageErrorWrongNumber = "Error. You entered number < 1 or > 5";
    static String messageRowColumnValues = "You entered row = %s, column = %s";
    static String messageWinner = "You have won!";
    static void print(String message) {
        System.out.println(message);
    }

    static void printRow(int rowNumber, char[] arrayOfValues) {
        StringBuilder row = new StringBuilder();
        row.append("| ").append(rowNumber).append(" | ");
        for (char arrayOfValue : arrayOfValues) {
            row.append(arrayOfValue).append(" | ");
        }
        System.out.println(row);
    }

    static char[][] initField() {
        char[][] field = new char[5][5];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = '-';
            }
        }
        return field;
    }

    static void printField(char[][] field) {
        char[] defaultValues = {'1', '2', '3', '4', '5'};
        printRow(0, defaultValues);
        for (int i = 0; i < field.length; i++) {
            printRow(i + 1, field[i]);
        }
    }

    public static boolean isInteger(String s) {
        return isInteger(s,10);
    }

    public static boolean isInteger(String s, int radix) {
        if (s.isEmpty()) return false;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(i) == '-') {
                if (s.length() == 1) return false;
                else continue;
            }
            if (Character.digit(s.charAt(i),radix) < 0) return false;
        }
        return true;
    }
    static int getNumber(boolean isRow) {
        if (isRow) {
            print(messageEnterRow);
        } else {
            print(messageEnterColumn);
        }
        int number;
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        if (isInteger(text)) {
            number = Integer.parseInt(text);
            if (number >= 1 & number <= 5) {
                return number;
            } else {
                print(messageErrorWrongNumber);
            }
        } else {
            print(messageErrorNotInteger);
        }
        return 0;
    }

    static int getRowNumber() {
        int rowNumber;
        do {
            rowNumber = getNumber(true);
        } while (rowNumber == 0);
        return rowNumber;
    }

    static int getColumnNumber() {
        int columnNumber;
        do {
            columnNumber = getNumber(false);
        } while (columnNumber == 0);
        return columnNumber;
    }

    static int getRandomNumber() {
        double number = Math.random() * 6;
        long numberRounded = Math.round(number);
        return (int) numberRounded;
    }

    static int[] defineGoal() {
        int[] goal = new int[2];
            goal[0] = getRandomNumber();
            goal[1] = getRandomNumber();
        return goal;
    }
    static void startGame() {
        char[][] field = initField();
        printField(field);
        int[] goal = defineGoal();
        //System.out.println(goal[0] + " " + goal[1]);
        boolean flag = false;
        while (!flag) {
            int rowNumber = getRowNumber();
            int columnNumber = getColumnNumber();
            System.out.printf(messageRowColumnValues, rowNumber, columnNumber);
            System.out.println();
            field[rowNumber - 1][columnNumber - 1] = '*';
            printField(field);
            if (rowNumber == goal[0] & columnNumber == goal[1]) {
                print(messageWinner);
                flag = true;
            }
        }
    }
    public static void main(String[] args) {
        print(messageWelcome);
        startGame();
    }
}