class Solution {
    public List<List<Integer>> ans=new ArrayList<>();
    public void solve(int arr[],List<Integer> ans1,int i,int tar,int sum){
        if(arr.length == i){
            if(sum==tar){
                ans.add(new ArrayList<>(ans1));
            }
            return;
        }
        if(tar >= (sum+arr[i])){
            ans1.add(arr[i]);
            solve(arr,ans1,i,tar,sum+arr[i]);
            ans1.remove(ans1.size()-1);
            solve(arr,ans1,i+1,tar,sum);
        }else{
            solve(arr,ans1,i+1,tar,sum);  
        }
    }
    
    public List<List<Integer>> combinationSum(int[] arr, int t) {
       solve(arr,new ArrayList<>(),0,t,0);
        return ans;
        
    }
}