package ExceptionsAndLogging.AllPrincipesLastTask;

import java.util.logging.*;


public class Spy implements MailService {
    public static final String AUSTIN_POWERS = "Austin Powers";
    private final Logger log;

    public Spy (Logger logger) {

        this.log = logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if(mail instanceof MailMessage) {
            String from = mail.getFrom();
            String to = mail.getTo();
            if(from == AUSTIN_POWERS || to == AUSTIN_POWERS) {
                log.log(Level.WARNING,
                        " Detected target mail correspondence: from {0} to {1} {2}",
                        new Object[] {from, to, "\"" + ((MailMessage) mail).getMessage() + "\""}
                        );
            } else {
                log.log(Level.INFO,
                        " Usual correspondence: from {0} to {1}",
                        new Object[] {from, to}
                );
            }
        }
        return mail;
    }
}
