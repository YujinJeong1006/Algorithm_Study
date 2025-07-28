class Solution {
    public String solution(String s) {
        String answer = "";
        int mid = s.length() / 2;
        if(s.length() % 2 == 0){
            answer = s.substring(mid - 1, mid + 1);
        }else{
            answer = String.valueOf(s.charAt(mid));
        }
        return answer;
    }
}
