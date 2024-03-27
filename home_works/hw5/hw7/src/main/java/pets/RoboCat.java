package pets;

import java.util.Set;

public class RoboCat extends Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private Set<String> habits;

    {
        this.species = Species.ROBOCAT;
    }

    public RoboCat() {
        super();
    }

    public RoboCat(String nickname) {
        super(nickname);
    }

    public RoboCat(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.printf("Hi, I'm robocat - %s\n", this.nickname);
    }
}
