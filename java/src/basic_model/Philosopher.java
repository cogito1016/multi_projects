package basic_model;

import java.util.Random;

public class Philosopher extends Thread{
    private boolean left, right;
    private Random random;

    public Philosopher(boolean left, boolean right){
        this.left = left;
        this.right = right;
        random = new Random();
    }

    public void run(){
        try{
            while(true){
                Thread.sleep(random.nextInt(1000));
                synchronized (left){
                    synchronized (right){
                        Thread.sleep(random.nextInt(1000));
                    }
                }
            }
        }catch (InterruptedException e){

        }

    }
}
