package com.pavlyshyn;

public class Main {

    public static void main(String[] args) {
	// Task2
        Aliasing aliasing1 = new Aliasing(3);
        Aliasing aliasing2 = new Aliasing(4);
        System.out.println("aliasing1"+aliasing1+" "+"aliasing2"+aliasing2);
        aliasing1 = aliasing2;
        System.out.println("aliasing1"+aliasing1+" "+"aliasing2"+aliasing2);
        aliasing1.aFloat = 5;
        System.out.println("aliasing1"+aliasing1+" "+"aliasing2"+aliasing2);
    //Task3
        Letter letter = new Letter('a');
        System.out.println("letter1"+letter);
        ChangeLetterToZ(letter);
        System.out.println("letter1"+letter);
     //Task4
        Velocity velocity  = new Velocity();
        System.out.println(velocity.CalculateVelocity());
    //Task5
        Dog dog1 = new Dog("Spot", "Ruff!");
        Dog dog2 = new Dog("scruffy", "Wurf!");
        System.out.println(dog1+" "+dog2);
     //Task6
        Dog dog3 = dog1;
        System.out.println("dog1 == dog2: " + (dog1 == dog2) );
        System.out.println("dog1 == dog3: " + (dog1 == dog3) );
        System.out.println("dog2 == dog3: " + (dog2 == dog3) );
        System.out.println("dog1.equals(dog2): " + dog1.equals(dog2) );
        System.out.println("dog1.equals(dog3): " + dog1.equals(dog3) );
        System.out.println("dog2.equals(dog3): " + dog2.equals(dog3) );
     //Task7
        Coin coin = new Coin();
        coin.FlipCoin();
        System.out.println(coin);
    //Task8
        long heximal = 0xffaa;
        long octimal = 07701;
        System.out.println("heximal: " + Long.toBinaryString(heximal));
        System.out.println("octimal: " + Long.toBinaryString(octimal));
    //Task9
        System.out.println(Float.MIN_EXPONENT);
        System.out.println(Float.MAX_EXPONENT);
        System.out.println(Double.MIN_EXPONENT);
        System.out.println(Double.MAX_EXPONENT);
    //Task10
        int Val1 = 0xAA, Val2 = 0x55;
        System.out.println(Integer.toBinaryString(Val1));
        System.out.println(Integer.toBinaryString(Val2));
        System.out.println("Val1 & Val2 = " + Integer.toBinaryString(Val1 & Val2));
        System.out.println("Val1 | Val2 = " + Integer.toBinaryString(Val1 | Val2));
        System.out.println("Val1 ^ Val2 = " + Integer.toBinaryString(Val1 ^ Val2));
        System.out.println("~Val1 = " + Integer.toBinaryString(~Val1));
        System.out.println("~Val2 = " + Integer.toBinaryString(~Val2));
    }
    public static void ChangeLetterToZ(Letter letter){
        letter.symbol = 'z';
    }
}
