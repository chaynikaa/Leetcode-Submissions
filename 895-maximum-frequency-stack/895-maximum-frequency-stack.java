class FreqStack {
    HashMap<Integer,Integer> freq;
    HashMap<Integer , Stack<Integer>>group;
    int max;

    public FreqStack() {
        freq = new HashMap();
        group = new HashMap();
        max = 0;
        
    }
    
    public void push(int val) {
        
        int f = freq.getOrDefault(val,0);   //taking the value from frequency map
        f++;                                //updating it
        freq.put(val,f);                    //putting it back in the map
        
        if(group.containsKey(f)==false)     //if it doesnt exist-> make new empty stack 
            group.put(f,new Stack<Integer>());
        
        group.get(f).push(val);           //push the value in the stack
        max = Math.max(max,f);            //update the max
    }
    
    public int pop() {
        int ans = group.get(max).pop();   //pop out the max freq element from the stack
        
        freq.put(ans,freq.get(ans)-1);   //update its no. in the frequency stack
        
        if(group.get(max).size()==0)     //if the stack becomes empty after that
            max--;                      //decrease the max by 1
        
        return ans;
        
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */