class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int arr[] = new int[27];
        
        for(char ch:magazine.toCharArray()){
            arr[ch-'a']+=1;
        }
        
        for(char c:ransomNote.toCharArray()){
            int a = c-'a';
            if(arr[a]==0)
                return false;
            arr[a]--;
        }
        return true;
    }
}