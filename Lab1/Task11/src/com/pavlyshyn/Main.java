package com.pavlyshyn;

public class Main {


    public static void main(String[] args) {
	    AllTheColorsOfTheRainbow  obj = new AllTheColorsOfTheRainbow();
	    obj.ChangeTheHueOfTheColor(23);
    }


}


class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;

    void ChangeTheHueOfTheColor(int newHue) {
        anIntegerRepresentingColors = newHue;
    }
}