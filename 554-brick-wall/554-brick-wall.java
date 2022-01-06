class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum;
        int max=0;             //for storing min no. of cuts made at index
        
        for(int i=0;i<wall.size();i++){   
            sum=0;
            for(int j=0;j<wall.get(i).size()-1;j++){//keep in mind to run the code from size-1.cant make cut atlast     
                sum = sum + wall.get(i).get(j);      //storing the sum for first row 
                
                if(map.containsKey(sum)==false)      
                    map.put(sum,1);
                else{
                     int count = map.get(sum);
                     count++;
                    map.put(sum,count);  
                }
            max = Math.max(max,map.get(sum));

            }
        }
      return wall.size()-max;  
    }
}