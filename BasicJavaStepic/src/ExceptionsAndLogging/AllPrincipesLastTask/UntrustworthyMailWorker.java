package ExceptionsAndLogging.AllPrincipesLastTask;

public /*static*/ class UntrustworthyMailWorker implements MailService {
    private final MailService[] someUsers;
    private final RealMailService realWorkService = new RealMailService();

    public UntrustworthyMailWorker(MailService[] someUsers) {

        this.someUsers = someUsers;
    }

    RealMailService getRealMailService() {

        return this.realWorkService;
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
        //return tmp;
    }

}

