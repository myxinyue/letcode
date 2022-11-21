package 基本算法.部分背包;

public class Since {

    public static void main(String[] args) {
        int [] wight = new int[]{10,20,30};
        int [] price= new int[]{100,200,800};
        System.out.println(TANxin(wight, price, 50));
    }

     public static void sort (int [] wight , int [] price){
        double [] cp =new double[wight.length];
         for (int i = 0; i < wight.length; i++) {     //这里注意 尽量不使用 i+1当作索引
             for (int j = i+1; j <wight.length ; j++) {
                 double a= price[i]/(wight[i]*1.0);
                 double b= price[j]/(wight[j]*1.0);

                 if(a<b){
                     int  tem = wight[i];
                     wight[i]=wight[j];
                     wight[j] = tem;
                     tem = price[i];
                     price[i]=price[j];
                     price[j] = tem;
                 }
             }


         }

     }


     public static  double TANxin(int [] wi,int [] pri ,int max){
        double res= 0;
        sort(wi,pri);
        int i =0;
        while (max>0){
            if(wi[i]<=max){
                max= max-wi[i];
                res+= pri[i];
            } else if (wi[i]>max) {
                res+=pri[i]/wi[i]*max;

            }
   i++;
        }
        return res;
     }

}
