class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        //坑比的边界条件
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }
        //初始化第一行和第一列，如果第一行，第一列某个值为1，则此值后面的路径也不通，为1
        //记录首行首例的第一个路障
        int k = 0 ;
        boolean flag = false;
        for (int i = 0; i < m; i++) {
            if (obstacleGrid[i][0] == 1) {
                dp[i][0] = 0;
                k = i;
                flag = true;
                break;
            } else {
                dp[i][0] = 1;
            }
        }
        if (flag) {
            for (int i = k; i < m; i++) {
                dp[i][0] = 0;
            }
        }
        flag = false;

        for (int i = 0; i < n; i++) {
            if (obstacleGrid[0][i] == 1) {
                dp[0][i] = 0;
                k = i;
                flag = true;
                break;
            } else {
                dp[0][i] = 1;
            }
        }
        if (flag) {
            for (int i = k; i < n; i++) {
                dp[0][i] = 0;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                }
            }
        }
        return dp[m - 1][n - 1];

    }
}