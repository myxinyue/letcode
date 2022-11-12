package com.chang.d11_6;

public class _540 {
    public static void main(String[] args) {
        System.out.println(singleNonDuplicate(new int[]{ 1,1, 2,2, 3, 3, 4, 4,6}));
    }


    public  static int singleNonDuplicate(int[] nums) {
        for ( int i = 0 ; i<nums.length;i++ ){
            if( i == nums.length-1){
                return nums[i];
            }
            else if (nums[i]==nums[i+1]){
                i = i+1;
            }else {
                return  nums[i];
            }
          }
           return  -1;
    }
    }