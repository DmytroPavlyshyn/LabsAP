package com.pavlyshyn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;


public class VowelsAndConsonants{
    public static void main(String... args) {
        Random rand = new Random(47);
        for(int i = 0; i < 15; i++) {
            int c = rand.nextInt(26) + 'a';
            System.out.print((char)c + ", " + c + ": ");
            System.out.println(CharacterCategory.getCategory((char)c).toString());
        }
    }
}
enum CharacterCategory {
    VOWEL('a', 'e', 'i', 'o', 'u') {
        public String toString() {
            return "vowel";
        }
    },
    SOMETIMES_A_VOWEL('y', 'w') {
        public String toString() {
            return "sometimes a vowel";
        }
    },
    CONSONANT {
        public String toString() {
            return "consonant";
        }
    };
    private HashSet<Character> chars =
            new HashSet<Character>();

    CharacterCategory(Character... chars) {
        if (chars != null)
            this.chars.addAll(Arrays.asList(chars));
    }

    public static CharacterCategory getCategory(Character c) {
        if (VOWEL.chars.contains(c))
            return VOWEL;
        if (SOMETIMES_A_VOWEL.chars.contains(c))
            return SOMETIMES_A_VOWEL;
        return CONSONANT;
    }
}

