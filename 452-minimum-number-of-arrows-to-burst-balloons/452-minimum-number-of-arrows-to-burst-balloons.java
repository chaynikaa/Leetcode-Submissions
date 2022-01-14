class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;   //edge case
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        
        int arrow=1,end = points[0][1];
        
        for(int i=1;i<points.length;i++){
            if(points[i][0]>end){
                arrow++;
                end = points[i][1];
            }
        }

        return arrow;
    }
}

// class Solution {
//     public int findMinArrowShots(int[][] points) {
//         if (points.length == 0) return 0;   //edge case

//         // sort by x_end
//         Arrays.sort(points, (o1, o2) -> {
//             // We can't simply use the o1[1] - o2[1] trick, as this will cause an 
//             // integer overflow for very large or small values.
//             if (o1[1] == o2[1]) return 0;
//             if (o1[1] < o2[1]) return -1;
//             return 1;
//         });

//         int arrows = 1;
//         int xStart, xEnd, firstEnd = points[0][1];
//         for (int[] p: points) {
//             xStart = p[0];
//             xEnd = p[1];
//             // if the current balloon starts after the end of another one,
//             // one needs one more arrow
//             if (firstEnd < xStart) {
//                 arrows++;
//                 firstEnd = xEnd;
//             }
//         }

//         return arrows;
//     }
// }