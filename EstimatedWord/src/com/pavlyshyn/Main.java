package com.pavlyshyn;

public class Main {
    public static void main(String[] args) {
        PassengerTrain pattington = new PassengerTrain(new Locomotive("Pattington", EnergySource.ELECTRIC));
        pattington.addCarriage(new Carriage(ComfortLevel.LUX,100));
        pattington.addCarriage(new Carriage(ComfortLevel.FIRSTCLASS,100));
        pattington.addCarriage(new Carriage(ComfortLevel.CUPE,100));
        pattington.addCarriage(new Carriage(ComfortLevel.LUX,100));
        pattington.addCarriage(new Carriage(ComfortLevel.SECONDCLASS,100));
        System.out.println(pattington);
    }
}
