package com.HotelSystem;

public class Hotel {
    // name and rate is declared
    private String name;
    private int rate;

    public Hotel(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }
    public String toString() {
        return "Hotel: " + name + "  Rate: " + rate;
    }
    //rate is multiplied by count
    public void setRate(int count) {
        this.rate = this.rate*count;
    }

    public int getRate() {
        return rate;
    }

}

