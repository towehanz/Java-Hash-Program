package Hash;
import java.util.*;
//2.
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //a.
        Heroes heroes = new Heroes();

        //b.
         heroes.insertHeroes();
        
         //c.
         String userHero = input.nextLine().toUpperCase();

         boolean check = heroes.mlHeroes.containsKey(userHero);

         if (check == true) {
            //d.
            System.out.println("Price: "+ heroes.mlHeroes.get(userHero));

            //e.
             heroes.moontonMessage();
            
             //f.
             System.out.println("Your hero: "+ userHero);
            //g.
             heroes.play();


         } else {
             System.out.println("Invalid input");
             System.exit(0);
         }

    }
    
}
