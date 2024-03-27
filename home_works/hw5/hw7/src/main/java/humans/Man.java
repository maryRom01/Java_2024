package humans;

import enums.DayOfWeek;
import java.util.SortedMap;

public final class Man extends Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private SortedMap<DayOfWeek, String> schedule;
    private Family family;

    public Man() {
        super();
    }

    public Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Man(String name, String surname, int year, int iq, SortedMap<DayOfWeek, String> schedule) {
        super(name, surname, year, iq, schedule);
    }

    public void repairCar() {
        System.out.println("Repair a car");
    }
}
