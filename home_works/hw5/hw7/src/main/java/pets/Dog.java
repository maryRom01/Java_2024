package pets;

import interfaces.Foulable;

import java.util.Set;

public class Dog extends Pet implements Foulable {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private Set<String> habits;

    {
        this.species = Species.DOG;
    }

    public Dog() {
        super();
    }

    public Dog(String nickname) {
        super(nickname);
    }

    public Dog(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.printf("Hi, I'm dog - %s\n", this.nickname);
    }

    @Override
    public void foul() {
        System.out.println("Потрібно добре замести сліди...\n");
    }
}
