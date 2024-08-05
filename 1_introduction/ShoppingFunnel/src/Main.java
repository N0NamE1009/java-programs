import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);

        System.out.println("Contactos: ");
        int contactos=console.nextInt();

        System.out.println("Hay "+contactos+" prospectos");
        String etapa1= "Se le envia un email";
        int porcentaje1=25;
        int prospectos=(int) porcentaje1*contactos/100;
        System.out.println("Etapa 1: hay "+prospectos+" prospectos");

        String etapa2= "El prospecto ingresa a la web ";
        int porcentaje2=10;
        prospectos =(int) porcentaje2*prospectos/100;
        System.out.println("Etapa 2: hay "+prospectos+" prospectos");


        String etapa3= "El prospecto ingresa a la seccion de compras";
        int porcentaje3=10;
        prospectos =(int) porcentaje3*prospectos/100;
        System.out.println("Etapa 3: hay "+prospectos+" prospectos");


        String etapa4= "El prospecto compra el servicio";
        int porcentaje4=10;
        prospectos =(int) porcentaje4*prospectos/100;
        System.out.println("Etapa 4: hay "+prospectos+" prospectos");

    }
}
