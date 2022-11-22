package ExceptionsAndLogging.AllPrincipesLastTask;

public /*static*/ class RealMailService implements MailService {

    @Override
    public Sendable processMail(Sendable mail) {
        // Здксь описан код настоящей системы отправки почты
        return mail;
    }
}
