package com.chang.d11_24;

public class _795 {
    public static void main(String[] args) {

    }

    public static int numSubarrayBoundedMax(int[] nums, int left, int right) {

        int n = nums.length, ans = 0 ,a=left,b=right;
        for (int i = 0, j = -1, k = -1; i < n; i++) {
            if (nums[i] > b) {
                k = i;
            } else {
                if (nums[i] < a) {
                    if (j > k) ans += j - k;
                } else {
                    ans += i - k;
                    j = i;
                }
            }
        }
        return ans;
    }
}
