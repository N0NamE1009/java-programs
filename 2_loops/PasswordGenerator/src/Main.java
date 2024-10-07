import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chars = "abcdefghijklmnopqrstuvwxyz" +
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                "1234567890" +
                "!\"#$%&/()=?¡*+{}[]^-_";
        String pass = "";
        System.out.println("Enter the password length:");
        int numberOfCharacters = scanner.nextInt();
        int count = 0;


        while(count<numberOfCharacters){
            count++;
            double randonNumber= Math.random();
            randonNumber=Math.floor(randonNumber*chars.length());
            int number=(int) randonNumber;

            pass+=chars.charAt(number);

            //pass+=number;
        }
        System.out.println(pass);

    }
}