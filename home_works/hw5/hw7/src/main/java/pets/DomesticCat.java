package pets;

import java.util.Set;

public class DomesticCat extends Pet implements Foulable {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private Set<String> habits;

    {
        this.species = Species.DOMESTIC_CAT;
    }

    public DomesticCat() {
        super();
    }

    public DomesticCat(String nickname) {
        super(nickname);
    }

    public DomesticCat(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.printf("Hi, I'm cat - %s\n", this.nickname);
    }

    @Override
    public void foul() {
        System.out.println("Потрібно добре замести сліди...\n");
    }
}
