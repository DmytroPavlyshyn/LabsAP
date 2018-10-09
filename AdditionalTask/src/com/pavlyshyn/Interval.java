package com.pavlyshyn;

public class Interval {
    private int start, end, sumOfOdd, sumOfEven;
    private int[] FibonacciSet;
    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public void printOddFromStartToEnd(){
        for(int i = start; i<end; i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }
    public void printEvenFromEndToStart(){
        for(int i = end; start<i; --i){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }

    public void printCustomFibonacciSet(int N){
        int F1, F2;
        FibonacciSet = new int[N];
        if(end%2 != 0){
            F1 = end;
            F2 = end - 1;
        }
        else {
            F1 = end - 1;
            F2 = end;
        }
        System.out.println(" F1 "+F1+" F2 "+F2);
        int sum = 0, prev1;
        FibonacciSet[0] = F1;
        FibonacciSet[1] = F2;
        for(int i = 2; i < N; i++){
            FibonacciSet[i]= FibonacciSet[i-2]+ FibonacciSet[i-1];
        }
        for(int i: FibonacciSet){
            System.out.println(i);
        }
    }
    public void printFibonacciOddAndEvenPersentage(){
        int numberOfOdd = 0;
        double persentage;
        for(int i:FibonacciSet){
            if(i%2!=0){
                numberOfOdd++;
            }
        }
        persentage = (double)numberOfOdd*100/FibonacciSet.length;
        System.out.println("Persentage of odd "+persentage + "Persentage of even " + (100 - persentage));
    }
}
