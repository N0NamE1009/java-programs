import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Primero tiene que reconocer que tipo de quemadura es: ");
        System.out.println("Mostrar informacion de quemaduras");

        System.out.println("Que tipo de quemadura es?");
        System.out.println("Primer grado: ");
        System.out.println("Solo la capa externa de la piel. Causan dolor, enrojecimiento e hinchazón. \n");
        System.out.println("Segundo grado:");
        System.out.println("La capa externa y la capa subyacente de la piel. Causan dolor, enrojecimiento, hinchazón y ampollas.\n");
        System.out.println("Tercer grado:");
        System.out.println("Piel blanquecina, oscura o quemada. La piel puede estar adormecida. \n");

        System.out.println("Ingrese el tipo de quemadura: ");

        System.out.println("1) Primer grado");
        System.out.println("2) Segundo grado");
        System.out.println("3) Tercer grado");

        Scanner sc = new Scanner(System.in);
        System.out.println("Opcion: ");
        int opcion = sc.nextInt();

        if (opcion==1){
            System.out.println("Tratamiento: ");
            System.out.println("Tratamiento:");
            System.out.println("1. Enfriar la quemadura con agua fría del grifo durante al menos 10 minutos.");
            System.out.println("2. Cubrir la quemadura con un apósito estéril o una compresa limpia.");
            System.out.println("3. Tomar un analgésico de venta libre si es necesario para aliviar el dolor.");
        }
        else if (opcion==2){
            System.out.println("Tratamiento: ");
            System.out.println("Tratamiento:");
            System.out.println("1. Enfriar la quemadura con agua fría del grifo durante al menos 10 minutos.");
            System.out.println("2. No romper las ampollas si las hay.");
            System.out.println("3. Cubrir la quemadura con un apósito estéril o una compresa limpia.");
            System.out.println("4. Buscar atención médica para evaluar el tratamiento adicional.");
        }
        else if (opcion==3){
            System.out.println("Tratamiento: ");
            System.out.println("Tratamiento:");
            System.out.println("1. Llamar al 911 o acudir a la sala de emergencias de inmediato.");
            System.out.println("2. No intentar tratar la quemadura en casa.");
            System.out.println("3. Mantener al paciente lo más cómodo posible y elevar la zona quemada si es posible.");

        }
        else {
            System.out.println("Opcion incorrecta");
        }
    }
}
