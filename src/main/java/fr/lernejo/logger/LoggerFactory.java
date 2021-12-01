package fr.lernejo.logger;

public class LoggerFactory {

    public static Logger getLogger(String name) {
        ConsoleLogger logger = new ConsoleLogger();
        return logger;
    }
}



