import java.util.Scanner;

public class Revers {
    public static void main(String[] args) {

        System.out.println("Enter the Word");

        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();

        int length = x.length();

        for(int i =length-1; i >=0;i--){
            char y = x.charAt(i);
            System.out.println(y);
        }
    }
}
