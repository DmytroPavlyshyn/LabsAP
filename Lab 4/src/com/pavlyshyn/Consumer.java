package com.pavlyshyn;

import java.util.Queue;

public class Consumer {
    public static void consume(Queue<Command> stringQueue){
        while (stringQueue.peek()!=null){
            System.out.println(stringQueue.remove().operation());
        }
    }
}
