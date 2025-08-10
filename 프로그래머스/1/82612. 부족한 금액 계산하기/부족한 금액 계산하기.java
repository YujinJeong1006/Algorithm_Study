class Solution {
    public long solution(int price, int money, int count) {
        long answer, sum = 0;
        
        for(int i = 1; i <= count; i++) {
            sum += i * price;
        }
        
        if(money - sum >= 0){
            answer = 0;
        } else {
            answer = Math.abs(money - sum);
        }

        return answer;
    }
}