//: initialization/Overloading.java
// Demonstration of both constructor
// and ordinary method over
package com.pavlyshyn;
//:Overloading.java
/**
 * Create tree that have one field height and two methods
 * @author Dmytro Pavlyshyn
 * @version 1.0
 *
 * */
class Tree {
    int height;
    /**
     * Constructor by default
     * @param args No arguments
     * @throws exceptions No exceptions thrown
     */
    Tree() {
        System.out.println("Planting a seedling");
        height = 0;
    }
    /**
     * Constructor
     * @param args int
     * @throws exceptions No exceptions thrown
     */
    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Creating new Tree that is " + height + " feet tall");
    }
    /**
     * Displays information about height of tree
     * @param args No arguments
     * @throws exceptions No exceptions thrown
     */
    void info() {

        System.out.println("Tree is " + height + " feet tall");
    }
    /**
     * Displays information about height of tree
     * @param args No arguments
     * @throws exceptions String
     */
    void info(String s)
    {
        System.out.println(s + ": Tree is " + height + " feet tall");
    }
}
/**
 * Create 5 objects of class Tree and display their height
 * @author Dmytro Pavlyshyn
 * @version 1.0
 *
 * */
public class Overloading {
    /**
     * Entry point to class & application.
     *
     * @param args No arguments
     * @throws exceptions No exceptions thrown
     */
    public static void runOverloading() {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
        // Overloaded constructor:
        new Tree();
    }
} /* Output:
Creating new Tree that is 0 feet tall
Tree is 0 feet tall
overloaded method: Tree is 0 feet tall
Creating new Tree that is 1 feet tall
Tree is 1 feet tall
overloaded method: Tree is 1 feet tall
Creating new Tree that is 2 feet tall
Tree is 2 feet tall
overloaded method: Tree is 2 feet tall
Creating new Tree that is 3 feet tall
Tree is 3 feet tall
overloaded method: Tree is 3 feet tall
Creating new Tree that is 4 feet tall
Tree is 4 feet tall
overloaded method: Tree is 4 feet tall
Planting a seedling
*///:~
