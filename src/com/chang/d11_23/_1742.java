package com.chang.d11_23;

public class _1742 {

    public static void main(String[] args) {
//        System.out.println(Getnums(
//                0));
        System.out.println(countBalls(19, 28));
//        int [] arr =new int[23];
//        System.out.println(arr[0]);
    }

    public static  int countBalls(int lowLimit, int highLimit) {
        int length = highLimit - lowLimit + 1;
        int[] arr = new int[46];  //5*9 +1    5个9为最大值；
        int sum = 0;
        for (int i = lowLimit; i<= highLimit; i++) {
                arr[Getnums(i)]++;

            sum = Math.max(arr[Getnums(i)], sum);

        }
        return sum;
    }



    public static  int  Getnums(  int a  ) {
        int sum = 0;

        while (a > 0) {
            sum+=a%10;
            a=a/10;
        }

   return    sum;
    }
}
