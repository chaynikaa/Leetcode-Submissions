class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=1;
        
        for(int pile:piles)
            right = Math.max(right,pile);
        
        while(left<right){
            int mid = left + (right-left)/2;
            int hours = 0;
            
            for(int pile:piles)
                hours+=Math.ceil((double)pile/mid);
            
            if(hours<=h)
                right = mid;
            else
                left = mid+1;
        }
        
        return right;
    }
}

// class Solution {
//     public int minEatingSpeed(int[] piles, int h) {
//         int k = 1;
        
//         while(true){
//             int hours = 0;
            
//             for(int pile:piles){
//                 hours += Math.ceil((double)pile/k);
//                 if(hours>h)
//                     break;
//             }
            
//             if(hours<=h)
//                 return k;
//             else
//                 k++;
//         }
//     }
// }