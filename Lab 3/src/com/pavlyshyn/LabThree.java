package com.pavlyshyn;

import java.util.Random;

public class LabThree {

    public static void main(String[] args) {
         

        //Task 1
        System.out.println("Task 1");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        //Task 2
        System.out.println("Task 2");
        Random random = new Random();
        int RandNumber1 = 0, RandNumber2 = 0;
        for (int i = 0; i < 25; i++) {
            int RandNumber3 = random.nextInt(100);
            if (RandNumber3 > RandNumber2) {
                RandNumber1 = 2 * RandNumber3;
            } else if (RandNumber3 == RandNumber2) {
                RandNumber1 = RandNumber2;
                RandNumber2 = RandNumber3;
            } else {
                continue;
            }
            System.out.println(RandNumber1);
        }
        //Task 3
/*        System.out.println("Task 3");
        RandNumber1 = RandNumber2 = 0;
        for(;true; ){
            int RandNumber3 = random.nextInt(100);
            if(RandNumber3 > RandNumber2){
                RandNumber1 = 2 * RandNumber3;
            }
            else if(RandNumber3 == RandNumber2){
                RandNumber1 = RandNumber2;
                RandNumber2 = RandNumber3;
            }
            else {
                continue;
            }
            System.out.println(RandNumber1);
        }*/

        //Task 4
        System.out.println("Task 4");
        int numberOfPrimes = 25;
        for (int primeNumbersCounter = 0, k = 1; primeNumbersCounter < (numberOfPrimes - 1); ) {
            int numberOfDividers = 0;
            for (int i = k / 2; i > 0; i--) {
                if (k % i == 0) {
                    numberOfDividers++;
                }
            }
            if (numberOfDividers == 2) {
                int z = (int) Math.sqrt(k);
                System.out.println(z);
                primeNumbersCounter++;
            }
            k++;
        }
        //Task 5
        System.out.println("Task 5");
        int Val1 = 0xAA, Val2 = 0x55;

        System.out.println(toBinaryString(Val1));
        System.out.println(toBinaryString(Val2));
        System.out.println("Val1 & Val2 = " + toBinaryString(Val1 & Val2));
        System.out.println("Val1 | Val2 = " + toBinaryString(Val1 | Val2));
        System.out.println("Val1 ^ Val2 = " + toBinaryString(Val1 ^ Val2));
        System.out.println("~Val1 = " + toBinaryString(~Val1));
        System.out.println("~Val2 = " + toBinaryString(~Val2));
        //Task 6
        System.out.println("Task 6");
        System.out.println("test(10,1,6) = " + test(10, 1, 6));
        System.out.println("test(5,1,6) = " + test(5, 1, 6));
        System.out.println("test(6,1,6) = " + test(6, 1, 6));
        //Task 7
        System.out.println("Task 7");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if (i == 99) {
                break;
            }
        }
     /*   for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if(i ==99){
                return;
            }
        }
    */
        //Task 8
        System.out.println("Task 8");
        System.out.println("1) With breaks");
        for(int i =0; i< 3; i++){
            switch (i){
                case 0:
                    System.out.println(i);
                    break;
                case 1:
                    System.out.println(i*2);
                    break;
                default:
                    System.out.println(i*3);
            }
        }
        System.out.println("2) Without breaks");
        for(int i =0; i< 3; i++){
            switch (i){
                case 0:
                    System.out.println(i);
                case 1:
                    System.out.println(i*2);
                default:
                    System.out.println(i*3);
            }
        }
        //Task 9
        System.out.println("Tssk 9");
        Fibonacci.printFibonacci(100);
    }

    private static String toBinaryString(int value) {
        String result = "";
        int copy = value;
        do {
            result = (copy % 2 != 0) ? 1 + result : 0 + result;
            copy >>>= 1;
        } while (copy != 0);
        return result;
    }

    static int test(int testValue, int begin, int end) {
        if (testValue > begin && testValue < end) {
            return +1;
        }
        if (testValue == begin || testValue == end) {
            return 0;
        }
        return -1;

    }

}

class Fibonacci {
    static void printFibonacci(int bound) {
        int F1 =1, F2 = 1;
        int currentValue = F1;
        for(int i = 0; currentValue < bound; i++){
            System.out.println(currentValue);
            if(i<1){
                continue;
            }
            currentValue = F1 + F2;
            F1 = F2;
            F2 = currentValue;
        }
    }
}
