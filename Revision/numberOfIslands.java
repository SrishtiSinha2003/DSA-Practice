public class numberOfIslands {
    public static void dfs(int[][] grid, int i, int j, int row, int col) {
        if(i<0 || i>= row || j<0 || j>= col || grid[i][j] == 0) return;

        if(grid[i][j] == 1) {
            grid[i][j] = 0;
            dfs(grid, i+1   , j, row, col);
            dfs(grid, i-1, j, row, col);
            dfs(grid, i, j+1, row, col);
            dfs(grid, i, j-1, row, col);
        }
    }
    public static int countIslands(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        int row = grid.length, col = grid[0].length;
        int count = 0;
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(grid[i][j] == 1) {
                    dfs(grid, i, j, row, col);
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] grid = {
            {1, 1, 0, 0, 0},
            {0, 1, 0, 0, 1},
            {0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 1, 1}
        };
        System.out.print(countIslands(grid));
    }
}
