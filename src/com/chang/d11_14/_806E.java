package com.chang.d11_14;

public class _806E {
    public  static void main(String[] args) {
           Solution a = new Solution();
        System.out.println(a.numberOfLines(new int[]{4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "bbbcccdddaaa")[1]);
    }
    /*我们要把给定的字符串 S 从左到右写到每一行上，每一行的最大宽度为100个单位，如果我们在写某个字母的时候会使这行超过了100 个单位，
    那么我们应该把这个字母写到下一行。我们给定了一个数组 widths ，这个数组 widths[0] 代表 'a' 需要的单位， widths[1] 代表 'b' 需要的单位，
            ...， widths[25] 代表 'z' 需要的单位。 现在回答两个问题：至少多少行能放下S，以及最后一行使用的宽度是多少个单位？
    将你的答案作为长度为2的整数列表返回。*/

    static class Solution {
//        public int[] numberOfLines(int[] widths, String s) {
//            char[] arr = s.toCharArray();
//            int sum =0,rows=0,last=0;
//            for (char c : arr) {
//                sum+=widths[c-97];
//            }
//            rows = (sum/100)+(sum%100==0? sum%100 : 1);
//            last= ((sum - rows*100)>=0 ? (sum - rows*100) :((sum - rows*100)+100 ));
//     return new int[]{rows,last};
//        }

        public int[] numberOfLines(int[] widths, String s) {
            char[] arr = s.toCharArray();
            int sum =0,rows=0,last=0;
            for (char c : arr) {
                if((sum+widths[c-97])>100){
                    sum =widths[c-97];
                    rows++;
                }else
                {
                    sum+=widths[c-97];
                }

            }

     return new int[]{rows,sum};
        }

    }

}
