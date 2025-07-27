import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
     
        boolean done = false;
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor != 0){
                done = false;
            }else {
                list.add(arr[i]);
            }
        }
    
    
        int[] answer = list.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        
        Arrays.sort(answer);
        
       if (list.isEmpty()) {
            return new int[]{-1};
        }
        
        return answer;
    }
}