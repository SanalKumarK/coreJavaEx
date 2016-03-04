package corejava.ex;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by kurunsk on 24-02-2016.
 */
public class TreeSetEx {
    public static void main(String[] args) {
        /*Set set = new TreeSet<>();
        set.add(new Item(0,"Bangara"));
        set.add(new Item(2,"Kanna"));
        set.add(new Item(2,"Kunna"));
        set.add(new Item(1,"Achu"));
        set.add(new Item(3,"Muddu"));*/

        TreeMap map = new TreeMap<>();

        map.put(new Item(2,"Chinni"),2);
        map.put(new Item(1,"Achu"),1);
        map.put(new Item(2,"Kanna"),2);
        map.put(new Item(3,"Muddu"),3);
        map.put(new Item(0,"Bangara"),0);

        Iterator it = map.keySet().iterator();
        while(it.hasNext()){
            System.out.println(map.get(it.next()));//.toString());
        }
    }
}

class Base {

}

class Child extends Base {

    public void method1 (){

    }
}

class Item implements Comparable{
    protected int i;
    protected String s;

    public Item(int i, String s) {
        this.i = i;
        this.s = s;
    }

    @Override
    public int compareTo(Object o) {
        return i - ((Item)o).i;
    }

    @Override
    public String toString() {
        return "Item{" +
                "i=" + i +
                ", s='" + s + '\'' +
                '}';
    }
}
