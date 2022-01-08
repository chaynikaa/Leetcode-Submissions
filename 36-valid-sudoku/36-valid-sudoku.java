class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    int num = board[i][j];
                    String row = "row"+i+"num"+num;
                    String col = "col"+j+"num"+num;
                    String box = "box"+i/3+j/3+"num"+num;
                    
                    if(set.add(row)==false || set.add(col)==false || set.add(box)==false)
                        return false;
                }
            }
        }
        return true;
    }
}
