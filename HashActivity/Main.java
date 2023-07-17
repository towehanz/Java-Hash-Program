package HashActivity;


    import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner inp = new Scanner(System.in);
        Heroes obj = new Heroes();

            obj.insertHeroes();

            String hero = inp.nextLine().toUpperCase();

            boolean check = obj.mlHeroes.containsKey(hero);

            if (check == true) {
                System.out.println("--------------------------------------------------------");
                System.out.println("Price: " + obj.mlHeroes.get(hero));

                obj.moontonMessage();
                System.out.println("--------------------------------------------------------");
                System.out.println("Your hero: " + hero);
                obj.play();

            } else {
                System.out.println("Invalid Input!");
                System.exit(0);
            }


    }
}

