import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int len =  in.nextInt();
        String number = in.next();

        int sum = 0;

        for(int i = 0; i < len; i++){
            sum += number.charAt(i) - '0';
        }

        System.out.print(sum);
    }
}
