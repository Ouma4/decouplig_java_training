package fr.lernejo.guessgame;
import java.security.SecureRandom;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Player player = new Player() {
            @Override
            public long askNextGuess() {
                Scanner newNumber = new Scanner(System.in);
                long nB = newNumber.nextLong();
                return nB;
            }

            @Override
            public void respond(boolean lowerOrGreater) {
                if(lowerOrGreater){
                    System.out.println("The number is inferior");
                }else {
                    System.out.println("The number is superior");

                }
            }
        };
        Simulation premier = new Simulation(player);
        SecureRandom random = new SecureRandom();
        long Number = random.nextInt(100);

        premier.initialize(Number);
        premier.loopUntilPlayerSucceed();
    }
}
