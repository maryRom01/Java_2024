import java.util.Scanner;

public class Main {
    static String questionAboutUsername = "Hello, what is your name?";
    static String messageStartGame = "Let the game begin!";
    static String messageAboutNumber = "Please, enter a number";
    static String messageCongratulations = "Congratulations, %s!";
    static String messageSmallNumber = "Your number is too small. Please, try again.";
    static String messageBigNumber = "Your number is too big. Please, try again.";
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

    static int generateRandomNumber(int range) {
        double number = Math.random() * range;
        long numberRounded = Math.round(number);
        return (int) numberRounded;
    }

    public static void main(String[] args) {
        printMessage(questionAboutUsername);
        String name = readFromConsole();
        printMessage(messageStartGame);
        int number = generateRandomNumber(range);
        while (true) {
            printMessage(messageAboutNumber);
            int userNumber = Integer.parseInt(readFromConsole());
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