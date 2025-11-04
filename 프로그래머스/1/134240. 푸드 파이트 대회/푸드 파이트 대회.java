class Solution {
    public String solution(int[] food) {
        
        // String 2개로해서 +로 붙인다. 다 붙이면 0넣고 두개 문자열 합체
        String player1 = "";
        String player2 = "";
        
        for(int i = 1; i < food.length; i++){
            // 1일시 무시
            if(food[i] == 1){
                continue;
            } else {
                int foodPerPerson = food[i] / 2;    // 1인당 음식 개수
                
                for(int j = 0; j < foodPerPerson; j++) {
                    player1 = player1 + String.valueOf(i);
                    player2 = String.valueOf(i) + player2;
                }
            }
        }
        
        player1 = player1 + "0";

        return player1 + player2;
    }
}