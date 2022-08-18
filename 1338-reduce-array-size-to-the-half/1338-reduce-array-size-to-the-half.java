class Solution {
    public int minSetSize(int[] arr) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<arr.length ; i++){
            int num = arr[i];
            map.put(num , map.getOrDefault(num, 0)+1);   //storing freq
        }
        
        List<Integer> freq = new ArrayList<>(map.values());   //putting freq in arraylist
        
        Collections.sort(freq,Collections.reverseOrder());    //descending order sorting for arraylist
        
        int count = 0;   //distinct numbers to be removed
        int n = arr.length;   
        int remove = n; //total elements removed
        
        int i=0;
        
        while(remove > n/2){
            remove = remove - freq.get(i);
            i++;
            
            count++;
        }
        
      return count;  
        
    }
}