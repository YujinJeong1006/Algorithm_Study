import java.util.*;

class Solution {
    public String solution(int n) {
        List<String> result = new ArrayList<>();
        for(int i = 0; i < n; i ++){
            if(i % 2 == 0){
                result.add("수");
            } else{
                result.add("박");
            } 
            
        }
        String answer = String.join("",result);
        return answer;
    }
}