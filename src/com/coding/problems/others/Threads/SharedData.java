package com.coding.problems.others.Threads;

import java.util.ArrayList;
import java.util.List;

public class SharedData {

    private final List<String> buffer;
    private final int MAX_SIZE;

    public SharedData(int MAX_SIZE) {
        this.MAX_SIZE = MAX_SIZE;
        this.buffer = new ArrayList<>();
    }

    public synchronized void produceData(String data){
        String threadName = Thread.currentThread().getName();
        while (buffer.size() == MAX_SIZE){
            try {
                System.out.println("[ " +threadName + "] [waiting] :  buffer is full");
                wait();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("[ " +threadName + "] [Producing] :  data : " + data);
        buffer.add(data);
        notifyAll();
    }

    public synchronized void consumeData(){
        String threadName = Thread.currentThread().getName();
        if(buffer.isEmpty()){
            try {
                System.out.println("[ " +threadName + "] [waiting] :  buffer is empty");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("[ " +threadName + "] [consuming] :  data : " + buffer.get(0));
         buffer.remove(0);
        notifyAll();
    }
}
