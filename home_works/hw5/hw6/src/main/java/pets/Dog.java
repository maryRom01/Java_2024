package pets;

public class Dog extends Pet implements Foulable {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Dog() {
        super();
        this.species = Species.DOG;
    }

    public Dog(String nickname) {
        super(nickname);
        this.species = Species.DOG;
    }

    public Dog(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        this.species = Species.DOG;
    }

    @Override
    public Species getSpecies() {
        return species;
    }

    @Override
    public void setSpecies(Species species) {
        this.species = species;
    }

    @Override
    public String getNickname() {
        return nickname;
    }

    @Override
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getTrickLevel() {
        return trickLevel;
    }

    @Override
    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    @Override
    public String[] getHabits() {
        return habits;
    }

    @Override
    public void setHabits(String[] habits) {
        this.habits = habits;
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
