package com.chang.d11_13;

import java.util.ArrayList;
import java.util.List;

public class _6234 {
    public static void main(String[] args) {
        System.out.println(subarrayLCM(new int[]{3, 6, 2, 7, 1}, 6));
    }



    /*给你一个整数数组 nums 和一个整数 k ，请你统计并返回 nums 的 子数组 中满足 元素最小公倍数为 k 的子数组数目。
    子数组 是数组中一个连续非空的元素序列。
    数组的最小公倍数 是可被所有数组元素整除的最小正整数。*/
    public  static int subarrayLCM(int[] nums, int k) {
          int sum =0;
        for (int i = 0; i < nums.length; i++) {
            int H= nums[i];
            for (int j = i; j < nums.length; j++) {
                H = lcm(H,nums[j]);     //把最先公倍数作为一个数再求公倍数
                if(H == k)
                    sum++;
                 if (H>k)
                    break;

            }

        }
return sum;
    }
//        if(nums.length==1){
//            if(nums[0]%k==0&&k>nums[0])
//            return nums[0];
//            else return 0;
//        }
//        List<Integer> arr = new ArrayList<>();
//        for (int num : nums) {
//          if(k%num==0 && num !=1){
//              arr.add(num);
//        }
//    }
//       // return (int) (Math.pow(2,arr.size())-1);  //全部子集
//        return    (int) (Math.pow(2,arr.size()-1));
//

//}


    public static int gcd (int a ,int b){ //最大公约数
        return b>0 ? gcd(b,a%b): a;
    }
    public static  int lcm (int a ,int b){ //最小公倍数
        return  a*b/gcd(a,b);

    }
}