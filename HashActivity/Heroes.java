package HashActivity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Heroes {

    HashMap <String,Integer> mlHeroes = new HashMap<String, Integer>();
    HashSet <String> gameHero = new HashSet<String>();
    Scanner inp = new Scanner(System.in);

    void insertHeroes() {
        mlHeroes.put("GUSION", 3200);
        mlHeroes.put("CHOU", 24000);
        mlHeroes.put("ANGELA", 24000);
        mlHeroes.put("TIGREAL", 6500);

        System.out.println("--------------------------------------------------------");
        System.out.println("Buy your hero and Let's play a game!");
        System.out.println(mlHeroes);
        System.out.println("--------------------------------------------------------");
        System.out.print("Choose Hero: ");
    }

    void moontonMessage() {
        System.out.println("--------------------------------------------------------");
        System.out.println("Thank you for buying!");
        System.out.println("--------------------------------------------------------");
        System.out.println("Do you want to play? (y/n)");

            String user = inp.nextLine().toUpperCase();

            if (user.equals("Y")) {
                gameHero.add("VALE");
                gameHero.add("GUSION");
                gameHero.add("LAYLA");
                gameHero.add("JAWHEAD");
                gameHero.add("MIYA");
                gameHero.add("ROGER");
                gameHero.add("LANCELOT");

                System.out.println("--------------------------------------------------------");
                System.out.println(gameHero);
                System.out.println("--------------------------------------------------------");
                System.out.print("Please ban a hero: ");

                    String ban = inp.nextLine().toUpperCase();

                    gameHero.remove(ban);
                System.out.println("--------------------------------------------------------");
                System.out.println(gameHero);
            }

            else if (user.equals("N")) {
                System.out.println("Edi don't!");

            } else {
                System.out.println("Invalid Input!");
                System.exit(0);
            }

    }

    void play() {
        System.out.println("--------------------------------------------------------");
        System.out.println("Great! Get Ready for Battle");
        System.out.println("--------------------------------------------------------");
    }
}
