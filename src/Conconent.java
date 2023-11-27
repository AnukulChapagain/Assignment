import java.util.Scanner;

public class Conconent {
    public static void main(String[] args) {
        System.out.println("Enter the Word");

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        int vowel = 0;
        int consonant = 0;

        String Vowels = "aeiou";

        for (int i = 0; i < word.length(); i++){
            char x = word.charAt(i);

            if (Character.isLetter(x)){
                if (Vowels.contains(String.valueOf(x))){
                    vowel++;
                }else {
                    consonant++;
                }
            }
        }

        System.out.println("The consonant are "+consonant+" in the word");
    }
}
