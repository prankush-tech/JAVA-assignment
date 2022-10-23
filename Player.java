import java.util.Scanner;
//this is the player class
public class Player 
{
    int chances =5;
    int number =5;
    Player(){}

    void play(Scanner input, Randomizer game )
    {
        
        for (int i = 0; i < chances; i++) 
        {
            System.out.print("Guess the number: ");

            number = Integer.parseInt(input.next());

            if (number > game.getSecretNumber()) 
            {
                System.out.println("Answer is lower");
                System.out.println("Hint: Closer to: " + (game.getSecretNumber()-2) + "\n");
            }
            else if (number < game.getSecretNumber()) {
                System.out.println("Answer is higher");
            }
            else 
            {
                System.out.println("***Congratulations you won the game***");
                break;
            }
        }
    }
}
