import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int yCount = 0;
        int pCount = 0;
        
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case 'y':
                    yCount++;
                    break;
                case 'p':
                    pCount++;
                    break;
            }

        }
        
        if(yCount != pCount){
            answer = false;
        }
  
        return answer;
    }
}