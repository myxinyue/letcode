package com.chang.d11_20;

public class _799 {
    public static void main(String[] args) {
        System.out.println(champagneTower(25, 6, 1));
    }

    public  static double champagneTower(int poured, int query_row, int query_glass) {
        double[] row = {poured};
        for (int i = 1; i <= query_row; i++) {
            double[] nextRow = new double[i + 1];
            for (int j = 0; j < i; j++) {
                double volume = row[j];
                if (volume > 1) {
                    nextRow[j] += (volume - 1) / 2;
                    nextRow[j + 1] += (volume - 1) / 2;
                }
            }
            row = nextRow;
        }
        return Math.min(1, row[query_glass]);
    }
}



//    public static  double champagneTower(int poured, int query_row, int query_glass) {
//        int se =  ReRow(poured);
//        if(poured==0){
//            return 0.00000;
//        }
//        if(query_row<se){         //如果这些杯酒可以倒的层数大于他要的层数 ，就是满的 给1
//            return 1.00000;
//        }
//        else if(se==query_row){  //  如果这些杯酒可以倒的层数等于他要的层数 ，就是根据情况得到
//
//            if( sum(query_row)==poured){  //刚好这列满的
//                return 1.00000;
//
//            }else if(sum(query_row)>poured){   //就是说这列都是半满
//
//                int a =poured-sum(query_row-1);   //上层满 ，流入这层有多少
//                if(query_row==1){
//                    return (double)a/2*1.00000;
//                }
//
//                double next = a/((query_row+1-2)*2+2);
//                if(query_glass==0||query_glass==query_row){
//                    return next*1.00000;
//                    }else{
//                    return next*2.00000;
//
//                }
//                }
//
//                }
//
//        else {
//            return 0.00000;
//        }
//        return 0.00000;
//    }
//    public static int ReRow (int a){
//        int row =0,sum=a;
//        for (int i = 1; i < a; i++) {
//
//            sum-=i;
//            if(sum<=0){
//                break;
//            }
//            row+=1;
//        }
//
//      return row;
//    }
//    public static int  sum(int n){
//        int sum = 0;
//        for (int i = 0; i <= n+1; i++) {
//            sum +=i;
//        }
//      return sum;
//    }
//}
