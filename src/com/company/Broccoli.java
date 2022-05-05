package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Broccoli {
    String name;
    String color;
    boolean isFresh;


    public Broccoli(String name, String color, boolean isFresh){
        this.name = name;
        this.color = color;
        this.isFresh = isFresh;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFresh() {
        return isFresh;
    }

    public void setFresh(boolean fresh) {
        isFresh = fresh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
