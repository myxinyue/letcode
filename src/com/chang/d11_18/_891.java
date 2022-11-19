package com.chang.d11_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class _891 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 3};
        System.out.println(sumSubseqWidths(arr));
    }

    public static int sumSubseqWidths(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }

        ArrayList<ArrayList<Integer>> arr = getSubArray(nums, nums.length);
        int sum = 0;
        for (ArrayList<Integer> integers : arr) {

            sum += ReturnMaxAndMin(integers);
        }
        return (int) (sum % (Math.pow(10, 9) - 7));
    }


    private static ArrayList<ArrayList<Integer>> getSubArray(int[] arr, int length) {
        ArrayList<ArrayList<Integer>> bList = new ArrayList<>();
        int mark = 0;
        int nEnd = 1 << length;
        boolean bNullset = false;
        for (mark = 0; mark < nEnd; mark++) {
            ArrayList<Integer> aList = new ArrayList<>();
            bNullset = true;
            for (int i = 0; i < length; i++) {
                if (((1 << i) & mark) != 0) {
                    bNullset = false;
                    aList.add(arr[i]);
                }
            }
            bList.add(aList);
        }
        return bList;
    }

    public static int ReturnMaxAndMin(ArrayList<Integer> nums) {
        if (nums.size() == 1) {
            return 0;
        }

        return 0;
    }
}
