package corejava.ex;

/**
 * Created by kurunsk on 09-02-2016.
 */
public class ThreadOddEven {
    public static void main(String[] args) {
        Counter even = new Counter(); even.setName("Even Thread");
        Counter odd = new Counter(); odd.setName("Odd Thread");

        even.start();
        odd.start();
    }
}


class Counter extends Thread {
    static Integer counter = 0;

    @Override
    public void run() {
        synchronized (counter){
            while(counter <= 100){
                System.out.println(counter ++ + " - " + Thread.currentThread().getName());
            }
        }
    }
}