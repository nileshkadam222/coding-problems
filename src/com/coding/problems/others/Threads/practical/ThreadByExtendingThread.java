package com.coding.problems.others.Threads.practical;

import java.util.stream.IntStream;

class MyThread extends Thread{

   public void run(){
       IntStream.range(1, 10).forEach(num-> System.out.println("Child Thread: " + num));
   }


}


public class ThreadByExtendingThread{
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        IntStream.range(1,10).forEach(num-> System.out.println("Parent thread: "+ num));
    }

}
