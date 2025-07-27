class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        while(Integer.max(bill[0], bill[1]) > Integer.max(wallet[0], wallet[1]) ||
              Integer.min(bill[0], bill[1]) > Integer.min(wallet[0], wallet[1] )){
            if(bill[0] > bill[1]){
                Math.floor(bill[0] /= 2);
            }
            else{
                Math.floor(bill[1] /= 2);
            }
            answer++;
        }
        
        return answer;
    }
}