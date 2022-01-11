class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> st = new Stack<>();
        
        for(int num: asteroids){
            if(st.isEmpty() || num > 0){
                st.push(num);
            }else{
                while(!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(num)){  //popping out all asteroids
                    st.pop();                                                        //which this can cancel
                }
                
                if(st.isEmpty() || st.peek() < 0){                                  //pushing if stack empty
                    st.push(num);                             //or we have already-ve value
                }else{ 
                    if(st.peek() > 0 && st.peek() == Math.abs(num)){   //checking equal case 
                        st.pop();
                    }
                }
            }
        }
        
        int idx = st.size();
        int[] ans = new int[idx];
        
        while(!st.isEmpty()){
            ans[--idx] = st.pop();
        }
        
        return ans;
    }
}