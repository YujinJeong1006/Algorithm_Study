class Solution {
    public int[] solution(String s) {
        int zeroCount = 0;
        int changeCount = 0;
        
        int beforeRemove = 0;
        int afterRemove = 0;
        
        while(!s.equals("1")){
            beforeRemove = s.length();
            s = s.replace("0", "");
            afterRemove = s.length();
            
            zeroCount += beforeRemove - afterRemove;
            
            
            s = Integer.toBinaryString(afterRemove);
            
            changeCount++;
            
        }
        return new int[]{changeCount, zeroCount};
    }
}