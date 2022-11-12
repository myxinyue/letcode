package com.chang.d11_6;

public class _69 {
    public static void main(String[] args) {

        int f = mySqrt(8);
        System.out.println(f);
    }

    public static int mySqrt(int x) {
//
                int l = 1, h = x;
                while(l <= h){
                    int mid = l + (h - l) / 2;
                    int sqrt = x / mid;
                    if(sqrt == mid) return mid;
                    else if(sqrt < mid) h = mid - 1;
                    else l = mid + 1;
                }
                return h;
    }




}