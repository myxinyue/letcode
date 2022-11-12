package com.chang.d10_25;

public class test1 {




    public static void main(String[] args) {
        int [] a=twoSum(new int[]{ 3,2 ,4},6);
        for (int i : a) {
            System.out.println(i);
        }

    }
    public static int[] twoSum(int[] nums, int target) {
        int a [] =new int [2];
        for( int i = 0 ;i< nums.length ; i++ ){

            for( int j= (i+1);j < nums.length; j++ ){
                if( (nums[i]+ nums[j])==target) {
                    a[0] = i;
                    a[1] = j;
                }
            }

        }
        return a;
    }
}
