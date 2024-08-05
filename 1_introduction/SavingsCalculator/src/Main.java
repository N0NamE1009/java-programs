import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 50: necesidades
        // 30: Cosas que queremos
        // 20: ahorros

        Scanner console = new Scanner(System.in);
        System.out.println("Ingrese su salrio: ");
        float salario=console.nextFloat();
        float necesidades=salario*0.5f;
        float otrasCosas=salario*0.3f;
        float ahorros=salario*0.2f;

        System.out.println("Deberias asignar tu salario en las siguientes cosas: ");
        System.out.println("Necesidades: $"+necesidades);
        System.out.println("Otras cosas: $"+otrasCosas);
        System.out.println("Ahorros: $"+ahorros);

    }
}