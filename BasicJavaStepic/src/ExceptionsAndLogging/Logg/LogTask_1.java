package ExceptionsAndLogging.Logg;

import java.util.logging.*;


public class LogTask_1 {
    //private static final Logger LogA  = Logger.getLogger("org.stepic.java.logging.ClassA");
    //private static final Logger LogB = Logger.getLogger("org.stepic.java.logging.ClassB");

    public static void main(String[] args) {
        configureLogging();
    }

    private static void configureLogging() {
        Logger.getLogger("org.stepic.java.logging.ClassA").setLevel(Level.ALL);
        Logger.getLogger("org.stepic.java.logging.ClassB").setLevel(Level.WARNING);

        Handler hUnion = new ConsoleHandler();
        XMLFormatter fUnion = new XMLFormatter();
        hUnion.setFormatter(fUnion);
        hUnion.setLevel(Level.ALL);
        Logger.getLogger("org.stepic.java").addHandler(hUnion);
        Logger.getLogger("org.stepic.java").setUseParentHandlers(false);
    }
}
