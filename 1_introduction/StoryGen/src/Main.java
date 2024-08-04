//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Write a name: ");
        String name=console.nextLine();

        System.out.println("Write a village name: ");
        String nameVillage=console.nextLine();
        String story="En un pequeño pueblo rodeado de montañas y bosques llamado "+nameVillage+", vivía una anciana llamada Don "+name+". Todos en el pueblo la conocían por su amabilidad y por las historias que solía contar a los niños alrededor de la fogata cada noche. Don "+name+" tenía un secreto, uno que había guardado durante toda su vida: un reloj antiguo y mágico que había pertenecido a su abuela.\n" +
                "\n" +
                "El reloj no solo marcaba el tiempo, sino que también podía manipularlo. Cada vez que Don "+name+" giraba la pequeña llave dorada en el costado del reloj, podía retroceder o avanzar en el tiempo, pero solo por unas horas. Sin embargo, ella usaba su poder con gran cautela y solo cuando era realmente necesario.\n" +
                "\n" +
                "Una fría tarde de invierno, el pueblo se enfrentó a una crisis. Un deshielamiento repentino había causado una avalancha que bloqueaba la única carretera que conectaba el pueblo con el mundo exterior. Sin alimentos ni medicinas, la situación era desesperada. La gente se reunió en la plaza, buscando una solución.\n" +
                "\n" +
                "Don "+name+" observaba desde la distancia, sintiendo el peso de la responsabilidad en sus hombros. Finalmente, decidió que era el momento de usar el reloj. Se dirigió a su casa, sacó el antiguo reloj de su cajón y, con manos temblorosas, giró la llave dorada.\n" +
                "\n" +
                "El tiempo retrocedió unas horas, justo antes de que la avalancha ocurriera. Don"+ name + "se apresuró a advertir a los habitantes del pueblo sobre el peligro inminente y les ayudó a despejar la carretera antes de que se formara el bloqueo. Con el tiempo salvado, el pueblo pudo prepararse mejor para el deshielamiento y evitar la crisis.\n" +
                "\n" +
                "Cuando el pueblo se recuperó y la vida volvió a la normalidad, nadie sabía del sacrificio de Don "+name+", ni del mágico reloj. Ella continuó contando historias y cuidando de su gente, pero guardó el secreto del reloj para sí misma, feliz de haber podido usar su magia para proteger a su querido hogar.\n" +
                "\n" +
                "Y así, en un rincón del mundo, la magia del tiempo seguía fluyendo, no para cambiar el destino, sino para preservar la esperanza y la bondad en los corazones de quienes estaban dispuestos a ayudar.";
        System.out.println(story);
    }
}