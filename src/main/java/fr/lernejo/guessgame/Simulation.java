package fr.lernejo.guessgame;
import fr.lernejo.logger.*;
import java.util.Scanner;
import java.security.SecureRandom;

public class Simulation {
    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;  //TODO add variable type
    private long numberToGuess ; //TODO add variable type
    SecureRandom random = new SecureRandom();


    public Simulation(Player player) {
        //TODO implement me
        this.player = player;


    }


    public void initialize(long numberToGuess) {
        //TODO implement me
        this.numberToGuess = numberToGuess;

    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        //TODO implement me
        if (numberToGuess < player.askNextGuess()) {
            System.out.println("The number is inferior");
            return false;
        }
        else if (numberToGuess > player.askNextGuess()){
            System.out.println("The number is superior");
            return false;
        }else {
            System.out.println("Good job");
            return true;
        }
    }

    public void loopUntilPlayerSucceed() {
        //TODO implement me

        while (numberToGuess != player.askNextGuess()){
            nextRound();
        }

    }

}
