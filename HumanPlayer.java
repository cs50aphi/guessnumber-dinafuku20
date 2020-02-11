import java.util.Scanner;

public class HumanPlayer
{
    Scanner kb = new Scanner(System.in);
    public int play(int result)
    {
        if (result == -1)
        {
            System.out.println("Too low!");
        }
        if (result == 1)
        {
            System.out.println("Too high!");
        }
        // Ask for a new guess

        int humanGuess = kb.nextInt();
        return humanGuess;
    }
}