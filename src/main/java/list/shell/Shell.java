package list.shell;

import java.util.Deque;
import java.util.LinkedList;

/**
 * В этом задании нужно написать программу, которая будет
 * симулировать поведение команды cd.
 *
 * В качестве основной структуры нужно использовать очередь.
 */

public class Shell {
    private final Deque<String> data;

    public Shell() {
        this.data = new LinkedList<String>();
    }

    public void cd(String path) {
        data.addLast(path);
        String[] input = path.split("/");
        if(input.length == 1 && path != "..") {
            data.addLast(path);
        }
        //String rsl = Arrays.toString(input);

    }

    public String pwd() {
        return data.peekFirst();
    }

}