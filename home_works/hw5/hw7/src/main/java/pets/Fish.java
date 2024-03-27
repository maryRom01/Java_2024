package pets;

public class Fish extends Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    {
        this.species = Species.FISH;
    }

    public Fish() {
        super();
    }

    public Fish(String nickname) {
        super(nickname);
    }

    public Fish(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.printf("Hi, I'm fish - %s\n", this.nickname);
    }
}
