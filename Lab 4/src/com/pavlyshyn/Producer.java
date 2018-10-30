package com.pavlyshyn;

import java.util.Queue;

public class Producer {
    public  static Queue<Command> produce(Queue<Command> stringQueue){
        stringQueue.offer(new Command("moveLeft"));
        stringQueue.offer(new Command("moveRight"));
        stringQueue.offer(new Command("moveUp"));
        stringQueue.offer(new Command("moveDown"));
        stringQueue.offer(new Command("jump"));
        return stringQueue;
    }
}
