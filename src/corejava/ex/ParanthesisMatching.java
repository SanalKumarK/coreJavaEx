package corejava.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * Created by kurunsk on 18-02-2016.
 */
public class algorithm {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String eqn = "<<{[]}>>";
        String eqn = null;
        try {
            eqn = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        char[] eqnChar = eqn.toCharArray();

        if(eqnChar.length > 0){
            System.out.println(algorithm.validateSyntax(eqnChar));
        }
    }

    private static boolean validateSyntax(char[] patternStr){

        Stack stack = new Stack();

        for (char ch : patternStr) {
            if("{[<".indexOf(ch) > -1 ){
                stack.push(ch);
            }
            else if("}]>".indexOf(ch) > -1) {
                if(stack.peek() != null){
                    char topCh = (char) stack.pop();
                    if(ch == '}' && topCh != '{'){
                        return false;
                    } else if(ch == ']' && topCh != '['){
                        return false;
                    } if(ch == '<' && topCh != '>'){
                        return false;
                    }
                }
            }
            System.out.println(ch);
        }

        if(stack.size() == 0){
            return true;
        } else {
            return false;
        }
    }
}
