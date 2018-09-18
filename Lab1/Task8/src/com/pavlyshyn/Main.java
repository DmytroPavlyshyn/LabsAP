package com.pavlyshyn;
import com.pavlyshyn.sample.StaticSample;
public class Main {

    public static void main(String[] args) {
        StaticSample obj1 = new StaticSample();
        StaticSample obj2 = new StaticSample();
        obj1.staticField = "It\'s common";
        System.out.println("obj1.staticField: "+obj1.staticField);
        System.out.println("obj2.staticField: "+obj2.staticField);

    }
}
