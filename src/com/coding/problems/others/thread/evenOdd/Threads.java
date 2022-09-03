package com.coding.problems.others.thread.evenOdd;

public class Threads {

    public static void main(String[] args)
    {
        EvenOddTask mt = new EvenOddTask();
        mt.N = 10;

        // Create thread t1
        Thread t1 = new Thread(()-> {
            mt.printEvenNumber();
        });

        Thread t2 = new Thread(()->{
           mt.printOddNumber();
        });

        // Start both threads
        t1.start();
        t2.start();
    }
}
