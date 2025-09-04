import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer = "";
        int[] pieces = {1,1,2,2,2,8};
        String str = "";
        try {
             str = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            String input[] = str.split(" ");

            for(int i=0; i < pieces.length; i++){
                answer += pieces[i] - Integer.parseInt(input[i]);
                answer += " ";
            }

        }

        System.out.println(answer);

    }


}


