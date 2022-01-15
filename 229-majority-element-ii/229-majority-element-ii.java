class Solution {
    public List<Integer> majorityElement(int[] nums) {
         int n = nums.length/3;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        int num1=-1,num2=-1,c1=0,c2=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==num1){
                c1++;
            }
            
            else if(nums[i]==num2){
                c2++;
            }
            
            else if(c1==0){
                num1 = nums[i];
                c1++;;
            }
            
            else if(c2==0){
                num2=nums[i];
                c2++;
            }
            
            else{
                c1--;
                c2--;
            }   
        }
        
        int count1=0,count2=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==num1)
                count1++;
            if(nums[i]==num2)
                count2++;  
        }
        
        if(num1==num2 && count1>n)
            ans.add(num1);
        
        else{
            if(count1>n)
            ans.add(num1);
            if(count2>n)
            ans.add(num2);
        }
        
        return ans;
    }
}