class Solution {
    public boolean isRobotBounded(String instructions) {
        
        int x=0,y=0;           //robot is at the 0,0 in the beginning      
        int idx = 0;           //facing towards north initially--- north-0 east-1 south-2 west-3
        
        //0,1->one step north  1,0->one step east  0,-1->one step south   -1,0->one step west
        
        int[][] direction = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};   
        for(int i=0;i<instructions.length();i++){
            char ch = instructions.charAt(i);
            
            if(ch=='R')                      //if its right add-1
                idx=(idx+1)%4;               //%4 is to convert west direction(3+1) to 0 i.e. north
            
            else if(ch=='L')                 //if left that is -1
                idx=(idx+3)%4;               //we consider it as (4-1) turns right
            
            else{
                x = x+direction[idx][0];     //update the direction in x co-ordinate
                y = y+direction[idx][1];     //update the direction in y co-ordinate and move it 1 step ahead
            }
        }
        
        if((x==0 && y==0) || idx!=0)       // if after 1 pass the start==end or the direction is not north
            return true;                   // the loop will repeat it self within 4 turns
        
        else
            return false;
    }
}


// class Solution {
//     public boolean isRobotBounded(String instructions) {
//         final int NORTH = 1;
//         final int EAST = 2;
//         final int SOUTH = 3;
//         final int WEST = 4;
        
//         int x = 0, y = 0, dir = NORTH;
        
//         for(int i=0; i<instructions.length(); i++){
//             char c = instructions.charAt(i);
            
//             switch(c){
//                 case 'G':
//                     switch(dir){
//                         case NORTH:
//                             y++;    break;
//                         case EAST:
//                             x++;    break;
//                         case SOUTH:
//                             y--;    break;
//                         case WEST:
//                             x--;    break;
//                     }
//                     break;
//                 case 'L':
//                     switch(dir){
//                         case NORTH:
//                             dir = WEST;     break;
//                         case EAST:
//                             dir = NORTH;    break;
//                         case SOUTH:
//                             dir = EAST;     break;
//                         case WEST:
//                             dir = SOUTH;    break;
//                     }
//                     break;
//                 case 'R':
//                     switch(dir){
//                         case NORTH:
//                             dir = EAST;     break;
//                         case EAST:
//                             dir = SOUTH;    break;
//                         case SOUTH:
//                             dir = WEST;     break;
//                         case WEST:
//                             dir = NORTH;    break;
//                     }
//                 break;
//             }
//         }
//         return ((x==0 && y==0) || dir != NORTH);
//     }
// }