package com.HotelSystem;

public class Hotel {
    // name, rate, weekdayRate and weekend Rate is declared
    protected String name;
    protected int rate;
    protected int weekDayRate;
    protected int weekEndRate;

    public Hotel(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }
    public Hotel(String name, int weekDayRate, int weekEndRate) {
        this.name = name;
        this.weekDayRate = weekDayRate;
        this.weekEndRate = weekEndRate;
    }

    public String toString() {
        return "Hotel: " + name + "  WeekDayRate: " + weekDayRate + " WeekEndRate " + weekEndRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //rate is multiplied by count
    public void setRate(int count) {
        this.rate = this.rate*count;
    }

    public int getRate() {
        return rate;
    }

}

