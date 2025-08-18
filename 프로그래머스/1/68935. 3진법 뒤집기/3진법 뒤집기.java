
class Solution {
    public int solution(int n) {
        String ternary = Integer.toString(n, 3);
        StringBuilder reverseNum = new StringBuilder(ternary);
        reverseNum = reverseNum.reverse();
        
        int answer = Integer.parseInt(reverseNum.toString(), 3); 

        return answer;
    }
}