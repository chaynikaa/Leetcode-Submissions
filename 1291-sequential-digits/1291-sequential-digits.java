class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        String digits = "123456789";
        int nl = String.valueOf(low).length();
        int nh = String.valueOf(high).length();
        
        for(int i=nl;i<=nh;i++){
            for(int j=0;j<10-i;j++){
                int num = Integer.parseInt(digits.substring(j,j+i));
                if(num>=low && num<=high)
                    ans.add(num);
            }
        }
       return ans; 
    }
}