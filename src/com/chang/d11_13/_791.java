package com.chang.d11_13;

import org.w3c.dom.ls.LSOutput;

public class _791 {
    public static void main(String[] args) {
            String a= "cba";
            String b= "abcd";
            String c= customSortString(a,b);
        System.out.println(c);
    }



//    给定两个字符串 order 和 s 。order 的所有单词都是 唯一 的，并且以前按照一些自定义的顺序排序。
//    对 s 的字符进行置换，使其与排序的 order 相匹配。更具体地说，如果在 order 中的字符 x 出现字符 y 之前，
//    那么在排列后的字符串中， x 也应该出现在 y 之前。   返回 满足这个性质的 s 的任意排列 。

    public static
      String customSortString(String order, String s) {   //order 26 字母   s 给定重拍的字符串
        StringBuilder  ss = new StringBuilder();
  StringBuilder  sss= new StringBuilder(s);
        char[]  or = order.toCharArray();
        char[] sh = s.toCharArray();
        for (char c : or) {
            for (char sh1 : sh) {
                if(sh1==c){
                    ss.append(sh1);   //获得根据order排序的字符串，此时字符串的位数还不对
                }
            }
        }
         char[]  secs=ss.toString().toCharArray();
         if(ss.isEmpty()){
             return  s;
         }else{
             if(ss.length() >=s.length()){
                 return ss.toString();
             }
             else {
                 for (char sec : secs) {
                     sss.delete(sss.indexOf(sec+""),sss.indexOf(sec+"")+1);   //得到没有排序的字符串
                 }
              return ss.append(sss).toString(); //将没有排序的字符串添加在排序字符串的后面
             }
         }

    }
}
