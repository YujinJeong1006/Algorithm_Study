import java.util.Arrays;

class Solution {    
    public String solution(String s) {
        int[] numArr = Arrays.stream(s.split(" "))
                                    .mapToInt(Integer::parseInt)
                                     .toArray();
        int min = numArr[0];
        int max = numArr[0];
        for(int i = 0; i < numArr.length; i++){
            if(numArr[i] < min)
            {
                min = numArr[i];
            } 
            
            if(numArr[i] > max){
                max = numArr[i];
            }
        }
        
        String answer = min + " " + max;
        return answer;
    }
}