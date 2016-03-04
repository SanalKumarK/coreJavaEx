package corejava.ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

/**
 * Created by kurunsk on 22-02-2016.
 */
public class StringAllCombination {
    public static void main(String[] args) {
        String str = "ABCDEF";

        stringAllCombination(str.toCharArray(), "");
    }

    private static String stringAllCombination(char[] chars, String value){
        if(chars.length == 1){
            value += String.valueOf(chars[0]);
            System.out.println(value);
            return "";
        }
        else {
            int length = chars.length;
            String tmpValue = "";
            for(int i=0; i< length; i++) {
                char[] tmpArr = getRemovedArray(chars,i);
                tmpValue = value ;
                value+= String.valueOf(chars[i]);
                stringAllCombination(tmpArr,value);
                //System.out.println(value);
                value = tmpValue;
            }
           return value;
        }
    }

    private static String stringAllCombinationStr(char[] chars, String value){
        if(chars.length == 1){
            value += String.valueOf(chars[0]);
            System.out.println(value);
            return "";
        }
        else {
            int length = chars.length;
            String tmpValue = "";
            for(int i=0; i< length; i++) {
                char[] tmpArr = getRemovedArray(chars,i);
                tmpValue = value ;
                value+= String.valueOf(chars[i]);
                stringAllCombination(tmpArr,value);
                //System.out.println(value);
                value = tmpValue;
            }
            return value;
        }
    }

    private static char[] getRemovedArray(char[] arr, int skip){
        char[] newArr = new char[arr.length-1];
        int j=0;
        for(int i=0; i < arr.length ; i++) {
            if(skip != i){
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }
}