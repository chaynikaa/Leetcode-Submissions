class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> ans  = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        
        for(int i=0;i<words.length;i++){
            String word = words[i];
            
            if(map.containsKey(word) == true){
                int m = map.get(word);
                m++;
                map.put(word,m);
            } else {
                map.put(word,1);
            }
        }
        

        
        HashSet<Integer> set = new HashSet<>();
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            set.add(entry.getValue());
        }
        
        List<Integer> freq  = new ArrayList<>();         
          for (Integer i : set) 
            freq.add(i); 
        
        
      Comparator<Integer> cmp = Collections.reverseOrder();
      Collections.sort(freq, cmp);  
      int m = map.size();

     while(m>0){
         int search = freq.remove(0);
         List<String> temp = new ArrayList<>();
            for (Map.Entry<String,Integer> entry : map.entrySet()) {
                if(entry.getValue()==search){
                    temp.add(entry.getKey());
                    m--;
                }
            }
        Collections.sort(temp);
        ans.addAll(temp);  
         
         
     }   
        List<String> final_ans  = new ArrayList<>();
        
        
        for(int i=0;i<k;i++){
            final_ans.add(ans.remove(0));
        }
        return final_ans;
    } 
}
