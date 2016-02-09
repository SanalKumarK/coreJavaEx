package corejava.ex;

/**
 * Created by kurunsk on 09-02-2016.
 */
public class LoaderThread implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println("Started " + Thread.currentThread().getName());
            Thread.sleep(3000);
            System.out.println("Ended " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.err.println(Thread.currentThread().getName());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new LoaderThread());
        Thread t2 = new Thread(new LoaderThread());
        Thread t3 = new Thread(new LoaderThread());
        t1.setName("A");t1.start();
        t1.interrupt();
        t2.setName("B");
        t3.setName("C");
        /*try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        t2.start();
       /* try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        t3.start();
    }

}
