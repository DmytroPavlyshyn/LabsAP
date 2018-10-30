package com.pavlyshyn;

import java.util.*;

interface Hello{
    int a=45;
}
enum P implements Hello{
    A(3), B(2), C(1);
    int b;
    P(int b){
    this.b = b;
    }
}

class A implements Comparable<A>{
    int a;
    int b;

    @Override
    public String toString() {
        return "A{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public A(int a, int b) {
        this.a = a;
        this.b = b;

    }

    @Override
    public int compareTo(A o) {
        if (this.a > o.a) {
            return 1;
        } else if (this.a == o.a) {
            return 0;
        }
        return 1;
    }
}

public class Main {
    public static void main(String[] args) {
        List<A> aIntegerMap = new LinkedList<>();
        aIntegerMap.add(new A(1,2));
        aIntegerMap.add(new A(1,3));
        aIntegerMap.add(new A(1,4));
        aIntegerMap.add(new A(1,5));

        System.out.println(aIntegerMap);
    }
}
