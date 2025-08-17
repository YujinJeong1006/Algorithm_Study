
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        
        for(int i = 0; i < n; i++){
            String str = reader.readLine();
            char answer = solution(str);

            System.out.println(answer);
        }
    }

    public static char solution(String t) {
        char[] arr = t.replace(" ", "").toCharArray();
        Arrays.sort(arr);

        char maxChar = arr[0];
        int maxCount = 0;
        int count = 0;
        char tmp = arr[0];
        for (char c : arr) {
            if (c == tmp) {
                count++;
            } else {
                count = 1;
            }

            tmp = c;

            if (count > maxCount) {
                maxCount = count;
                maxChar = c;
            } else if(count == maxCount) {
                maxChar = '?';
            }
        }
        return maxChar;

    }

}