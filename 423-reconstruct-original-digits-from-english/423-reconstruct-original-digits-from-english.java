class Solution {
    public String originalDigits(String s) {
        int[] map = new int[26];
        int[] digit = new int[10];
        for(char ch:s.toCharArray())
            map[ch-'a']++;
        
        digit[0]=map['z'-'a'];   //only zero have z
        digit[6]=map['x'-'a'];   //only six have x
        digit[4]=map['u'-'a'];   //only four have u
        digit[2]=map['w'-'a'];   //only two have w
        digit[8]=map['g'-'a'];   //only eight have t
        digit[5]=map['f'-'a'] - digit[4];  //five have f except 4.
        digit[7]=map['s'-'a'] - digit[6];  //seven have s except 6
        digit[3]=map['t'-'a'] - digit[8] - digit[2];   //three have t except 2,8
        digit[1]=map['o'-'a']-digit[2]-digit[4]-digit[0];  //one have o except 0,2,4
        digit[9]=map['i'-'a']-digit[5]-digit[6]-digit[8];  //nine have i except 5,6,8
        
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<10;i++){
            int freq=digit[i];
            while(freq-->0){  
                sb.append(i);
            }
        }
        return sb.toString();
    }
}