import pets.Fish;
import pets.Pet;
import pets.RoboCat;

public class FamilyImproved {
    public static void main(String[] args) {
        Pet fish = new Fish();
        System.out.println(fish.getSpecies());

        Pet roboCat = new RoboCat();
        System.out.println(roboCat.getSpecies());
    }
}
