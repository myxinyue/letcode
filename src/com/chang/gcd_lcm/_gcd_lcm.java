package com.chang.gcd_lcm;

public class _gcd_lcm {
    public static void main(String[] args) {

    }


    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
  static   int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
