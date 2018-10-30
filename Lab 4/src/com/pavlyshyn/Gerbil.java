package com.pavlyshyn;

public class Gerbil {
    int gerbilNumber;
    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
        System.out.println("Gerbil №" + gerbilNumber+" is hopping");
    }

    @Override
    public String toString() {
        return "Gerbil{" +
                "gerbilNumber=" + gerbilNumber +
                '}';
    }
}
