package 基本算法.汉诺塔;

public class Since {
    public static int i =1;
    public static void main(String[] args) {
       HanGame(3 ,'A','B','C');

    }

    /**
     *
     * @param num  圆盘总数
     * @param sou   起始柱
     * @param tar   目标柱
     * @param sux  辅助柱
     */
    public static void  HanGame(int num, char sou, char tar, char sux){    //其实就是 2^n -1
        // 如果圆盘数量仅有 1 个，则直接从起始柱移动到目标柱
        if (num == 1) {
            System.out.println("第" + i + "次:从" + sou + "移动到" + tar);
            i++;
        } else {
            // 递归调用 hanoi() 函数，将 num-1 个圆盘从起始柱移动到辅助柱上
            HanGame(num - 1, sou, sux, tar);
            // 将起始柱上剩余的最后一个大圆盘移动到目标柱上
            System.out.println("第" + i + "次:从" + sou + "移动到" + tar);
            i++;
            // 递归调用 hanoi() 函数，将辅助柱上的 num-1 圆盘移动到目标柱上
            HanGame(num - 1, sux, tar, sou);
        }

    }
}
