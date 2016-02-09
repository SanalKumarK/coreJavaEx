package corejava.ex;

import java.util.Date;
import java.util.Vector;

/**
 * Created by kurunsk on 09-02-2016.
 */
public class Consumer extends Thread{

    Producer producer;

    public Consumer(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {
        while(true){
            System.out.println(producer.getMessage());
        }
    }

    public static void main(String[] args) {
        Producer prod = new Producer();
        prod.start();
        new Consumer(prod).start();
    }
}

class Producer extends Thread {
    private Vector<String> messages = new Vector<>();
    private int MAX_QUEUE = 5;

    @Override
    public void run() {
        while(true){
            putMessage();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void putMessage(){
        if(messages.size() >= MAX_QUEUE){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        messages.add(new Date().toString());
        notify();
    }

    public synchronized String getMessage() {
        String msg = "";
        try {
            if(messages.size() == 0){
                wait();
            }
            msg = messages.remove(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();
        return msg;
    }
}