class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        
        int paper = 0;
        int metal = 0;
        int glass = 0;
        int sum = 0;
        
        for(int i=1;i<travel.length;i++)   //prefix sum calculation
            travel[i] = travel[i]+travel[i-1];
        
        for(int i=0;i<garbage.length;i++){
            String st = garbage[i];
            
            for(int j=0;j<st.length();j++){
                char ch = st.charAt(j);
                
                if(ch=='P')
                    paper = i;   //storing the highest index we need to visit for paper garbage
                
                else if(ch=='G')
                    glass = i;
                
                else
                    metal = i;
                
                sum++;    //1 minute for every pickup
            }
        }
        
        if(paper!=0){
            sum = sum + travel[paper-1];   //traveling time
        }
        
        if(glass!=0){
            sum = sum + travel[glass-1];
        }
        
        if(metal!=0){
            sum = sum + travel[metal-1];
        }
        
        return sum;
        
    }
}