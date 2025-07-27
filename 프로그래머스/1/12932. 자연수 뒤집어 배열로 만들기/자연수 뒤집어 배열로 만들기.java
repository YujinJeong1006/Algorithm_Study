import java.util.*;

class Solution {
    public int[] solution(long n) {
 
        char[] arr = String.valueOf(n).toCharArray();
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++){
            answer[arr.length-1-i] = arr[i] - '0';
        }
      
        return answer;
    }
}