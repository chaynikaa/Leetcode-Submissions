class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0 ;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])==false){
                map.put(nums[i],1);
            }
            else{
                int count = map.get(nums[i]);
                count++;
                map.put(nums[i],count);
            }
        }
        
        for(int key : map.keySet()){
            if(map.get(key)==1)
                sum=sum+key;
        }
        return sum;
    }
}