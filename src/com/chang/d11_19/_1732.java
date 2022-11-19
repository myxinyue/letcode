package com.chang.d11_19;

import java.util.Arrays;

public class _1732 {
    public static void main(String[] args) {

        System.out.println(largestAltitude(new int[]{-5, 1, 5, 0, -7}));
    }



    public static int largestAltitude(int[] gain) {
//        int [ ] arr = new int [gain.length+1];
//        arr[1]=0;
//
//        for (int i = 0 ; i <gain.length;i++){
//            if(i==0){
//                arr[i+1]=gain[i];
//            }
//            arr[i+1]=arr[i]+gain[i];
//        }
//        Arrays.sort(arr);
//        return arr[arr.length-1];

        int now =0 , sum =0;
        for (int i : gain) {
             now +=i;
             sum=Math.max(now,sum);

        }
        return sum;

    }
}
