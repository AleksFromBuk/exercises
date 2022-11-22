package ExceptionsAndLogging;

public class CastException {

    public static class Foo {
        int b;
    }

    public class Poo extends Foo {
        int c;
    }

    public static void main(String[] args) {
        Foo a = new Foo();
        Poo b = (Poo) a;
    }
}
