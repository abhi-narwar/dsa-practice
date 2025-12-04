class game_of_life {
    public void gameOfLife(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        int[][] dirs = {
            {1,0}, {-1,0}, {0,1}, {0,-1},
            {1,1}, {1,-1}, {-1,1}, {-1,-1}
        };

        
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {

                int live = 0;

                for (int[] d : dirs) {
                    int nr = r + d[0];
                    int nc = c + d[1];

                    if (nr >= 0 && nr < rows && nc >= 0 && nc < cols) {
                        if (Math.abs(board[nr][nc]) == 1) {
                            live++;
                        }
                    }
                }

                // Apply rules
                if (board[r][c] == 1) {
                    if (live < 2 || live > 3) {
                        board[r][c] = -1; 
                    }
                } else {
                    if (live == 3) {
                        board[r][c] = 2; 
                    }
                }
            }
        }

    
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (board[r][c] == -1) board[r][c] = 0;
                else if (board[r][c] == 2) board[r][c] = 1;
            }
        }
    }
}
