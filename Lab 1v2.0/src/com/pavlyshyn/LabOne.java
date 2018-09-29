package com.pavlyshyn;

public class LabOne {

    public static void main(String[] args) {
        //Task1
        IntChar objIntChar = new IntChar();
        System.out.println("Int:" + objIntChar.sampleInt + "\nChar:" + objIntChar.sampleChar);
        //Task2
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHelloWorld();
        //Task3
        ATypeName a = new ATypeName();
        //Task4
        DataOnly data = new DataOnly();
        //Task5
        data.i = 1;
        data.d = 1.5;
        data.b = true;
        System.out.println("data.i: " + data.i + "\ndata.d: " + data.d + "\ndata.b: " + data.b);
        //Task6
        LabOne labOne = new LabOne();
        System.out.println(labOne.storage("Hello"));
        //Task7
        Incrementable incrementable = new Incrementable();
        incrementable.increment();
        Incrementable.increment();
        System.out.println(StaticTest.i);
        //Task8
        Incrementable incrementable1 = new Incrementable();
        incrementable1.increment();
        Incrementable incrementable2 = new Incrementable();
        incrementable2.increment();
        Incrementable incrementable3 = new Incrementable();
        incrementable3.increment();
        System.out.println(StaticTest.i);
        //Task9
        boolean b = true;
        Boolean B;
        B = b;
        System.out.println(B);

        char ch = 'c';
        Character Ch;
        Ch = ch;
        System.out.println(Ch);

        byte by = 3;
        Byte By;
        By = by;
        System.out.println(By);

        short sh = 6;
        Short Sh;
        Sh = sh;
        System.out.println(Sh);

        int i = 1;
        Integer I;
        I = i;
        System.out.println(I);

        long l = 9;
        Long L;
        L = l;
        System.out.println(L);

        float f = (float) 1.1;
        Float F;
        F = f;
        System.out.println(F);

        double d = 3.4;
        Double D;
        D = d;
        System.out.println(D);
        //Task 10
        for (int index = 0; index < 3; index++) {
            System.out.println("agrgs[" + index + "] = " + args[index]);
        }
        //Task 11
        AllTheColorsOfTheRainbow allTheColorsOfTheRainbow = new AllTheColorsOfTheRainbow();
        allTheColorsOfTheRainbow.ChangeTheHueOfTheColor(2);
        System.out.println(allTheColorsOfTheRainbow.anIntegerRepresentingColors);
        //Task12
        HelloDate helloDate = new HelloDate();
        helloDate.runHelloDate();
        //Task 16
        Overloading overloading = new Overloading();
        overloading.runOverloading();

    }

    int storage(String s) {
        return s.length() * 2;

    }
}
