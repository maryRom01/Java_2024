import java.util.Arrays;

public class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet() {
        this.species = Species.UNKNOWN;
        this.nickname = "Unknown";
        this.age = 0;
        this.trickLevel = 0;
        this.habits = new String[]{};
    }

    public Pet(Species species, String nickname) {
        this.species = species;
        this.nickname = nickname;
        this.age = 0;
        this.trickLevel = 0;
        this.habits = new String[]{};
    }

    public Pet(Species species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }
    public Species getSpecies() {
        if (species != null) return species;
        else return null;
    }

    public void setSpecies(Species species) {
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
        System.out.println(this);
    }

    @Override
    public String toString() {
        String habits = "Unknown";
        if (this.habits != null) {
            habits = Arrays.toString(this.habits);
        }
        String species;
        if (this.species == null) {
            species = "Unknown";
        } else {
            species = this.species.toString();
        }
        return String.format("%s{nickname='%s', age=%s, trickLevel=%s, habits=%s}", species, this.nickname, this.age, this.trickLevel, habits);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Pet petObject = (Pet) obj;
        return this.species.equals(petObject.species);
    }
}
