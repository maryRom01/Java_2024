import java.util.Scanner;


public class TaskPlanner {
    static String questionWhatIsAWeekday = "Please, input the day of the week: ";
    static String exitMessage = "You exit from the Task planner. See you next time!";
    static String errorMessage = "Sorry, I don't understand you, please try again.";
    static String[] weekday = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    static String[] tasks = {
            "have a rest, meet friends",
            "work, do homework",
            "join course lesson, walk",
            "english lesson, do homework",
            "visit parents, join course lesson",
            "work, go shopping",
            "visit movie theater, join course lesson"
    };
    public static String[][] getSchedule() {
        String[][] schedule = new String[7][2];
        System.out.println("   SCHEDULE (by default)");
        for (int i = 0; i < weekday.length; i++) {
            schedule[i][0] = weekday[i];
            schedule[i][1] = tasks[i];
            System.out.printf("%s - ", schedule[i][0]);
            System.out.println(schedule[i][1]);
        }
        print("");
        return schedule;
    }

    public static void print(String message) {
        System.out.println(message);
    }

    public static String readFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void printTask(String[][] schedule, int weekdayImdex) {
        System.out.printf("Your tasks for %s: %s \n", weekday[weekdayImdex], schedule[weekdayImdex][1]);
    }
    public static void main(String[] args) {
        String[][] schedule = getSchedule();
        boolean flag = true;
        while (flag) {
            print(questionWhatIsAWeekday);
            String day = readFromConsole().trim();
            switch (day) {
                case "Sunday":
                case "sunday":
                case "SUNDAY": {
                    printTask(schedule, 0); break;
                }
                case "Monday":
                case "monday":
                case "MONDAY": {
                    printTask(schedule, 1); break;
                }
                case "Tuesday":
                case "tuesday":
                case "TUESDAY": {
                    printTask(schedule, 2); break;
                }
                case "Wednesday":
                case "wednesday":
                case "WEDNESDAY": {
                    printTask(schedule, 3); break;
                }
                case "Thursday":
                case "thursday":
                case "THURSDAY": {
                    printTask(schedule, 4); break;
                }
                case "Friday":
                case "friday":
                case "FRIDAY": {
                    printTask(schedule, 5); break;
                }
                case "Saturday":
                case "saturday":
                case "SATURDAY": {
                    printTask(schedule, 6); break;
                }
                case "exit":
                    flag = false;
                    print(exitMessage);
                    break;
                default:
                    print(errorMessage);
            }
        }
    }
}