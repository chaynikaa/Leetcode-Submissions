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
        
        int f = freq.getOrDefault(val,0);
        f++;
        freq.put(val,f);
        
        if(group.containsKey(f)==false)
            group.put(f,new Stack<Integer>());
        
        group.get(f).push(val);
        max = Math.max(max,f);
    }
    
    public int pop() {
        int ans = group.get(max).pop();
        
        freq.put(ans,freq.get(ans)-1);
        
        if(group.get(max).size()==0)
            max--;
        
        return ans;
        
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */