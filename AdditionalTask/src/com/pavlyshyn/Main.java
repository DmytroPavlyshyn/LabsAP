package com.pavlyshyn;

public class Main {

    public static void main(String[] args) {
	Interval interval = new Interval(45, 85);
	interval.printOddFromStartToEnd();
	interval.printEvenFromEndToStart();
	interval.printCustomFibonacciSet(10);
	interval.printFibonacciOddAndEvenPersentage();


}
