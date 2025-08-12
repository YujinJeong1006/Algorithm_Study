import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        char[] stars = new char[a];
        for(int i = 0; i < a; i++){
            stars[i] = '*';
        }
        
        String starLine = String.valueOf(stars);
        
        for(int i = 0; i < b; i++){
            System.out.println(starLine);
        }
    }
}