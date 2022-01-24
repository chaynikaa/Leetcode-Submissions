class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        boolean match1 = true;
        boolean match2 = true;
        boolean match3 = true;
        
        //all capital
        
        for(int i=0;i<n;i++){
            if(!Character.isUpperCase(word.charAt(i))){
                match1 = false;
                break;
            }
        }
        
        if(match1 == true)
            return true;
        
        //all small
        
        for(int i=0;i<n;i++){
            if(!Character.isLowerCase(word.charAt(i))){
                match2 = false;
                break;
            }
        }
        
        if(match2 == true)
            return true;
        
        //last case

        if(!Character.isUpperCase(word.charAt(0)))
            match3 = false;
        
        if(match3 == true){
            for(int i=1;i<n;i++){
                if(!Character.isLowerCase(word.charAt(i))){
                    match3 = false;
                    break;
                }
            }
        }
        
        return match3;
    }
}