class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int count = Integer.toBinaryString(n).replace("0","").length();
    
        for(int i = 1;i < n;i++){
            String nextBinary = Integer.toBinaryString(n + i);
            int nextNum = Integer.parseInt(nextBinary, 2);
            
            if(count == nextBinary.replace("0","").length()){
                answer = nextNum;
                break;
            }
        }
            
        return answer;
    }
}