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
        long tmp = player.askNextGuess();

        if (numberToGuess < tmp) {
            player.respond(true);
            return false;
        }
        else if (numberToGuess > tmp){
            player.respond(false);
            return false;
        }else {
            logger.log("Good job");
            return true;
        }
    }

    public void loopUntilPlayerSucceed() {
        //TODO implement me
        boolean win = false;
        while (!win){
            win = nextRound();
        }

    }

}
