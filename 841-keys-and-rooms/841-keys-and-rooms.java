class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        boolean[] visited = new boolean[rooms.size()];
        visited[0]=true;
        
        Stack<Integer> st = new Stack<>();
        st.push(0);
        
        while(st.size()!=0){
            int key = st.pop();
            
            for(int visit:rooms.get(key)){
                if(visited[visit]==false){
                    visited[visit]=true;
                    st.push(visit);
                }
            }
        }
        
        for(boolean v:visited)
            if(!v)
                return false;
        
        return true;
        
    }
}