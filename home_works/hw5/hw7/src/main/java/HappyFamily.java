import enums.DayOfWeek;
import humans.Human;
import humans.Man;
import pets.Dog;
import pets.Pet;

import java.util.*;

public class HappyFamily {
    public static void main(String[] args) {
        Set<String> petHabits = new HashSet<String>();
        petHabits.add("eat");
        petHabits.add("sleep");
        petHabits.add("play");
        petHabits.add("play");
        petHabits.add("play");
        Pet dog = new Dog("Teddy", 2, 55, petHabits);
        System.out.println(dog.getHabits());

        Human man = new Man("Mark", "Bronx", 1995);
        SortedMap<DayOfWeek, String> schedule = new TreeMap<>();
        schedule.put(DayOfWeek.MONDAY, "work");
        schedule.put(DayOfWeek.TUESDAY, "meet friends");
        schedule.put(DayOfWeek.WEDNESDAY, "visit parents");
        man.setSchedule(schedule);
        man.printSchedule();
    }
}
