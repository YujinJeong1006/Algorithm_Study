import java.util.*;

class Solution {
    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr, Collections.reverseOrder());

        long answer = 0;
        answer = Long.parseLong(String.join("", arr));
        return answer;
    }
}