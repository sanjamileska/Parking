import java.util.Scanner;

public class Main {

    private static final String VOWELS = "aeiouAEIOU";


    public static int countConsonants(String sentence) {

        if (sentence.isEmpty()) {
            return 0;
        }


        char ch = sentence.charAt(0);
        String restOfSentence = sentence.substring(1);


        if (Character.isLetter(ch) && VOWELS.indexOf(ch) == -1) {
            return 1 + countConsonants(restOfSentence);
        } else {
            return countConsonants(restOfSentence);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your sentence:");
        String sentence = sc.nextLine();


        int count = countConsonants(sentence);

        System.out.println("Your sentence has " + count + " consonants!");


        System.out.println("Example case 1: \"aeiou AEIOU\" has " + countConsonants("aeiou AEIOU") + " consonants.");
        System.out.println("Example case 2: \"bcdfghjklmnpqrstvwxyz\" has " + countConsonants("bcdfghjklmnpqrstvwxyz") + " consonants.");
        System.out.println("Example case 3: \"Hello World\" has " + countConsonants("Hello World") + " consonants.");
    }
}