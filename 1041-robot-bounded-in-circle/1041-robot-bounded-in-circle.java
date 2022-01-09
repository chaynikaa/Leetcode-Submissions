class Solution {
    public boolean isRobotBounded(String instructions) {
        
        int x=0,y=0;           
        int idx = 0;
        int[][] direction = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        for(int i=0;i<instructions.length();i++){
            char ch = instructions.charAt(i);
            
            if(ch=='R')
                idx=(idx+1)%4;
            
            else if(ch=='L')
                idx=(idx+3)%4;
            
            else{
                x = x+direction[idx][0];
                y = y+direction[idx][1];
            }
        }
        
        if((x==0 && y==0) || idx!=0)
            return true;
        
        else
            return false;
    }
}