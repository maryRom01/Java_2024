package pets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public abstract class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private Set<String> habits;

    {
        this.species = Species.UNKNOWN;
    }

    public Pet() {
        this.nickname = "Unknown";
        this.age = 0;
        this.trickLevel = 0;
        this.habits = new HashSet<>();
    }

    public Pet(Species species) {
        this.species = species;
        this.nickname = "Unknown";
        this.age = 0;
        this.trickLevel = 0;
        this.habits = new HashSet<>();
    }

    public Pet(String nickname) {
        this.nickname = nickname;
        this.age = 0;
        this.trickLevel = 0;
        this.habits = new HashSet<>();
    }

    public Pet(String nickname, int age, int trickLevel, Set<String> habits) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet(Species species, String nickname, int age, int trickLevel, Set<String> habits) {
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

    public Set<String> getHabits() {
        return habits;
    }

    public void setHabits(Set<String> habits) {
        this.habits = habits;
    }

    public void eat() {
        System.out.println("Я їм!\n");
    }

    public abstract void respond();

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        String habits = "Unknown";
        if (!this.habits.isEmpty()) {
            habits = this.habits.toString();
        }
        return String.format("%s{nickname='%s', age=%s, trickLevel=%s, habits=%s}", this.species.toString().toLowerCase(),
                this.nickname, this.age, this.trickLevel, habits);
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
