// by Dylan Inafuku, 2020
import java.util.Scanner;

public class GuessNumber
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int numGuesses = 0; // running total of number of guesses for the computer
        int computerGuesses = 0; // running total of number of guesses for the computer
        boolean won = false; // keeps track of whether game is won
        int result = 0; // -1 is too low, 1 is too high, and 0 means beginning of game
        // creates computer AI and human player
        SmartComputer comp = new SmartComputer();
        HumanPlayer human = new HumanPlayer();
        System.out.println("Welcome to the game!");
        // asks for range
        System.out.println("What's the highest number you'd like me to pick?");
        int range = kb.nextInt();
        // generates random number
        int answer = (int)(Math.random()*range + 1);
        // ask player to guess
        System.out.println("I'm thinking of a number between 1 and " + range);
        System.out.println("What's your guess?");
        while (!won)
        {
            int guess = human.play(result); // takes int from HumanPlayer
            // Figure out whether we are too high or too low
            if (guess < answer)
            {
                result = -1;
                numGuesses++;
            }
            else if (guess > answer)
            {
                result = 1;
                numGuesses++;
            }
            else
            {
                won = true;
                numGuesses++;
                System.out.println("You won in " + numGuesses + " guesses!");
            }
        }
        // set result to 0 for the computer
        result = 0;
        // set win condition to false for the computer
        won = false;

        // computer plays
        System.out.println("I'm thinking of a number between 1 and " + range);
        System.out.println("What's your guess?");
        // int lastGuess = 0;
        while (!won)
        {
            // provide the max value for a number and result
            int guess = comp.play(result, range);
            // lastGuess = guess;
            System.out.println("Computer guessed " + guess);
            // Figure out whether computer is too high or too low
            if (guess < answer)
            {
                result = -1;
                computerGuesses++;
                range = guess;
            }
            else if (guess > answer)
            {
                result = 1;
                computerGuesses++;
                range = guess;
            }
            else
            {
                won = true;
                computerGuesses++;
                // say how many guesses the computer and player won with
                System.out.println("The computer won in " + computerGuesses + " guesses and you won in " + numGuesses + " guesses!");
                // state who won or if it was a tie
                if (numGuesses < computerGuesses)
                {
                    System.out.println("Congratulations! You beat the computer!");
                }
                else if (numGuesses == computerGuesses)
                {
                    System.out.println("It's a tie!");
                }
                else
                {
                    System.out.println("You lost to the computer...");
                }
            }
        }
    }
}