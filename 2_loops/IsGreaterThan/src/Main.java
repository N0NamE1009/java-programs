import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        while (age < 18) {
            System.out.println("cannot enter the place");
            System.out.println("enter your age: ");
            age = sc.nextInt();

        }
        System.out.println("you can enter the place");
    }
}
