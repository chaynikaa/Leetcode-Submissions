class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        int[] temp = new int[score.length];
        for(int i=0;i<score.length;i++){
            temp[i]=score[i];
        }
        
        Arrays.sort(temp);
        
        String[]ans = new String[score.length];
        
        for(int i=0;i<score.length;i++){
            int num = score[i];
            
            for(int j=0;j<temp.length;j++){
                if(num==temp[j]){
                    if(j==temp.length-1)
                        ans[i]="Gold Medal";
                    else if(j==temp.length-2)
                        ans[i]="Silver Medal";
                    else if(j==temp.length-3)
                        ans[i]="Bronze Medal";
                    else
                        ans[i]= Integer.toString(temp.length-j);
                }
            }
        }
        
        return ans;
        
    }
}