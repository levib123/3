package com.company;

public class FoodOrder {
    String meal;
    String drink;
    String appetizer;
    double cost;

    public FoodOrder(String meal, String drink, String appetizer, double cost){
        this.meal = meal;
        this.drink = drink;
        this.appetizer = appetizer;
        this.cost = cost;
    }


    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getAppetizer() {
        return appetizer;
    }

    public void setAppetizer(String appetizer) {
        this.appetizer = appetizer;
    }
}
