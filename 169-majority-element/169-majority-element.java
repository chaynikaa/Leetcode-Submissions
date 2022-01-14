 class Solution {
    public int majorityElement(int[] num) {

        int major=num[0], count = 0;
        for(int i=0; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }
            else count--;
            
        }
        return major;
    }
}