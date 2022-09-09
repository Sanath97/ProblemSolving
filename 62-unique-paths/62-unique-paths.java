class Solution {
    int countPaths(int i, int j, int m, int n, int[][] dp, int[] sc) {
        if (i==m-1 && j==n-1) 
            return 1;
        if (i>=m || j>=n)
            return 0;
        if (dp[i][j]!=-1)
        {
            sc[0]++;
            return dp[i][j];
        }
            
        else
            dp[i][j] = countPaths(i+1,j,m,n,dp,sc) + countPaths(i,j+1,m,n,dp,sc);
            return dp[i][j];
    }
    
    public int uniquePaths(int m, int n) {
        // Computing number of avoided calculations because of memoization.
        int[] subproblemsCount = new int[1];
        int[][] dp = new int[m][n];
        for (int i=0;i<m;i++)
            Arrays.fill(dp[i],-1);
        int ans= countPaths(0,0,m,n,dp, subproblemsCount);
        // System.out.println(subproblemsCount[0]);
        return ans;
    }
}