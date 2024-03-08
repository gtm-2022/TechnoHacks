/* Create a program that allows the user to play the 
 * classic game of rock, paper, scissors against the computer.
 */
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char userChoice, computerChoice;

        computerChoice = 'r'; // Assuming computer always chooses rock initially

        System.out.print("Enter 'r' for rock, 'p' for paper, and 's' for scissors: ");
        userChoice = sc.next().charAt(0);

        int result = rockPaperScissors(userChoice, computerChoice);

        System.out.println("You chose " + userChoice + " and computer chose " + computerChoice + ".");

        if (result == 0) {
            System.out.println("Game draw");
        } else if (result == 1) {
            System.out.println("You win");
        } else {
            System.out.println("You lose");
        }
    }

    public static int rockPaperScissors(char user, char computer) {
        if (user == computer) {
            return 0;
        }

        if ((user == 'r' && computer == 's') || (user == 's' && computer == 'p') || (user == 'p' && computer == 'r')) {
            return 1; // User wins
        } else {
            return -1; // User loses
        }
       
    }
}
