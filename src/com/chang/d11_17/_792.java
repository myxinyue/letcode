package com.chang.d11_17;

public class _792 {


    public static void main(String[] args) {
        String a= "abcde";
        String [] word = new String[]{"a","bb","acd","ace"};
        System.out.println(numMatchingSubseq(a, word));

    }


        public   static int numMatchingSubseq(String s, String[] words) {
            int sum =0;
            char sarr [] = s.toCharArray();
            StringBuilder str = new StringBuilder();

            for (String word : words) {
                int sym=0;
                char  [] sword=word.toCharArray();  //字符串数组中的每一个字符串变为字符数组
                for (int i = 0; i < sword.length; i++) {
                    for (int j = sym; j < sarr.length; j++) {
                        if(sword[i]==sarr[j]){
                            sym =j+1;
                            str.append(sarr[j]);
                            break;
                        }
                    }
                    }
                if(str.toString().equals(word)){
                    sum++;
                }
                str.delete(0,str.length());  //清空
            }
            return  sum;
        }

}
