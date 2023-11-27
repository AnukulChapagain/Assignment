import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Word");
        String word = sc.nextLine();

        int vowel = 0;
        int consonant = 0;

        String Vowels = "aeiou";

        for (int i = 0; i < word.length(); i++){
            char Cons = word.charAt(i);

            if (Character.isLetter(Cons)){
                if (Vowels.contains(String.valueOf(Cons))){
                    vowel++;
                }else {
                    consonant++;
                }
            }
        }


        System.out.println("The vowels are "+ vowel);
        System.out.println("The consonant are "+consonant);
    }
}