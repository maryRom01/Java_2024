package hw6.src.main.java.pets;

import pets.Species;

public class Fish extends pets.Pet {
    private pets.Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    {
        this.species = pets.Species.FISH;
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
    public pets.Species getSpecies() {
        return species;
    }

    @Override
    public void setSpecies(pets.Species species) {
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
        System.out.printf("Hi, I'm fish - %s\n", this.nickname);
    }
}
