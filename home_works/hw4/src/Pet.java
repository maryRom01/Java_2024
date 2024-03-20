import java.util.Arrays;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet() {}

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public void eat() {
        System.out.println("Я їм!\n");
    }

    public void respond() {
        System.out.printf("Привіт, хазяїн. Я - %s. Я скучив!\n", this.nickname);
    }

    public void foul() {
        System.out.println("Потрібно добре замести сліди...\n");
    }

    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return String.format("%s{nickname='%s', age=%s, trickLevel=%s, habits=%s}", this.species, this.nickname, this.age, this.trickLevel, Arrays.toString(this.habits));
    }
}
