package com.chang.easy;

import java.util.HashMap;
import java.util.Map;

public class _13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }
    public static int romanToInt(String s) {
//
//       char [] sarr = s.toCharArray();
//       int sum =0;
//        for (int i =0;i<sarr.length;i++) {
//           switch (sarr[i]){
//               case 'I':
//          sum+=1;
//                   break;
//               case 'V':
//                 if(sarr.length==1){
//                     sum+=5;
//                 }
//                 if(i>=1){
//                     if(sarr[i-1]=='I'&& sarr.length==2){
//                     sum=4;
//               }else{
//                         sum += 5;
//                     }  }else{
//                sum += 5;
//            }
//
//                   break;
//               case 'X':
//                   if(sarr.length==1)
//                       sum+=10;
//                   if(i>=1) {
//                   if (sarr[i - 1] == 'I'&& sarr.length==2) {
//                       sum = 9;
//                   }else {
//                       sum += 10;
//                   } }else {
//                       sum += 10;
//                   }
//
//                   break;
//               case 'L':
//                   if(sarr.length==1){
//                       sum+=50;
//                   }
//                   if (i>=1) {
//                       if(sarr[i-1]=='X'&& sarr.length==2){
//                       sum=40;
//                   }else{
//                           sum+=50;
//                       } }else{
//                       sum+=50;
//                   }
//
//
//                   break;
//               case 'C':
//                   if(sarr.length==1){
//                       sum+=100;
//                   }
//                   if (i>=1) {
//                       if(sarr[i-1]=='X'&& sarr.length==2){
//                       sum=90;
//                   }else{
//                           sum+=100;
//                       }}else{
//                       sum+=100;
//                   }
//
//                   break;
//               case 'D':
//                   if(sarr.length==1){
//                       sum+=500;
//                   }
//                   if (i>=1) {
//                       if(sarr[i-1]=='C' && sarr.length==2){
//                       sum=400;
//                   }else{
//                           sum+=500;
//                       } }else{
//                       sum+=500;
//                   }
//
//                   break;
//               case 'M':
//                   if(sarr.length==1){
//                       sum+=1000;
//                   }
//                   if (i>=1) {
//                       if(sarr[i-1]=='C'&& sarr.length==2){
//                       sum=900;
//                   } else{
//                           sum+=1000;
//                       }}
//                       else{
//                       sum+=1000;
//                   }
//
//                   break;
//           }
//
//        }
//        return  sum;

        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);

        int ans = 0;
        for(int i = 0;i < s.length();) {
            if(i + 1 < s.length() && map.containsKey(s.substring(i, i+2))) {  //向上判断两个字符如果是结合哪几种特殊情况就一起组合起来当成一个值
                ans += map.get(s.substring(i, i+2)); //value取值
                i += 2;
            } else {
              ans += map.get(s.substring(i, i+1));  // 取当前值
                i ++;
            }
        }
        return ans;
    }

}
