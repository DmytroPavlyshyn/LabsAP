package com.pavlyshyn;

public class Main {

    public static void main(String[] args) {
        Boolean BoolO = new Boolean(false);
        boolean pbool = BoolO;
        System.out.println("pbool:"+pbool);

        Character CharO = new Character('A');
        char pchar = CharO;
        System.out.println("pchar: "+ pchar);

        Byte ByteO = new Byte((byte) 1);
        byte pbyte = ByteO;
        System.out.println("pbyte: "+pbyte);

        Short ShortO = new Short((short) 2);
        short pshort = ShortO;
        System.out.println("pshort: "+pshort);

        Integer IntO = new Integer(3);
        int pint = IntO;
        System.out.println("pint: "+ pint);

        Long LongO = new Long(4);
        long plong = LongO;
        System.out.println("plong: "+ plong);

        Float FloatO = new Float(4.5);
        float pfloat = FloatO;
        System.out.println("pfloat: "+ pfloat);

        Double DoubleO = new Double(5.5);
        double pdouble = DoubleO;
        System.out.println("pdouble: " + pdouble);

    }
}
