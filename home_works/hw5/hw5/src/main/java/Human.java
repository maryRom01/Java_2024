public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;
    private Family family;

    public Human() {
        this.name = "Unknown";
        this.surname = "Unknown";
        this.year = 0;
        this.iq = 0;
        this.pet = new Pet();
        this.schedule = new String[1][1];
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = 0;
        this.pet = new Pet();
        this.schedule = new String[1][1];
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
        this.iq = 0;
        this.pet = new Pet();
        this.schedule = new String[1][1];
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        if (schedule != null) {
            this.schedule = schedule;
        } else {
            this.schedule = new String[][]{{},{}};
        }

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

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public void greetPet() {
        System.out.printf("Привіт, %s\n", pet.getNickname());
    }

    public String describePet() {
        String description;
        String trickiness;
        if (!(pet == null || pet.getSpecies() == Species.UNKNOWN)) {
            if (pet.getTrickLevel() <= 50) {
                trickiness = "майже не хитрий";
            } else trickiness = "дуже хитрий";
            description = String.format("У мене є %s, йому %s років, він %s\n", pet.getSpecies(), pet.getAge(), trickiness);
        } else description = "No pets";
        System.out.println(description);
        return description;
    }

    public void print() {
        System.out.println(this);
    }

    public void printSchedule() {
        System.out.print("Schedule is: ");
        if (this.getSchedule()[0].length == 0 || this.getSchedule() == null) {
            System.out.println("No schedule");
        } else {
            for (int i = 0; i < this.schedule.length; i++) {
                System.out.printf("%s - %s; ", this.schedule[i][0], this.schedule[i][1]);
            }
        }
    }

    @Override
    public String toString() {
        final String unknown = "Unknown";
        String motherName, motherSurname, fatherName, fatherSurname, pet;
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
        if (this.pet == null) {
            pet = unknown;
        } else {
            pet = this.pet.toString();
        }
        return String.format("Human{name='%s', surname='%s', year=%s, iq=%s, mother='%s %s', father='%s %s' " +
                "pet=%s}",
                this.name, this.surname, this.year, this.iq, motherName, motherSurname, fatherName, fatherSurname, pet);
    }

    @Override
    public void finalize() throws Throwable {
        System.err.println(this);
    }
}
