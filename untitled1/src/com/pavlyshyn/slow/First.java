package com.pavlyshyn.slow;



public class First {
    public static void print(String s){
        setTimeout(() -> System.out.println("Hello"),4000);

    }
    public static void setTimeout(Runnable runnable, int delay){
        new Thread(() -> {
            try {
                Thread.sleep(delay);
                runnable.run();
            }
            catch (Exception e){
                System.err.println(e);
            }
        }).start();
    }
}
