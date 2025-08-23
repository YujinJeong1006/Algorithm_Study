class Solution {
    public String solution(String s) {
        String answer = "";
        int wordIdx = 0;
        boolean isStart = true;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == ' '){
                isStart = true;
                answer += " ";
                continue;
            }
            
            if(isStart){
                wordIdx = 0;
                answer += Character.toUpperCase(c);
                isStart = false;
              
            } else if ( (wordIdx != 0) && (wordIdx % 2 == 0)) {
                 answer += Character.toUpperCase(c);
            } else {
                 answer += Character.toLowerCase(c);
            }
            
              wordIdx++;
        }
        
        return answer;
    }
}