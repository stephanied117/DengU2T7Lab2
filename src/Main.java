import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        int points = 0;
        int wordCount = 0;
        System.out.println("Enter a word: ");
        String string1 = scan.nextLine();
        wordCount ++;
        while (score < 50) {
            System.out.println("Enter a word: ");
            String string2 = scan.nextLine();
            wordCount ++;
            if (string1.compareTo(string2) < 0) {
                points = points + 2;
            }
            if (string1.compareTo(string2) > 0) {
                points = points - 5;
            }
            if (string1.equals(string2)) {
                points = points - 10;
            }
            if (string1.substring(string1.length() - 2, string1.length()).equals(string2.substring(0, 2))) {
                points = points + 5;
            }
            if (string2.indexOf(string1.substring(0, 1)) != -1) {
                points = points + 3;
            }
            score += points;
            System.out.println("Points: " + points);
            System.out.println("Score: " + score);
            System.out.println( );
            points = 0;
            string1 = string2;
        }
        System.out.println("Total words: " + wordCount);
    }
}
