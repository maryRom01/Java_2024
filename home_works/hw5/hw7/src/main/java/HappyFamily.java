import pets.Dog;
import pets.Pet;

import java.util.HashSet;
import java.util.Set;

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
    }
}
