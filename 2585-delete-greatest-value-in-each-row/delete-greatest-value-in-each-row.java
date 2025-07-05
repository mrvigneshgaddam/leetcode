class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int i = grid.length,j = grid[0].length,ans=0;

        for(int[] row:grid)
            Arrays.sort(row);


        for(int ind =0;ind<j;ind++)
        {
            int max = 0;
            for(int wkind =0;wkind<i;wkind++)
                max = Math.max(max,grid[wkind][ind]);

            ans+=max;
        }
        return ans;
    }
}