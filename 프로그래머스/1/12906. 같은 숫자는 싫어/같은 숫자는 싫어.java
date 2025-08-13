import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int before = -1;
        
        for(int num : arr){
            if(before != num){
                list.add(num);
            }  
            before = num;
        }
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
    
        return answer;
    }
}