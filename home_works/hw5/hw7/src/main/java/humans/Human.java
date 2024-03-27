package humans;

import enums.DayOfWeek;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public abstract class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private SortedMap<DayOfWeek, String> schedule;
    private Family family;

    public Human() {
        this.name = "Unknown";
        this.surname = "Unknown";
        this.year = 0;
        this.iq = 0;
        this.schedule = new TreeMap<>();
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = 0;
        this.schedule = new TreeMap<>();
    }

    public Human(String name, String surname, int year, int iq, SortedMap<DayOfWeek, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        if (schedule != null) {
            this.schedule = schedule;
        } else {
            this.schedule = new TreeMap<>();
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

    public Map<DayOfWeek, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(SortedMap<DayOfWeek, String> schedule) {
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

    public void printSchedule() {
        System.out.print("Schedule is: ");
        if (this.getSchedule().isEmpty()) {
            System.out.println("No schedule");
        } else {
            //System.out.printf("%s; ", this.schedule.entrySet());
            for(Map.Entry<DayOfWeek, String> e: this.getSchedule().entrySet()) {
                DayOfWeek day = e.getKey();
                String action = e.getValue();
                System.out.printf("%s - %s; ", day, action);
            }
        }
    }

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
