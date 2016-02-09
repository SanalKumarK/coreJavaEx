package corejava.ex;

/**
 * Created by kurunsk on 09-02-2016.
 */
public class ThreadNotifyMech {

    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        b.start();

        synchronized (b){
            try {
                b.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Total " + b.sum);
        }
    }
}

class ThreadB extends Thread{
    int b;
    int sum = 0;

    @Override
    public void run() {
        synchronized (this){
            for(int i=1;i<=1000;i++){
                sum += i;
            }
           notify();
        }
    }
}
