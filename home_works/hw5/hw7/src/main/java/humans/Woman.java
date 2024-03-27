package humans;

import enums.DayOfWeek;
import java.util.SortedMap;

public final class Woman extends Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private SortedMap<DayOfWeek, String> schedule;
    private Family family;

    public Woman() {
        super();
    }

    public Woman(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Woman(String name, String surname, int year, int iq, SortedMap<DayOfWeek, String> schedule) {
        super(name, surname, year, iq, schedule);
    }

    public void makeup() {
        System.out.println("Makeup");
    }
}
