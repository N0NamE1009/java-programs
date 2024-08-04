//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
* 1.- Can't have spaces
* 2.- Can't start with a number
* 3.- Cannot be a reserved word
*
* camelCase (most used)
* snake_case
* SCREAMING_SNAKE_CASE (constants)
* kebab-case
* */
public class Main {
    public static void main(String[] args) {
        //string
        String name="Luis";
        name="Donaldo";
        String greeting;
        greeting="Hi, my name is ";

        //integer
        int number=10;
        number=number+5;

        //boolean
        boolean isGreater;
        isGreater=false;

        // real number
        double real;
        real=12.3;

        System.out.println(greeting+name);
        System.out.println("Variable number: "+number);
        System.out.println("Boolean: "+isGreater);
        System.out.println("Real number: "+real);
    }
}
