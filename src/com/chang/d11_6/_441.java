package com.chang.d11_6;

public class _441 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(214748647));
    }

    public static int arrangeCoins(int n) {
        int level = 1;
        while (n > 0) {
            n -= level;
            level++;
        }
        return n == 0 ? level - 1 : level - 2;
    }
}
