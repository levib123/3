package com.company;

public class Honda {
    String name;
    int mpg;
    int gasTank;


    public Honda(String name, int mpg, int gasTank){
        this.name = name;
        this.mpg = mpg;
        this.gasTank = gasTank;

    }
    public void addFuel(double howMuch) {
        gasTank += howMuch;
    }

    public void useFuel(double howMuch) {
        gasTank -= howMuch;
    }

    public boolean canMakeTrip(double howManyMiles) {
        return mpg * gasTank > howManyMiles;
    }


    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGasTank() {
        return gasTank;
    }

    public void setGasTank(int gasTank) {
        this.gasTank = gasTank;
    }
}
