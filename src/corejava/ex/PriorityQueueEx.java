package corejava.ex;

import java.util.PriorityQueue;

/**
 * Created by kurunsk on 01-03-2016.
 */
public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<A> pqueue = new PriorityQueue<>();
        pqueue.add(new A(1,"Achhu"));
        pqueue.add(new A(8,"Ana"));
        pqueue.add(new A(1,"kanna"));
        pqueue.add(new A(6,"Muddu"));

        while(!pqueue.isEmpty()){
            System.out.println(pqueue.poll().toString());
        }
    }
}

class A implements Comparable{

    @Override
    public int compareTo(Object o) {
        return (i - ((A)o).i);
    }

    private int i;
    private String s;

    @Override
    public String toString() {
        return "A{" +
                "i=" + i +
                ", s='" + s + '\'' +
                '}';
    }

    public A(int i, String s) {
        this.i = i;
        this.s = s;
    }
}
