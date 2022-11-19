package com.chang.easy;

public class _14 {
    public static void main(String[] args) {

    }

    public String longestCommonPrefix(String[] strs) {
        String s="";
        StringBuilder  a =  new StringBuilder(s);  //初始化一个空的StringBulider
        int minlen = 201;    //题目告诉我们最大为200的每个字符串。
        for(String str : strs){   //得到最小字符串的长度
            minlen= Math.min(str.length(),minlen) ;

        }
        for(int i =0 ;i<minlen;i++){   //最外层为最小字符串的长度，循环这么多次就行了。
            for(int j=0 ;j<strs.length-1 ; j++){
                if(strs[j].charAt(i)!= strs[j+1].charAt(i)){  //判断每个字符串该位置出是否相等，不相等直接返回当前字符串就行。
                    return a.toString();
                }


            }
            a.append(strs[0].charAt(i));
        }
        return a.toString();
    }
}
