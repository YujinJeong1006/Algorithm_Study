import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int length = p.length();
        long num = Long.valueOf(p);
        int valueLen = t.length() - length + 1;
        int count = 0;
        
        for(int i = 0; i < valueLen; i++){
            long n = Long.valueOf(t.substring(i, i + length));
            if(n <= num) count++;
        }
        
        return count;
    }
}