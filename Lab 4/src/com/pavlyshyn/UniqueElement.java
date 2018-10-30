package com.pavlyshyn;

import com.sun.javafx.UnmodifiableArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueElement{
    private int ID = counter++;
    private static int counter;

    @Override
    public String toString() {
        return "UniqueElement{" +
                "ID=" + ID +
                '}';
    }
    static UniqueElement[] fill(UniqueElement[]uniqueElements){
        for(int i = 0; i<uniqueElements.length; i++){
                uniqueElements[i] = new UniqueElement();
        }
        return uniqueElements;
    }
    public static void main(String...args) {
        UniqueElement[] uniqueElements = new UniqueElement[5];
        fill(uniqueElements);
        System.out.println(Arrays.asList(uniqueElements));
        List<UniqueElement> listOfUniqueElements=new ArrayList<>(Arrays.asList(uniqueElements));
        System.out.println("List of unique elements: "+listOfUniqueElements);
        List<UniqueElement> sublistOfUniqueElements = listOfUniqueElements.subList(2,4);
        System.out.println("Sublist of unique elements [2,4]: " + sublistOfUniqueElements);
        listOfUniqueElements.removeAll(sublistOfUniqueElements);
        System.out.println("List without sublist"+listOfUniqueElements);
    }
}

