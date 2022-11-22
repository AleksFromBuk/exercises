package ExceptionsAndLogging.AllPrincipesLastTask;

public class Thief implements MailService {
    private final int minInterest;

    public Thief(int current) {

        minInterest = current;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if(mail instanceof MailPackage) {
            if(((MailPackage) mail).getContent().getPrice() >= minInterest) {
                String from = mail.getFrom();
                String to = mail.getTo();
                String originContent = ((MailPackage) mail).getContent().getContent();
                //содержимым посылки "stones instead of {content}"
                Package fake = new Package("stones instead of " + originContent,
                        0);
                mail = new MailPackage(from, to, fake);
            }
        }
        return mail;
    }
//    long getStolenValue() {
//
//    }
}
