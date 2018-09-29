package com.pavlyshyn;

import java.util.Random;

public class Coin {
    String side;
    void FlipCoin(){
        side = new Random().nextBoolean()? "Head":"Tail";
    }

    @Override
    public String toString() {
        return "Coin{" +
                "side='" + side + '\'' +
                '}';
    }
}
