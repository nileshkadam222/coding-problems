package com.coding.problems.others.Threads;


/* List<String> buffer =
 maxSize = 5
 Producer :
    T1
    T2

  Consumer :
    T1
    T2

    Step 1: init the buffer
    Step 2: producer will produce the data in buffer if buffer us not full
    Step 3: consumer will retrive the data from buffer if buffer is not empty

 */

import java.util.stream.IntStream;

public class ProducerConsumerProblem {

    public static void main(String[] args) {
        SharedData queue = new SharedData(5);

        IntStream.range(0,3).forEach(f->
                new Thread(()->{
                    int counter = 0;
                    while(true){
                        queue.produceData(Thread.currentThread().getName()+"-"+counter);
                        counter++;
                    }
                }, "producer-"+f).start()
        );

        for(int i=0; i< 6; i++){
            new Thread( () -> {
                while (true){
                    queue.consumeData();
                }
            }, "consumer"+i).start();

        }
    }

}
