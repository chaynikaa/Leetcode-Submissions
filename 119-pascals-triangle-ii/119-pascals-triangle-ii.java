class Solution {
    
public List<Integer> getRow(int rowIndex) {
        List<Integer> curRow = new ArrayList<Integer>();
        curRow.add(1);  //first addition of 1
        if (rowIndex == 0) 
            return curRow;
        
        List<Integer>prevRow = getRow(rowIndex - 1);  //getting the last prev row before the nth one
    
        for (int i = 0; i<prevRow.size()-1; i++){
            curRow.add(prevRow.get(i)+prevRow.get(i+1));  //addition tht values and adding it to the curr list
        }
    
        curRow.add(1);   //last addition of 1
        return curRow; 
    }
}
