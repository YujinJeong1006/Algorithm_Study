import java.util.*;

class Solution {
    
    public int solution(int n) {
        int a = 1;
        int b = 1;
        int answer = 0;

        for(int i = 3; i <= n; i++){
            answer = (a + b) % 1234567;
            a = b;
            b = answer;

        }
        return answer;
    }
    

}