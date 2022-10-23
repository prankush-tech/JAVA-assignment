import java.util.Scanner;

public class Game {
    private Scanner input;
    private Player player;
    private Randomizer Randomizer;
    private boolean running;
    private String command;

    Game() {
        this.player = new Player();
        this.input = new Scanner(System.in);
        this.Randomizer = new Randomizer(10);
        this.running = true;
    }

    public void start() 
    {
        while (running) 
        {
            System.out.println("Choose your options : EXIT or PLAY");
            System.out.print("");
            this.command = this.input.next();

            if (this.command.equalsIgnoreCase("EXIT")) 
            {
                this.running = false;
            }
            else if (command.equals("PLAY")) 
            {
                this.player.play(this.input, this.Randomizer);
                this.Randomizer.setSecretNumber(20);

            } else 
            {
                System.out.println("COMMAND NOT FOUND\n");
            }
        }
    }
}