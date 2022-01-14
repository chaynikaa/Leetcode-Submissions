class Solution {                            //sorting  //count no. of 1s 2s 3s. and then place it 0(2N)
    public void sortColors(int[] nums) {   //dutch national flag algorithm
        int i=0;
        int j=0;
        int k=nums.length-1;
        
        while(j<=k){
             if(nums[j]==0){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
                i++;
            }
            else if (nums[j]==1)
                j++;
             else {
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k]=temp;
                k--;
            }  
        }

    }
}