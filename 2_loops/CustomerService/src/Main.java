import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int opcion=1;
        while (opcion!=0){
            System.out.println("Elija la opcion que quiera: ");
            System.out.println("1) Contactar con soporte tecnico");
            System.out.println("2) Contactar con compras");
            System.out.println("3) Contactar con marketing");
            System.out.println("4) Contactar con prensa");
            System.out.println("5) Contactar con legal");
            System.out.println("0) Salir.");

            opcion = consola.nextInt();

            if (opcion == 1) {
                System.out.println("Llamando a soporte tecnico...");
            }
            else if (opcion == 2) {
                System.out.println("Llamando a Comprar...");
            }
            else if (opcion == 3) {
                System.out.println("Llamando a Marketing...");
            } else if (opcion==4) {
                System.out.println("Llamando a Prensa...");
            } else if (opcion==5) {
                System.out.println("Llamando a legal...");
            }
        }
    }
}