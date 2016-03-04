package corejava.ex;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by kurunsk on 19-02-2016.
 */
public class KnapSackProblem {

    public static void main(String[] args) {
        int max_count = 2;
        //int[] weights = {1,3,9,4,5};

        //Stack stack = new Stack();
        //stack.push(1);stack.push(3);stack.push(2);
        //stack.push(1);stack.push(3);stack.push(9);stack.push(4);stack.push(5);
        ArrayList stack = new ArrayList();
        //stack.add(1);stack.add(3);stack.add(2);
        stack.add(1);stack.add(3);stack.add(9);stack.add(4);stack.add(5);
        System.out.println("MaxSum by taking " + max_count+" values from the array - " + knapSackProblem(stack,max_count,0));
    }

    private static int knapSackProblem(ArrayList stack, int count, int value){
        if(count == 0 || stack.size() == 0){
            return value;
        }
        else{
            System.out.println("#####################################");
            //dont include first element
            Integer curValue = (Integer) stack.remove(0);

            int firstValue = knapSackProblem((ArrayList) stack.clone(), count, value);
            System.out.println("firstValue " + firstValue);
            int secondValue = knapSackProblem((ArrayList) stack.clone(), --count, value + curValue);
            System.out.println("secondValue " + secondValue);
            System.out.println("#####################################");
            //include first element
            return Math.max(firstValue, secondValue);
        }
    }
}
