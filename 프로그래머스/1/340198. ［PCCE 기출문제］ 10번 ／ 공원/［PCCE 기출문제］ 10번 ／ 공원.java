import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = 0;
        // mats 정렬
        Arrays.sort(mats);

        for (int i = mats.length - 1 ; i >= 0; i--) {
            // 함수 호출
            if (canPlaceMat(mats[i], park)) {
                answer = mats[i];
                break;
            } else {
                answer = -1;
            }
        }

        return answer;
    }

    public boolean canPlaceMat(int mat, String[][] park) {
        int rows = park.length;
        int cols = park[0].length;

        for (int i = 0; i <= rows - mat; i++) {
            for (int j = 0; j <= cols - mat; j++) { 
                boolean canPlace = true;

                for (int r = 0; r < mat; r++) { 
                    for (int c = 0; c < mat; c++) { 
                        if (!park[i + r][j + c].equals("-1")) {
                            canPlace = false;
                            break;
                        }
                    }
                    if (!canPlace) break;
                }

                if (canPlace) return true;
            }
        }

        return false;
    }
}
