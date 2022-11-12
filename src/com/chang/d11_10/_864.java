package com.chang.d11_10;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class _864 {

    class Solution {
        static int N = 35, K = 10, INF = 0x3f3f3f3f;
        static int[][][] dist = new int[N][N][1 << K];
        static int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};//上 、下、左、右
        public int shortestPathAllKeys(String[] grid) {
            int n = grid.length, m = grid[0].length(), cnt = 0;   //cnt钥匙数量
            Deque<int[]> d = new ArrayDeque<>();

            //给定义的三元组填充无穷大
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    Arrays.fill(dist[i][j], INF); //给定义的三元组填充无穷大
                    char c = grid[i].charAt(j);  //第i行（字符串）的第j个字符
                    if (c == '@') {    //如果这个地方是起点
                        d.addLast(new int[]{i, j, 0}); // x、y 为坐标 和钥匙收集 情况
                        dist[i][j][0] = 0;
                    } else if (c >= 'a' && c <= 'z') cnt++;   //遍历过程寻找钥匙
                }
            }
            while (!d.isEmpty()) {
                int[] info = d.pollFirst();   //取出队列的一个元素并将其删除 ，队列元素为一维数组
                int x = info[0], y = info[1], cur = info[2], step = dist[x][y][cur];//三元组x、y 位置 cur钥匙状态  step 到达该状态的步数
                for (int[] di : dirs) {   //分别上下左右移动
                    int nx = x + di[0], ny = y + di[1];
                    if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;  //移动到外面去了或者
                    char c = grid[nx].charAt(ny); //得到移动后位置的字符 ，下面就是判断
                    if (c == '#') continue;  //该位置是墙，重新移动，这次移动不对
                    if ((c >= 'A' && c <= 'Z') && (cur >> (c - 'A') & 1) == 0) continue; //这个位置是锁，没有这个钥匙，重新走   c - 'A' 是几号钥匙
                    int ncur = cur;
                    if (c >= 'a' && c <= 'z') ncur |= 1 << (c - 'a'); //碰到钥匙 添加钥匙 使用二进制存储 1 表示有这个钥匙
                    if (ncur == (1 << cnt) - 1) return step + 1;  //如果钥匙全部找到
                    if (step + 1 >= dist[nx][ny][ncur]) continue;  //dist[nx][ny][ncur] 为  step 就是这个位置的 为了最小路径
                    dist[nx][ny][ncur] = step + 1;     //步数加一
                    d.addLast(new int[]{nx, ny, ncur});  //入队 （到达该位置成功）
                }
            }
            return -1;
        }
    }
}
