class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))==false)
                map.put(s.charAt(i),1);
            else{
                int count = map.get(s.charAt(i));
                count++;
                map.put(s.charAt(i),count);
            }
        }
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.get(ch)==1){
                return i;
            }
        }
     return -1;   
    }
}