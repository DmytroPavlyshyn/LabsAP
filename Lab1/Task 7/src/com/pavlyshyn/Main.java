package com.pavlyshyn;

public class Main {

    public static void main(String[] args) {
	    Incrementable obj = new Incrementable();
	    obj.increment();
        obj.increment();
        obj.increment();

        System.out.println("StaticTest = " + StaticTest.i );
    }
}
