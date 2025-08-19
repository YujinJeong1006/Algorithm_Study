class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                first = true;
                sb.append(' ');
            } else {
                if(first){
                    char c = Character.toUpperCase(s.charAt(i));
                    sb.append(c);
                    first = false;
                } else {
                    char c = Character.toLowerCase(s.charAt(i));
                    sb.append(c);
                }
            }
            
            
        }
        return sb.toString();
    }
}