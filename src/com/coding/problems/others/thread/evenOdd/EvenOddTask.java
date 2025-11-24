package com.coding.problems.others.thread.evenOdd;

public class EvenOddTask {


    int counter = 1;

    static int N;


    public void printOddNumber()
    {
        synchronized (this)
        {
            while (counter < N) {
                //wait for even number
                while (counter % 2 == 0) {
                    try {
                        wait();
                    }
                    catch (
                            InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Odd : "+ counter);
                counter++;
                notify();
            }
        }
    }

    // Function to print even numbers
    public void printEvenNumber()
    {
        synchronized (this)
        {
            while (counter < N) {
                //wait for odd number to print
               while (counter % 2 == 1) {
                    try {
                        wait();
                    }
                    catch (
                            InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Even: "+ counter);
                counter++;
                notify();
            }
        }
    }

}
