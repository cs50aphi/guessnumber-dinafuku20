import java.util.Scanner;

public class HumanPlayer
{
    Scanner kb = new Scanner(System.in);
    public int play(int result)
    {
        // state if too high or low based on the given result
        if (result == -1)
        {
            System.out.println("Too low!");
        }
        if (result == 1)
        {
            System.out.println("Too high!");
        }

        // return the guess
        int humanGuess = kb.nextInt();
        return humanGuess;
    }
}