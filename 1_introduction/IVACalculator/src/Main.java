import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        float iva=16                                ;
        System.out.println("Ingrese el precio del articulo: ");
        float precio = console.nextFloat();
        float totalAgregar =iva*precio/100;
        float precioFinal=precio + totalAgregar;
        System.out.println("Precio Total: "+precioFinal);

    }
}
