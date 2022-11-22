package ExceptionsAndLogging.AllPrincipesLastTask;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static final String AUSTIN_POWERS = "Austin Powers";
    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";

    public interface Sendable {
        String getFrom();

        String getTo();
    }

    /*
Абстрактный класс,который позволяет абстрагировать логику хранения
источника и получателя письма в соответствующих полях класса.
*/
    public static abstract class AbstractSendable implements Sendable {

        protected final String from;
        protected final String to;

        public AbstractSendable(String from, String to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public String getFrom() {
            return from;
        }

        @Override
        public String getTo() {
            return to;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AbstractSendable that = (AbstractSendable) o;

            if (!from.equals(that.from)) return false;
            return to.equals(that.to);
        }

    }

    /*
Письмо, у которого есть текст, который можно получить с помощью метода `getMessage`
*/
    public static class MailMessage extends AbstractSendable {

        private final String message;

        public MailMessage(String from, String to, String message) {
            super(from, to);
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;

            MailMessage that = (MailMessage) o;

            return message != null ? message.equals(that.message) : that.message == null;
        }

    }

    /*
Посылка, содержимое которой можно получить с помощью метода `getContent`
*/
    public static class MailPackage extends AbstractSendable {
        private final Package content;

        public MailPackage(String from, String to, Package content) {
            super(from, to);
            this.content = content;
        }

        public Package getContent() {
            return content;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;

            MailPackage that = (MailPackage) o;

            return content.equals(that.content);
        }

    }

    /*
Класс, который задает посылку. У посылки есть текстовое описание содержимого и целочисленная ценность.
*/
    public static class Package {
        private final String content;
        private final int price;

        public Package(String content, int price) {
            this.content = content;
            this.price = price;
        }

        public String getContent() {
            return content;
        }

        public int getPrice() {
            return price;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Package aPackage = (Package) o;

            if (price != aPackage.price) return false;
            return content.equals(aPackage.content);
        }
    }

    /*
Интерфейс, который задает класс, который может каким-либо образом обработать почтовый объект.
*/
    public interface MailService {
        Sendable processMail(Sendable mail);
    }

    /*
    Класс, в котором скрыта логика настоящей почты
    */
    public static class RealMailService implements MailService {

        @Override
        public Sendable processMail(Sendable mail) {
            // Здесь описан код настоящей системы отправки почты.
            return mail;
        }
    }

    public static class UntrustworthyMailWorker implements MailService {
        public MailService[] someUsers;
        public RealMailService realWorkService;

        public UntrustworthyMailWorker(MailService[] users) {
            realWorkService = new RealMailService();
            someUsers = users;
        }

        RealMailService getRealMailService() {
            return realWorkService;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            Sendable tmp = null;
            for (int i = 0; i < someUsers.length - 1; i++) {
                tmp = someUsers[i + 1].
                        processMail(someUsers[i].
                                processMail(getRealMailService().
                                        processMail(mail)));
            }
            return this.getRealMailService().processMail(tmp);
        }

    }

    public static class Spy implements MailService {
        public static final String AUSTIN_POWERS = "Austin Powers";
        private final Logger log;

        public Spy(Logger logger) {

            this.log = logger;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            if (mail instanceof MailMessage) {
                String from = ((MailMessage) mail).getFrom();
                String to = ((MailMessage) mail).getTo();
                if (mail.getFrom().equals(AUSTIN_POWERS) ||
                        mail.getTo().equals(AUSTIN_POWERS)) {
                    log.log(Level.WARNING,
                            "Detected target mail correspondence: from {0} to {1} \"{2}\"",
                            new Object[]{from, to, ((MailMessage) mail).getMessage()}
                    );
                } else {
                    log.log(Level.INFO,
                            "Usual correspondence: from {0} to {1}",
                            new Object[]{from, to}
                    );
                }
            }
            return mail;
        }
    }

    public static class Thief implements MailService {
        private final int minInterest;
        private int sum = 0;

        public Thief(int current) {
            minInterest = current;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            if (mail instanceof MailPackage) {
                if (((MailPackage) mail).getContent().getPrice() >= minInterest) {
                    sum += ((MailPackage) mail).getContent().getPrice();
                    String from = mail.getFrom();
                    String to = mail.getTo();
                    String originContent = ((MailPackage) mail).getContent().getContent();
                    Package fake = new Package("stones instead of " + originContent,
                            0);
                    mail = new MailPackage(from, to, fake);
                }
            }
            return mail;
        }

        long getStolenValue() {
            return sum;
        }
    }

    public static class Inspector implements MailService {

        @Override
        public Sendable processMail(Sendable mail) {
            if (mail instanceof MailPackage) {
                boolean first = ((MailPackage) mail).
                        getContent().
                        getContent().
                        contains("weapons");
                boolean second = ((MailPackage) mail).
                        getContent().
                        getContent().
                        contains("banned substance");
                if (first || second) {
                    throw new IllegalPackageException();
                }
                boolean third = ((MailPackage) mail).
                        getContent().
                        getContent().
                        contains("stones");
                if (third) {
                    throw new StolenPackageException();
                }
            }
            return null;
        }
    }

    public static class IllegalPackageException extends RuntimeException {}
    public static class StolenPackageException extends RuntimeException {}

}
