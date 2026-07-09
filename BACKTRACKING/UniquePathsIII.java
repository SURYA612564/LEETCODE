class Solution {
        static int n;
        static int m;
        static int sol[][];
        static int startX,startY;
        static int destX,destY;
        static int count;
        static int valid;
    public int uniquePathsIII(int[][] grid) {
        count=0;
        valid=0;
        n=grid.length;
        m=grid[0].length;
        sol=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    startX=i;
                    startY=j;
                    count++;
                }
                if(grid[i][j]==2)
                {
                    destX=i;
                    destY=j;
                }
                if(grid[i][j]==0)
                {
                    count++;   
                }
                
            }
        }
        findSolution(startX,startY,sol,grid,0);
        return valid;
    }
    static void findSolution(int i,int j,int sol[][],int grid[][],int c)
    {
        if(i<0 || i>=n || j<0 || j>=m || grid[i][j]==-1 || sol[i][j]==1)return;
        if(i==destX && j==destY && c==count)
        {
            valid++;
            return;
        }
        sol[i][j]=1;
        findSolution(i+1,j,sol,grid,c+1);
        findSolution(i-1,j,sol,grid,c+1);
        findSolution(i,j+1,sol,grid,c+1);
        findSolution(i,j-1,sol,grid,c+1);
        sol[i][j]=0;
        return;
    }
}