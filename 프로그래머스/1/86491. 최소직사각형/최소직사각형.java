class Solution {
    public int solution(int[][] sizes) {
        int w = 0;
        int h = 0;
        int maxW = 0;
        int maxH = 0;
        int length = sizes.length;

        for(int i = 0; i < length; i++){
            w = Math.max(sizes[i][0], sizes[i][1]);
            h = Math.min(sizes[i][0], sizes[i][1]);

            if(w > maxW){
                maxW = w;
            }
            if(h > maxH){
                maxH = h;
            }

        }
        return maxW * maxH ;
    }
}