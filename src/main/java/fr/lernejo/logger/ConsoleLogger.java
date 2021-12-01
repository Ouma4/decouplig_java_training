package main.java.fr.lernejo.logger;

public class ConsoleLogger {
    interface Pet{
        public  void animalName();
    }

    public class Dog implements Pet {
        // contenu de la classe (attributs, méthodes)
        public void animalName(){
            System.out.println("how I'm I !");
        }

        public static void main(String[] args) {
            Pet MyDogyDog = new Pet() {
                @Override
                public void animalName() {
                    System.out.println("I'm a happy dog");
                }
            };

        };
    }


}



