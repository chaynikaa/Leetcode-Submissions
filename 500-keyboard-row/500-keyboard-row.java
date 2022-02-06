class Solution {
    public String[] findWords(String[] str) {
        List<String> l = new ArrayList<>();
        for(int i = 0; i < str.length; i++){
            String s = str[i]; // 
            boolean b = true;
            for(int j = 0; j < s.length(); j++){
                char c = s.charAt(j);
                if(c == 'q' || c == 'w' || c == 'e' || c == 'r' || c == 't' || c == 'y' || c == 'u' || c == 'i' || c == 'o' || c == 'p' || c == 'Q' || c == 'W' || c == 'E' || c == 'R' || c == 'T' || c == 'Y' || c == 'U' || c == 'I' || c == 'O' || c == 'P'){
                    b = true;
                }
                else{
                    b = false;
                    break;
                }
            }
            if(b){
                l.add(str[i]);
            }
            b = true;
            for(int j = 0; j < s.length(); j++){
                char c = s.charAt(j);
                if(c == 'a' || c == 's' || c == 'd' || c == 'f' || c == 'g' || c == 'h' || c == 'j' || c == 'k' || c == 'l' || c == 'A' || c == 'S' || c == 'D' || c == 'F' || c == 'G' || c == 'H' || c == 'J' || c == 'K' || c == 'L'){
                    b = true;
                }
                else{
                    b = false;
                    break;
                }
            }
            if(b){
                l.add(str[i]);
            }
            b = true;
            for(int j = 0; j < s.length(); j++){
                char c = s.charAt(j);
                if(c == 'z' || c == 'x' || c == 'c' || c == 'v' || c == 'b' || c == 'n' || c == 'm' || c == 'Z' || c == 'X' || c == 'C' || c == 'V' || c == 'B' || c == 'N' || c == 'M'){
                    b = true;
                }
                else{
                    b = false;
                    break;
                }
            }
            if(b){
                l.add(str[i]);
            }
        }
        String[] string = new String[l.size()];
        for(int a = 0; a < l.size(); a++){
            string[a] = l.get(a);
        }
        return string;
    }
}