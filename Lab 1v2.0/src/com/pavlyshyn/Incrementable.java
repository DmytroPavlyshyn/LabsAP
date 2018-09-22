package com.pavlyshyn;

class StaticTest {
    public static int i = 47;
}

public class Incrementable {
    static void increment() {
        StaticTest.i++;
    }
}
