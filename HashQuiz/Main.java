package HashQuiz;

import java.util.*;


public class Main {
    
    public static Scanner input = new Scanner(System.in);
    
    public static void countOccurrences(ArrayList<String> list) {
       
        HashSet <String> word = new HashSet<String>(list);

        for (String s : word)
            System.out.println(s + ": " +" "+ Collections.frequency(list, s));
    }
        public static void main(String[] args){

            System.out.println("Enter a sentence: ");
            
            String sentence = input.nextLine();
           
            String[] arr = sentence.split(" ");
            ArrayList<String> list = new ArrayList<String>();
            System.out.println("\nKey "+" "+ "Value");

            for (String s : arr){
            

                list.add(s);
            }
         countOccurrences(list);

         System.out.println("\nSize: "+ list.size());
         System.out.println("\nisEmpty: "+ list.isEmpty()+"\n");
         
            }
        }
       
     
        
        
     
