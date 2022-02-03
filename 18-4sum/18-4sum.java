class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int temp1 = target-nums[i]-nums[j];
                
                int front = j+1;
                int back = nums.length-1;
                
                while(front<back){
                    int temp2 = nums[front]+nums[back];
                    
                    if(temp2>temp1)
                        back--;
                    else if(temp2<temp1)
                        front++;
                    else{
                        ans.add(Arrays.asList(nums[i],nums[j],nums[front],nums[back]));
                        
                        while(front<back && nums[front]==nums[front+1])
                            front++;
                        while(front<back && nums[back]==nums[back-1])
                            back--;
                        
                        front++;back--;
                    }
                }
                while(j+1<nums.length && nums[j]==nums[j+1])
                    j++;
            }
            
            while(i+1<nums.length && nums[i]==nums[i+1])
                i++;
        }
        return ans;
    }
}

////////****************BRUTE FORCE--> TLE

// class Solution {
//     public List<List<Integer>> fourSum(int[] nums, int target) {
//         Arrays.sort(nums);
//         Set<List<Integer>> ans = new HashSet<>();
        
//         for(int i=0;i<nums.length-3;i++){
//             for(int j=i+1;j<nums.length-2;j++){
//                 for(int k=j+1;k<nums.length-1;k++){
//                     int find = target-(nums[i]+nums[j]+nums[k]);
//                     for(int l=k+1;l<nums.length;l++){
//                         if(find==nums[l]){
//                          List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k],find);
//                          Collections.sort(temp);
//                          ans.add(temp);                           
//                         }

//                     }
//                 }
//             }
//         }
//       return new ArrayList(ans);  
//     }
// }