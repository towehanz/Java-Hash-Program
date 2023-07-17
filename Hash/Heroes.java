package Hash;
//a.
import java.util.*;

//1. 
public class Heroes {
    //b.
    HashMap<String,Integer> mlHeroes = new HashMap<String,Integer>();
    

    Scanner input = new Scanner(System.in);
    //c.
      void insertHeroes(){
        mlHeroes.put("GUSION", 32000);
        mlHeroes.put("CHOU", 24000);
        mlHeroes.put("ANGELA", 24000);
        mlHeroes.put("TIGREAL", 6500);
        System.out.println("Buy your hero and let's play a game!");
        System.out.println("Heroes: "+mlHeroes);
    }
    //d.
     void moontonMessage(){
        System.out.println("Thank you for buying!");
        System.out.println("Do you want to play y/n?");
        String answer = input.nextLine().toUpperCase();

        if (answer.equalsIgnoreCase("y")){
            HashSet<String> inGameHero = new HashSet<String>();

            inGameHero.add("VALE");
            inGameHero.add("GUSION");
            inGameHero.add("LAYLA");
            inGameHero.add("JAWHEAD");
            inGameHero.add("MIYA");
            inGameHero.add("ROGER");
            inGameHero.add("LANCELOT");
            System.out.println(inGameHero);
        
        System.out.println("Please ban a hero: ");
        String ban =  input.nextLine().toUpperCase();
        inGameHero.remove(ban);

        System.out.println(inGameHero);
        } else if (answer.equalsIgnoreCase("n")){
            System.out.println("Edi don't");
            System.exit(0);
        } else {
            System.out.println("Invalid input");
            System.exit(0);
        }

    }
    
    //e.
    public void play(){
        System.out.println("Great! Get ready for battle");
    }
}