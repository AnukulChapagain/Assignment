import java.util.Scanner;

public class Follow_format {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word");
        String name = sc.nextLine();


        for (int i = 0; i < name.length(); i++) {
            char y = name.charAt(i);

            System.out.println(i+name+'.'+y);



        }
    }
}
