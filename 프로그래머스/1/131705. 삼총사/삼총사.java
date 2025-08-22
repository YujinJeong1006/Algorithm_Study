import java.util.*;
import java.util.stream.Collectors;


class Solution {
    public int solution(int[] number) {
        int triple = 0; 
        int len = number.length;
       for(int i = 0; i < len - 2; i++){
           for(int j = i + 1; j < len - 1; j ++){
               for(int k = j + 1; k < len ; k++){
                   if(number[i] + number[j] + number[k] == 0 ){
                       triple ++;
                   }
               }
           }
       }
        return triple;
    }
}
