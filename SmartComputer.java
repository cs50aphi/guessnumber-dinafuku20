public class SmartComputer
{
    public int play(int result, int computerGuess)
    {
        if (result == 0)
        {
            computerGuess /= 2;
        }
        else if (result == -1)
        {
            System.out.println("Too low!");
            computerGuess++;  // (lastGuess + range) / 2;
        }
        else if (result == 1)
        {
            System.out.println("Too high!");
            computerGuess--;
        }
        return computerGuess;
    }
}