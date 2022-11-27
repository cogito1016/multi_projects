package basic_model;

public class Lock {
    public static void main(String[] args) throws InterruptedException {
        class Counter{
            private int counter =0 ;
            public synchronized void increment() {++counter;}
            public int getCounter() {return counter;}
        }

        final Counter counter = new Counter();

        class CountingThread extends Thread{
            public void run(){
                for(int x=0; x<10000; x++){
                    counter.increment();
                }
            }
        }

        CountingThread countingThread1 = new CountingThread();
        CountingThread countingThread2 = new CountingThread();
        countingThread1.start();
        countingThread2.start();
        countingThread1.join();
        countingThread2.join();

        System.out.println(counter.getCounter());
    }
}
