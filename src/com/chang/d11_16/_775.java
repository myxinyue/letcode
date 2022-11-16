package com.chang.d11_16;

public class _775 {
    public static void main(String[] args) {
        System.out.println(isIdealPermutation(new int[]{1, 2, 0}));
    }

        public  static  boolean isIdealPermutation(int[] nums) {
          //局部倒置

            //暴力超时
            /*
            int  ju =0;
            int all =0;
            for (int i = 0; i < nums.length; i++) {
                if(i< nums.length-1){
                    if(nums[i]>nums[i+1]){
                        ju++;
                    }
                }
                for (int j = i+2; j < nums.length; j++) {
                    if(nums[i]>nums[j]){
                        all++;
                    }
                }

            }
            if ( ju==all){
                return true;
            }

            return false;*/


            //我们可以得知全局一定包含局部，找出所有的局部，还有其他就输出false
            int max=nums[0];
            for(int i=2;i<nums.length;i++){
                if(nums[i]<max){
                    return false;
                }
                max=Math.max(max,nums[i-1]); //要求下标小的大，因此上，只要找出下标之前最小的并且将其输出，判断是不是存在全局输出，即可
            }
            return true;


        }


}
