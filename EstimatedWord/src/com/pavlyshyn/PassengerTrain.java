package com.pavlyshyn;
import javax.xml.*;
import java.util.LinkedList;

public class PassengerTrain extends Train{
    private LinkedList<Carriage> carriages;

    public PassengerTrain(Locomotive locomotive) {
        super(locomotive);
        carriages = new LinkedList<>();
    }
    public void addCarriage(Carriage carriage){
        carriages.push(carriage);
    }
    public void pickCarriage(Carriage carriage){
        carriages.remove(carriage);
    }

    @Override
    public String toString() {
        return "PassengerTrain{" +
                "Locomotive = {" + locomotive +
                '}'+
                "\nCarriages= \n" + carriages;
    }
}
