package com.pavlyshyn;

import java.util.*;

class GeneratorStarWars {
    String[] CharacterNames = {"Luke Skywalker", "R2D2", "Han Solo", "Darth Vader" };
    private int next= 0;
    String next(){
        String s = CharacterNames[next];
        next = (next+1)%CharacterNames.length;
        return s;
    }

}

public class ShowMovie{
    private static final GeneratorStarWars GENERATOR_STAR_WARS = new GeneratorStarWars();
    static String[] fill(String[]strings){
        for(int i = 0; i<strings.length; i++){
            strings[i] = GENERATOR_STAR_WARS.next();
        }
        return strings;
    }
    static Collection<String> fill(Collection<String> stringCollection){
        for(int i = 0; i<5; i++){
            stringCollection.add(GENERATOR_STAR_WARS.next());
        }
        return stringCollection;
    }
    public static void main(String...args) {
        System.out.println(Arrays.toString(fill(new String[5])));
        System.out.println(fill(new ArrayList<>()));
        System.out.println(fill(new LinkedList<>()));
        System.out.println(fill(new HashSet<>()));
        System.out.println(fill(new LinkedList<>()));
        System.out.println(fill(new TreeSet<>()));
    }
}