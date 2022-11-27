package basic_model;

public class test {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(){
            public void run(){
                System.out.println("Hello from new thread");
            }
        };

        myThread.start();

        Thread.yield();

        System.out.println("Hello from main thead");

        myThread.join();
    }
}
