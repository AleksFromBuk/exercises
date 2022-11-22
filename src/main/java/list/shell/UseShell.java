package list.shell;

public class UseShell {
    public static void main(String[] args) {
        Shell exm = new Shell();
        exm.cd("/path/to/file");
        System.out.println(exm.pwd());
    }
}
