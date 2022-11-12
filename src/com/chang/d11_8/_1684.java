package com.chang.d11_8;

public class _1684 {
    public static void main(String[] args) {



        int a = countConsistentStrings("ab",new String[]{"ad","bd","aaab","baa","badab"});
        System.out.println(a);
    }

//
    public static int countConsistentStrings(String allowed, String[] words) {
        int sum = 0;
        for ( int i =0; i< words.length; i++){  //遍历字符串数组
            sum++;
            char[] arr= words[i].toCharArray();    //将字符串数组，中的每一个字符串，转为字符数组
            for(int j= 0 ;j < arr.length;j++){   //遍历字符数组
                if((allowed.contains(arr[j]+"")) == false){      // 字符+ “” =字符串
                    sum--;
                    break;
                }
            }
        }
        return sum;
    }
}
