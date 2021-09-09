package studioweek2;
import java.util.*;



public class Counting {
    public static void main(String[] args) {
       /* String hiddenFigures = "If the product of two terms is zero then common sense says at " +
                "least one of the two terms has to be zero to start with. So if you move all the" +
                " terms over to one side, you can put the quadratics into a form that can be factored" +
                " allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty" +
                " straightforward from there.";
        //hiddenFigures.toUpperCase();*/

        Scanner newInput = new Scanner(System.in);
        System.out.println("enter a string please:  ");
        String userInput01 = newInput.nextLine();


        char[] userInput = userInput01.toCharArray();
        HashMap<Character, Integer> numOfCharacter = new HashMap<>();
        for( char letter: userInput){

             letter =Character.toUpperCase(letter);

            int asciiNum = letter;
            if(asciiNum >= 65 && asciiNum <= 90) {


                if (!numOfCharacter.containsKey(letter)) {
                    numOfCharacter.put(letter, 1);
                } else {
                    numOfCharacter.put(letter, numOfCharacter.get(letter) + 1);
                }
            }
        }


        System.out.println(numOfCharacter.entrySet());
        System.out.println(numOfCharacter);
    }
}
