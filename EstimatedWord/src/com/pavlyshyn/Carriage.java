package com.pavlyshyn;

enum ComfortLevel {
    LUX(20), FIRSTCLASS(30), CUPE(20), SECONDCLASS(40), PLACE_CARD(40);
    Integer NumberOfSeats;

    ComfortLevel(Integer numberOfSeats) {
        NumberOfSeats = numberOfSeats;
    }

    public Integer getNumberOfSeats() {
        return NumberOfSeats;
    }
}

public class Carriage {
    private ComfortLevel comfortLevel;
    private Integer amountOfLuggage;

    public Carriage(ComfortLevel comfortLevel, Integer amountOfLuggage) {
        this.comfortLevel = comfortLevel;
        this.amountOfLuggage = amountOfLuggage;
    }

    public ComfortLevel getComfortLevel() {
        return comfortLevel;
    }

    public void setComfortLevel(ComfortLevel comfortLevel) {
        this.comfortLevel = comfortLevel;
    }

    public Integer getAmountOfLuggage() {
        return amountOfLuggage;
    }

    public void setAmountOfLuggage(Integer amountOfLuggage) {
        this.amountOfLuggage = amountOfLuggage;
    }

    @Override
    public String toString() {
        return "Carriage {\n" +
                "\tcomfortLevel=" + comfortLevel +
                "\n\tamountOfLuggage=" + amountOfLuggage +
                "}\n";
    }
}
