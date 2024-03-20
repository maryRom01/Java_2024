import java.util.Arrays;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;

    public Human() {}

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public void greetPet() {
        System.out.printf("Привіт, %s\n", pet.getNickname());
    }

    public void describePet() {
        String trickiness;
        if (pet.getTrickLevel() <= 50) {
            trickiness = "майже не хитрий";
        } else trickiness = "дуже хитрий";
        System.out.printf("У мене є %s, йому %s років, він %s\n", pet.getSpecies(), pet.getAge(), trickiness);
    }

    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        final String unknown = "Unknown";
        String motherName, motherSurname, fatherName, fatherSurname;
        if (this.mother == null) {
            motherName = unknown;
            motherSurname = unknown;
        } else {
            motherName = this.mother.name;
            motherSurname = this.mother.surname;
        }
        if (this.father == null) {
            fatherName = unknown;
            fatherSurname = unknown;
        } else {
            fatherName = this.father.name;
            fatherSurname = this.father.surname;
        }
        return String.format("Human{name='%s', surname='%s', year=%s, iq=%s, mother=%s %s, father=%s %s, " +
                "pet=%s",
                this.name, this.surname, this.year, this.iq, motherName, motherSurname, fatherName, fatherSurname, this.pet.toString());
    }
}
