package list.shell;

import java.util.Deque;
import java.util.Iterator;
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
        String[] input = path.split("/");

        if(path.startsWith("/")) {
            if (!data.isEmpty()) data.clear();
        }
        for(String i : input) {
            if(i.isEmpty()) continue;
            if(i.equals("..")) {
                data.pollLast();
                continue;
            }
            data.addLast(i);
        }
    }

    public String pwd() {
        if(data.isEmpty()) {
            return "/";
        }

        Iterator<String> it = data.iterator();
        String ans = "";
        String pref = "/";
        while(it.hasNext()) {
            ans += pref + it.next();
        }
        return ans;
    }

}