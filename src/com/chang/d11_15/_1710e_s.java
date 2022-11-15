package com.chang.d11_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1710e_s {

        public int maximumUnits(int[][] boxTypes, int truckSize) {
            int sum=0;
       int [][] newbox=  sortTwo(boxTypes);
            for (int[] ints : newbox) {
                int cnt = Math.min(truckSize, ints[0]);
                sum += cnt * ints[1];
                truckSize -= cnt;

            }
  return   sum;
        }


    public int[][] sortTwo(int[][] arr) {
        int[][] last = new int[arr.length][arr[0].length];
        last = arr;
 int  num= arr.length;

        while (num>0) {
            for (int i = 0; i < last.length; i++) {
                if (i < last.length - 1) {
                    if (last[i][1] < last[i + 1][1]) {
                        int[] mid = new int[2];
                         mid=last[i];
                        last[i] = last[i + 1];
                        last[i + 1] = mid;
                    }
                }
            }
            num-=1;
        }

        return last;

    }
}