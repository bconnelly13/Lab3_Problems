import java.util.*;
public class Main {
    public static void main(String[] args) {
        //////// Problem 1 ////////
        rollDice(1,6);
        rollDice(20,40);
        rollDice(100,200);

        //////// Problem 2 ////////
        Scanner names = new Scanner(System.in);
        System.out.println("Enter your entire name as one input with spaces: ");
        String name = names.nextLine();

        // Get index of the first letter in middle and last name
        int startMiddle = name.indexOf(" ") + 1;
        int startLast = name.substring(startMiddle).indexOf(" ") + startMiddle + 1;

        // Make individual string for each sub-name
        String firstName = name.substring(0,startMiddle - 1);
        String middleName = name.substring(startMiddle, startLast - 1);
        String lastName = name.substring(startLast);

        // Find and print number of letters in full name
        int numLetters = firstName.length() + middleName.length() + lastName.length();
        System.out.println("Letters in your name: " + numLetters);

        // Print each sub-name
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);

        // Find and print initials
        String initials = firstName.substring(0,1) + middleName.substring(0,1) + lastName.substring(0,1);
        System.out.println("Your initials: " + initials);

        // Print first and last name
        System.out.println("Your first and last name: " + firstName + " " + lastName);


        //////// Problem 3 ////////
        System.out.println("Enter word to be translated into Pig Latin: ");
        String word = names.nextLine();
        System.out.println(word + " in Pig Latin: " + pigLatin(word));

    }
    public static void rollDice(int start_num, int end_num){
        // Gets and prints random number in the given range
        int range = end_num - start_num + 1;
        int random_int = (int)(Math.random() * range + start_num);
        System.out.println("Random integer between " + start_num + " and " + end_num + ": " + random_int);
    }
    public static String pigLatin(String word){
        // Makes and returns given word in Pig Latin (first letter to end then add "ay")
        String newWord = word.substring(1) + word.substring(0,1) + "ay";
        return newWord;
    }
}
