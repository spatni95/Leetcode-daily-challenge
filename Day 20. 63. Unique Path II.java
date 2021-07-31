class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int[][] path = new int[row][col];
        
        if(obstacleGrid[0][0] == 1) return 0;
        path[0][0] = 1;
        
        for(int i = 1; i < row; i++){
            if(obstacleGrid[i][0] == 1){
                break;
            }
            path[i][0] = 1;
        }
        for(int j = 1; j < col; j++){
            if(obstacleGrid[0][j] == 1){
                break;
            }
            path[0][j] = 1;
        }
        for(int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){
                if(obstacleGrid[i][j] == 1){
                    path[i][j] = 0;
                }else{
                    path[i][j] = path[i - 1][j] + path[i][j - 1];
                }
            }
        }
        return path[row - 1][col - 1];
    }
}