package com.pavlyshyn;


import java.util.*;
enum CartoonCharacter {
    SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;
    public static CartoonCharacter next() {
        return values()[new Random().nextInt(values().length)];
    }
}
public class EnumImplementation {

    public static void main(String... args) {
        for(int i = 0; i < 10; i++)
            System.out.println(CartoonCharacter.next());
    }
}