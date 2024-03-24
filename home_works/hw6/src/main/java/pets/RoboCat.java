package hw6.src.main.java.pets;

import pets.Species;

public class RoboCat extends Pet {
    private pets.Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    {
        this.species = pets.Species.ROBOCAT;
    }

    public RoboCat() {
        super();
    }

    public RoboCat(String nickname) {
        super(nickname);
    }

    public RoboCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.printf("Hi, I'm robocat - %s\n", this.nickname);
    }
}
