import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> factorList = new ArrayList<>();
        
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                factorList.add(i);
            }
        }
        factorList.add(n); // 자신 추가
        
         for(int num : factorList){
             answer += num;
         }
        
        return answer;
    }
}