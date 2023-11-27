import java.util.Scanner;

public class Pad_Checker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the name");
        String name = sc.nextLine();

        System.out.println("Enter your password");
        String password = sc.nextLine();
        if(password.length()>8 && password.contains("@")){
            System.out.println("done");

        }else if(password.length()<8){
            System.out.println("The Username must be greater than 8");
        }else{
            System.out.println("The username must contain @");
        }


        System.out.println("Enter the username");
        String Username = sc.nextLine();

        System.out.println("Enter Password");
        String Password = sc.nextLine();


        if(name.equals(Username)&& password.equals(Password)){
            System.out.println("Login successfully");
        }else {
            System.out.println("Invalid username or password");
        }
    }

}


