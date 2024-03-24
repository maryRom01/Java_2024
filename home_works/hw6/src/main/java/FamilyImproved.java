import humans.Family;
import humans.Human;
import humans.Man;
import humans.Woman;
import pets.Fish;
import pets.Pet;
import pets.RoboCat;

import java.util.Arrays;

public class FamilyImproved {
    public static void main(String[] args) {
        Pet fish = new Fish();
        System.out.println(fish.getSpecies());

        Pet roboCat = new RoboCat();
        System.out.println(roboCat.getSpecies());

        Human man = new Man("Raimond", "Bronx", 1998, 150, new String[1][1]);
        Human woman = new Woman("Rubi", "Bronx", 1999, 180, new String[1][1]);
        Family family = new Family(woman, man);

        Human child1 = family.bornChild();
        System.out.println(child1);
        System.out.println(Arrays.toString(family.getChildren()));

        Human child2 = family.bornChild();
        System.out.println(child2);
        System.out.println(Arrays.toString(family.getChildren()));
    }
}
