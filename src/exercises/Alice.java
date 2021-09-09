package exercises;
import java.util.Scanner;
public class Alice {
    public static void main(String[] args) {
        String aliceStory = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister was" +
                " reading, but it had no pictures or conversations in it, 'and what is the use of" +
                " a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word to search here: ");
        String searchWord = input.nextLine().toLowerCase();
        String aliceLower = aliceStory.toLowerCase();
        int index = aliceLower.indexOf(searchWord);
        if (index != -1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        int strLength = searchWord.length();
        System.out.println(index + " " + strLength);
        String story1 = aliceStory.substring(0, index);
        String story2 = aliceStory.substring(index + strLength);
        System.out.println(story1 + story2);
    }
}
