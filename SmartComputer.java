public class SmartComputer
{
    public int play(int result, int computerGuess)
    {
        // at the start set the computer guess to half the max
        if (result == 0)
        {
            computerGuess /= 2;
        }
        // if guess is too low, add 1
        else if (result == -1)
        {
            System.out.println("Too low!");
            computerGuess++;  // (lastGuess + range) / 2;
        }
        // if guess is too high, subtract 1
        else if (result == 1)
        {
            System.out.println("Too high!");
            computerGuess--;
        }
        return computerGuess;
    }
}