class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int row = triangle.size();
        int col = triangle.get(row - 1).size();
        int[][] grid = new int[row][col];
        
        grid[0][0] = triangle.get(0).get(0);
        
        for(int i = 1; i < row; i++){
            grid[i][0] = grid[i - 1][0] + triangle.get(i).get(0);
            grid[i][i] = grid[i - 1][i - 1] + triangle.get(i).get(i);
        }
        
        for(int i = 2; i < row; i++){
            for(int j = 1; j < i; j++){
                grid[i][j] = Math.min(grid[i - 1][j - 1], grid[i - 1][j]) + triangle.get(i).get(j);                
            }
        }
        int result = Integer.MAX_VALUE;
        for(int num : grid[row - 1]){
            result = Math.min(result, num);
        }
        return result;
    }
}