package org.vashonsd;

public class Holiday {
    int month;
    int day;
    String name;
    String description;
    boolean isFederalHoliday;

    public Holiday(int month, int day, String name, String description, boolean isFederalHoliday) {
        this.month = month;
        this.day = day;
        this.name = name;
        this.description = description;
        this.isFederalHoliday = isFederalHoliday;
    }

    public String celebrate(){

    }
}
