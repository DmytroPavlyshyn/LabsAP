package com.pavlyshyn;

import com.pavlyshyn.sample.DataOnlyModified;


public class Main {

    public static void main(String[] args) {
	    DataOnlyModified obj = new DataOnlyModified();
	    obj.i = 1;
	    obj.d = 1.5;
	    obj.b = true;

        System.out.println(obj.toString());
    }
}
