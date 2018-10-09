package com.pavlyshyn;
import com.pavlyshyn.fast.*;
public class Main1 {
    public static void main(String[] args) {
    var a = "123";
    a = "1 2 3 4 5";
        System.out.println(a.split("\\s"));
    }

}

class Second extends  First{

    public void print(String s){

        super.print("print2\n"+s);
    }
}

