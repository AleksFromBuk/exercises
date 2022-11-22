package initializer;

public class Lower extends Upper {
    //String lowerString = null;
    String lowerString;

    public Lower()
    {
        super();
        System.out.println("Upper:  " + upperString);
        System.out.println("Lower:  " + lowerString);
    }

    public static void main(final String[] args)
    {
        new Lower();
    }
}
