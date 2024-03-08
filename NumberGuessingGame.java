/* Create a program that asks the user to guess a
 * number between 2 and 100. The program should then
 *  give hints to the user until they
 * guess the correct number.
*/
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number, guess, nguesses = 1;
        number = random.nextInt(99) + 2; // generate a random number between 2 and 100

        do {
            System.out.println("Guess the number between 2 to 100:");
            guess = sc.nextInt();

            if (guess > number) {
                System.out.println("Lower number please!");
            } else if (guess < number) {
                System.out.println("Higher number please!");
            } else {
                System.out.println("You guessed it in " + nguesses + " attempts");
            }

            nguesses++;
        } while (guess != number);

        sc.close();
    }
}
