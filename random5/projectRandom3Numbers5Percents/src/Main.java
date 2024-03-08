//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Arrays;

public class Main {
    static int percentByDefault = 5;
    static int cycleByDefault = 100;
    static int maxRangeNumber = 10;
    static int generateRandomNumber(int range) {
        double number = Math.random() * range;
        long numberRounded = Math.round(number);
        return (int) numberRounded;
    }

    static void printThreeDifferentRandomNumbers(int range) {
        int numberFirst = generateRandomNumber(range);
        int numberSecond = generateRandomNumber(range);
        int numberThird;
        if (numberFirst != numberSecond) {
            numberThird = generateRandomNumber(range);
        } else {
            if (numberFirst > 1 && numberFirst <= range) {
                numberThird = numberFirst - 1;
            } else {
                numberThird = numberFirst + 1;
            }
        }
        System.out.printf("%s %s %s", numberFirst, numberSecond, numberThird);
        System.out.println(" ");
    }

    static void printThreeIdenticalRandomNumbers(int range) {
        int number = generateRandomNumber(range);
        System.out.printf("%s %s %s - Congratulations!", number, number, number);
        System.out.println(" ");
    }

    static void runCyclePortion(int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            System.out.print("index " + i + " - ");
            printThreeDifferentRandomNumbers(maxRangeNumber);
        }
        if (endIndex != cycleByDefault) {
            System.out.print("index " + endIndex + " - ");
            printThreeIdenticalRandomNumbers(maxRangeNumber);
        }
    }

    static int[] generateWinnerRandomIndexes(int amountOfWinnerRandomIndexes, int amountOfAllIndexes) {
        int[] winnerRandomIndexes = new int[amountOfWinnerRandomIndexes];
        for (int i = 0; i < amountOfWinnerRandomIndexes; i++) {
            winnerRandomIndexes[i] = generateRandomNumber(amountOfAllIndexes);
        }
        Arrays.sort(winnerRandomIndexes);
        for (int i = 0; i < amountOfWinnerRandomIndexes - 1; i++) {
            if (winnerRandomIndexes[i] == winnerRandomIndexes[i + 1]) {
                if (winnerRandomIndexes[i] == 0) {
                    winnerRandomIndexes[i + 1] = winnerRandomIndexes[i] + 1;
                } else {
                    winnerRandomIndexes[i] = winnerRandomIndexes[i] - 1;
                }
            }
        }
        for (int i = 0; i < amountOfWinnerRandomIndexes; i++) {
            System.out.println(winnerRandomIndexes[i]);
        }
        return winnerRandomIndexes;
    }

    public static void main(String[] args) {
        int[] winnerRandomIndexes = generateWinnerRandomIndexes(percentByDefault, cycleByDefault);
        for (int i = 0; i < percentByDefault; i++) {
            if (i == 0) {
                runCyclePortion(i, winnerRandomIndexes[i]);
                runCyclePortion(winnerRandomIndexes[i] + 1, winnerRandomIndexes[i + 1]);
            } else if (i == (percentByDefault - 1)) {
                runCyclePortion(winnerRandomIndexes[percentByDefault - 1] + 1, cycleByDefault);
            } else {
                runCyclePortion(winnerRandomIndexes[i] + 1, winnerRandomIndexes[i + 1]);
            }
        }
    }
}