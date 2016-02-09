package corejava.ex;

/**
 * Created by kurunsk on 08-02-2016.
 */
public class CloneableEx implements Cloneable{

    int rollNo;
    String name;

    public CloneableEx(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }


    public int getData(){
        class X{
            int x;
            int y;

            public X(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }
        return 50/0;
    };

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final static void main(String[] args) {
        try {
            CloneableEx ex1 = new CloneableEx(1,"test");
            CloneableEx ex2 = (CloneableEx) ex1.clone();

            System.out.println(ex1.rollNo + "  "+  ex1.name);
            System.out.println(ex2.rollNo + "  "+  ex2.name);
            System.out.println(ex1.getData());
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
