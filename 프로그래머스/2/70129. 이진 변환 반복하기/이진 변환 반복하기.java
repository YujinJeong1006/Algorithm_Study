class Solution {
    public int[] solution(String s) {
        int zeroCount = 0;
        int changeCount = 0;

        while (!s.equals("1")) {
            int before = s.length();
            s = s.replace("0", "");
            int after = s.length();

            zeroCount += (before - after);
            s = Integer.toBinaryString(after);
            changeCount++;
        }

        return new int[]{changeCount, zeroCount};
    }
}