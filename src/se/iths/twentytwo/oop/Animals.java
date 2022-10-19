package se.iths.twentytwo.oop;

public class Animals {
    public String race;
    public String color;
    public int age;

    public Animals(String race, String color, int age) {
        this.race = race;
        this.color =color;
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
}
