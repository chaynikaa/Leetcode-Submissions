class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
            int res = 0;
    int left = Integer.MIN_VALUE, right = Integer.MIN_VALUE;
    
    //Sort
    Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
    
    
    for (int [] arr : intervals) {
        
        if (arr[0] > left && arr[1] > right) {
            left = arr[0];
            
            ++res;
        }
        
        right = Math.max(right, arr[1]);
    }
    
    return res;
    
}
        
    }
