import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("ingrese su edad: ");
        int edad = consola.nextInt();
        System.out.println("ingrese su nivel de actividad: ");
        System.out.println("1) Sedentario");
        System.out.println("2) Moderado");
        System.out.println("3) Activo");
        int nivel_actividad = consola.nextInt();
        System.out.println("Ingrese su genero: ");
        System.out.println("1) Hombre");
        System.out.println("2) Mujer");
        int genero = consola.nextInt();

    }
}
