package com.chang.d11_11;

import javax.security.auth.Subject;

public class _1704 {
    public static void main(String[] args) {
//        StringBuilder a = new StringBuilder();
//        a.append("dadadadwaw");
//        int mid = a.length()/2;
//       String b = a.substring(0,mid);
//       String c= a.substring(mid);e
//        System.out.println(c);
//        System.out.println(b);

        System.out.println(halvesAreAlike("textbookacadcascasvzxcxczsdasdcaaaasgaegasravrcae"));

    }
   static  char[] yuan = {'a','e','i','o','u','A','E','I','O','U'};
    public  static boolean halvesAreAlike(String s) {

             if (s.length()%2==1){
         return  false;
             }
        StringBuilder  arr = new StringBuilder(s);
             int m = s.length()/2;
             String left = arr.substring(0,m);
             String  right = arr.substring(m);
             int count1=0,count2=0;
        char[] le= left.toCharArray();
        char[] ri= right.toCharArray();

            for (char c1 : le) {
                for (char c : yuan) {
                if (c1 ==c){
                    count1++;
                }
            }
        }
        for (char c1 : ri) {
            for (char c : yuan) {
                if (c1 ==c){
                    count2++;
                }
            }
        }


 return  count1==count2;
    }
}
