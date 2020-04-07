package com.company;

public class Character {

    char c;
    private int frequency;

    public Character(char c, int frecuency) {
        this.c = c;
        this.frequency = frecuency;
    }

    public int getFrequency() {
        return frequency;
    }

    public void add(){
        frequency++;
    }


    public char getC() {
        return c;
    }

    @Override
    public String toString() {
        return String.format("%s",c);
    }
}
