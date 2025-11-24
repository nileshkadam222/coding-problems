package com.coding.problems.others.thread.evenOdd;

public class EvenOdd2 {
    private final int maxNumber;
    private int counter = 1;

    public EvenOdd2(int maxNumber){
        this.maxNumber = maxNumber;
    }
    public void printEvenNumber(){
        while(maxNumber > counter){
            if(counter % 2 == 0){
                System.out.println("Even : "+ counter);
                counter ++;
            }
        }
    }


    public void printOddNumber(){
        while(maxNumber > counter){
            if(counter % 2 == 1){
                System.out.println("Odd : "+ counter);
                counter ++;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        EvenOdd2 evenOdd2 = new EvenOdd2(10);
        Thread evenThread = new Thread(evenOdd2::printEvenNumber);
        Thread oddThread = new Thread(evenOdd2::printOddNumber);
        evenThread.start();
        oddThread.start();

    }
}
