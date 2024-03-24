package humans;

import pets.Pet;

public abstract class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule;
    private Family family;

    public Human() {
        this.name = "Unknown";
        this.surname = "Unknown";
        this.year = 0;
        this.iq = 0;
        this.schedule = new String[1][1];
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = 0;
        this.schedule = new String[1][1];
    }

    public Human(String name, String surname, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
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

    public void print() {
        System.out.println(this);
    }

//    public void printSchedule() {
//        System.out.print("Schedule is: ");
//        if (this.getSchedule()[0].length == 0 || this.getSchedule() == null) {
//            System.out.println("No schedule");
//        } else {
//            for (int i = 0; i < this.schedule.length; i++) {
//                System.out.printf("%s - %s; ", this.schedule[i][0], this.schedule[i][1]);
//            }
//        }
//    }

    @Override
    public String toString() {
        return String.format("humans.Human{name='%s', surname='%s', year=%s, iq=%s}",
                this.name, this.surname, this.year, this.iq);
    }

    @Override
    public void finalize() throws Throwable {
        System.err.println(this);
    }
}
