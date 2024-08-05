import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        System.out.println("Indique la cantidad de minutos a grabar: ");

        double precioPorMinuto=0.05f;
        double cantMinutos=console.nextDouble();
        double precioFinal=cantMinutos*precioPorMinuto;

        System.out.println("Precio Final: $"+precioFinal);
    }
}
