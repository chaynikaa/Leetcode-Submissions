class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb=new StringBuilder();
        for(String s: title.split(" ")){
            if(s.length()<=2){
                sb.append(s.toLowerCase()+" ");
            }else{
                String f=s.charAt(0)+"";
                f=f.toUpperCase();
                sb.append(f);
                sb.append(s.substring(1).toLowerCase()+" ");
            }
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}