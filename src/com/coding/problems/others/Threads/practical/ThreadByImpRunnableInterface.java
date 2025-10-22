package com.coding.problems.others.Threads.practical;


class runnableThread implements Runnable{

    @Override
    public void run() {
        System.out.println("[Child Thread]: "+ Thread.currentThread().getName() + "  Thread : " + "Priority : "+ Thread.currentThread().getPriority());
    }
}
public class ThreadByImpRunnableInterface {
    public static void main(String[] args) {
        runnableThread runnable = new runnableThread();
        Thread thread =  new Thread(runnable);
        thread.setName("Runnable task 1");
        thread.start();
        Thread thread1 =  new Thread(runnable);
        thread1.setName("Runnable task 2");
        thread1.start();
        thread1.setPriority(8);
        System.out.println("[Parent Thread] : " + Thread.currentThread().getName() + "  Thread : " + "Priority : "+ Thread.currentThread().getPriority());

    }

}
