import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        if(length == 1){
            int[] answer = {-1}; 
            return answer; 
        } else {
            List<Integer> li = new ArrayList<>();
            for (int num : arr) {
                li.add(num);
            }
            
            int minimum = arr[0];
            for(int num : li){
                if(num < minimum){
                    minimum = num;
                }
            }
            
            int idx = li.indexOf(minimum);
            
            li.remove(idx);
            int[] array = li.stream().mapToInt(Integer::intValue).toArray();
            return array;
        }
    }
}