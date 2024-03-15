import java.util.Scanner;

public class Main {
    static String questionAboutUsername = "Hello, what is your name?";
    static String messageStartGame = "Let the game begin!";
    static String messageAboutNumber = "Please, enter a number";
    static String messageCongratulations = "Congratulations, %s!";
    static String messageSmallNumber = "Your number is too small. Please, try again.";
    static String messageBigNumber = "Your number is too big. Please, try again.";
    static String messageError = "Your number is not integer. Error";
    static int range = 101;

    public static String readFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printMessageWithParameter(String message, String parameter) {
        System.out.printf(message, parameter);
    }

    public static int generateRandomNumber(int range) {
        double number = Math.random() * range;
        long numberRounded = Math.round(number);
        return (int) numberRounded;
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

    public static int getNumberFromUser() {
        String text = readFromConsole();
        if (isInteger(text)) {
            return Integer.parseInt(text);
        } else {
            printMessage(messageError);
            return -1;
        }
    }

    public static void main(String[] args) {
        printMessage(questionAboutUsername);
        String name = readFromConsole();
        printMessage(messageStartGame);
        int number = generateRandomNumber(range);
        while (true) {
            printMessage(messageAboutNumber);
            int userNumber = getNumberFromUser();
            if (userNumber != -1) {
                if (userNumber == number) {
                    printMessageWithParameter(messageCongratulations, name); break;
                } else if (userNumber < number) {
                    printMessage(messageSmallNumber);
                } else {
                    printMessage(messageBigNumber);
                }
            }
        }
    }
}