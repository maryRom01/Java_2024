package pets;

public class DomesticCat extends Pet implements Foulable {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public DomesticCat() {
        super();
        this.species = Species.DOMESTIC_CAT;
    }

    public DomesticCat(String nickname) {
        super(nickname);
        this.species = Species.DOMESTIC_CAT;
    }

    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        this.species = Species.DOMESTIC_CAT;
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
        System.out.printf("Hi, I'm cat - %s\n", this.nickname);
    }

    @Override
    public void foul() {
        System.out.println("Потрібно добре замести сліди...\n");
    }
}
