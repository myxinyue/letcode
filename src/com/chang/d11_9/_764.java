package com.chang.d11_9;

import java.util.Arrays;

public class _764 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{4,2}};

       int a = orderOfLargestPlusSign(5,arr);
        System.out.println(a);

    }
        public static int orderOfLargestPlusSign ( int n, int[][] mines){
              int [] []  arr = new int[n][n];

              //先全部填充1
            for (int i = 0; i < n; i++) {
                Arrays.fill(arr[i],1);
            }

            //把零填充进去
            for (int[] mine : mines) {
                arr[mine[0]][mine[1]]=0;
            }
             int [] [] top = new int[n][n],bot = new int[n][n],left = new int[n][n],right = new int[n][n];
        //为1则判断他的上下左右的k值
            //得到上左的值
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] == 1) {
                        left[i][j] = (j == 0 ? 0 : left[i][j - 1]) + 1;
                        top[i][j] = (i == 0 ? 0 : top[i - 1][j]) + 1;
                    }
                }
            }
                    //得到下、右的值
                    for (int i = n-1; i >=0; i--) {
                        for (int j = n - 1; j >= 0; j--) {
                            if (arr[i][j] == 1) {
                                right[i][j] = (j == n - 1 ? 0 : right[i][j + 1]) + 1;
                                bot[i][j] = (i == n - 1 ? 0 : bot[i + 1][j]) + 1;
                            }
                        }
                    }
                    int ans =0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int min = Math.min(Math.min(left[i][j],right[i][j]),Math.min(bot[i][j],top[i][j]));
                    ans = Math.max(ans,min);
                }

                }

            return ans;
            }


}