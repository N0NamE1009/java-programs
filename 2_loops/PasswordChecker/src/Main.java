import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int attempt=3;

        while(attempt>0){
            String pass = "Chocolate";
            System.out.println("Enter the password: ");
            Scanner sc = new Scanner(System.in);
            String userPass = sc.nextLine();

            if (pass.equals(userPass)) {
                System.out.println("Correct password");
                break;
            }
            else{
                System.out.println("Incorrect password");
                attempt--;
                if (attempt==0){
                    System.out.println("Account blocked for 60 minutes");
                }else{
                    System.out.println("Try again");
                    System.out.println(attempt+" attempts left");
                }
            }


        }


    }
}