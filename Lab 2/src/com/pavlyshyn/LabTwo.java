package com.pavlyshyn;

public class LabTwo {

    public static void main(String[] args) {
	// Task2
        System.out.println("Task 2");
        Aliasing aliasing1 = new Aliasing(3);
        Aliasing aliasing2 = new Aliasing(4);
        System.out.println("aliasing1"+aliasing1+" "+"aliasing2"+aliasing2);
        aliasing1 = aliasing2;
        System.out.println("aliasing1"+aliasing1+" "+"aliasing2"+aliasing2);
        aliasing1.aFloat = 5;
        System.out.println("aliasing1"+aliasing1+" "+"aliasing2"+aliasing2);
    //Task3
        System.out.println("Task 3");
        Letter letter = new Letter('a');
        System.out.println("letter1"+letter);
        ChangeLetterToZ(letter);
        System.out.println("letter1"+letter);
     //Task4
        System.out.println("Task 4");
        Velocity velocity  = new Velocity();
        System.out.println(velocity.CalculateVelocity());
    //Task5
        System.out.println("Task 5");
        Dog dog1 = new Dog("Spot", "Ruff!");
        Dog dog2 = new Dog("scruffy", "Wurf!");
        System.out.println(dog1+" "+dog2);
     //Task6
        System.out.println("Task 6");
        Dog dog3 = dog1;
        System.out.println("dog1 == dog2: " + (dog1 == dog2) );
        System.out.println("dog1 == dog3: " + (dog1 == dog3) );
        System.out.println("dog2 == dog3: " + (dog2 == dog3) );
        System.out.println("dog1.equals(dog2): " + dog1.equals(dog2) );
        System.out.println("dog1.equals(dog3): " + dog1.equals(dog3) );
        System.out.println("dog2.equals(dog3): " + dog2.equals(dog3) );
     //Task7
        System.out.println("Task 7");
        Coin coin = new Coin();
        coin.FlipCoin();
        System.out.println(coin);
    //Task8
        System.out.println("Task8");
        long heximal = 0xffaa;
        long octimal = 07701;
        System.out.println("heximal: " + Long.toBinaryString(heximal));
        System.out.println("octimal: " + Long.toBinaryString(octimal));
    //Task9
        System.out.println("Task 9");
        System.out.println(Float.MIN_EXPONENT);
        System.out.println(Float.MAX_EXPONENT);
        System.out.println(Double.MIN_EXPONENT);
        System.out.println(Double.MAX_EXPONENT);
    //Task10
        System.out.println("Task 10");
        int Val1 = 0xAA, Val2 = 0x55;
        System.out.println(Integer.toBinaryString(Val1));
        System.out.println(Integer.toBinaryString(Val2));
        System.out.println("Val1 & Val2 = " + Integer.toBinaryString(Val1 & Val2));
        System.out.println("Val1 | Val2 = " + Integer.toBinaryString(Val1 | Val2));
        System.out.println("Val1 ^ Val2 = " + Integer.toBinaryString(Val1 ^ Val2));
        System.out.println("~Val1 = " + Integer.toBinaryString(~Val1));
        System.out.println("~Val2 = " + Integer.toBinaryString(~Val2));

        //Task11
        System.out.println("Task 11");
        int heximal2 = 0xAAAA;
        while(heximal2!=0) {
            System.out.println(Integer.toBinaryString(heximal2));
            heximal2>>=1;
        }
        //Task12
        System.out.println("Task 12");
        heximal2 =-1;
        System.out.println(Integer.toBinaryString(heximal2));
        heximal2 <<= 10;
        System.out.println(Integer.toBinaryString(heximal2));
        while (heximal2!=0){
            heximal2 >>>= 1;
            System.out.println(Integer.toBinaryString(heximal2));
        }
        //Task13
        System.out.println("Task 13");
        for(char i ='a'; i< 8+'a'; i++){
            System.out.println("Char:" + i + " Binary code:" + Integer.toBinaryString(i));
        }
        //Task14
        System.out.println("Task 14");
        сompareStringAndPrint("Test14", "Test14");
        сompareStringAndPrint("Test14", "Test1");
    }

    public static void сompareStringAndPrint(String s1, String s2) {
        System.out.println(s1 + "==" + s2 +" :" + (s1 == s2));
        System.out.println(s1 + "!=" + s2 +" :" + (s1 != s2));
        System.out.println(s1 + ".equals(" + s2 +") :" + s1.equals(s2));
    }
    public static void ChangeLetterToZ(Letter letter){
        letter.symbol = 'z';
    }
}
