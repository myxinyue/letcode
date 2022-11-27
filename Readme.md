![md](images/Readme/md.jpg)

解题思路
根据题目描述我们可以知道，nums的源数组其实就是一个“递增”数组，那么如果nums数组可以由源数组轮转若干位置（包括 0 个位置）得到，则返回true，否则返回false。那么针对于返回true的情况，我们其实可以总结如下两种情况：

【情况1】如果nums数组中的元素就是“递增”的，则说明由源数组轮转0个位置可以得到nums数组。 【情况2】如果在nums数组中，仅仅有1次“非递增” 的情况发生，那么需要满足nums[0] >= nums[nums.length - 1]，才会返回true。

针对于以上描述的两种情况的具体解释，请见下图所示：



其中，由于我们只需遍历一遍数组，所以时间复杂度为：O(n)，其中 n 表示nums数组的长度。

代码实现
class Solution {
public boolean check(int[] nums) {
int t = 0, n = nums.length;
for (int i = 1; i < n; i++) {
if (t > 1) return false; // 如果出现超过1次的“非递增”情况，则直接返回false
if (nums[i - 1] > nums[i]) t++; // 如果出现“非递增”情况，则t加1
}
return t == 0 || (t == 1 && nums[0] >= nums[n - 1]);
}
}