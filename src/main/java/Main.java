import java.awt.peer.SystemTrayPeer;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.zip.CheckedOutputStream;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //scanner for the user inputs

        int Answer = 45;
        int counter = 0;



        System.out.println("Hello! Welcome to my guessing game! The mystery number is between 0 and 100, " +
                "guess the right number to win."); //Greeting prompt for the user

        while (true) {
            int guess = scanner.nextInt();

            if (guess == Answer) {
                System.out.print("Correct! You guessed the right answer after " + counter  + " guess(es)"  );

            } else if (guess < Answer) {
                System.out.print("Wrong! your guess to too small. Try again.");
                counter++;
            } else if (guess > Answer) {
                System.out.print("Wrong! your guess is too large. Try again.");
                counter++;
            }

        }
    }
}

