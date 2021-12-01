package fr.lernejo.guessgame;


import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;
import java.util.Scanner;

public class HumanPlayer implements Player {
    private Logger logger = LoggerFactory.getLogger("player");

    @Override
    public long askNextGuess() {
        System.out.println("Can you guess a number !");
        Scanner sc = new Scanner(System.in);
        long nub = sc.nextLong();
        return 0;
    }

    @Override
    public void respond(boolean lowerOrGreater) {

    }
}
