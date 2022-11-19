package com.chang.easy;

import java.util.ArrayList;

public class _9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(11211));
    }


    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;

        }
        int h = x;
        int m= 0;
        ArrayList<Integer> arr = new ArrayList<>();

        while (h > 0) {
        m=m*10+h%10;   //反转数字
        h=h/10;
        }
return m==x;
    }
}
