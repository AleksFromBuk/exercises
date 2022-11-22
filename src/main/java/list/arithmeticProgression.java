package list;

import java.util.List;

public class arithmeticProgression {
    public static int checkData(List<Integer> data) {
        for(int i = 1; i < data.size() - 1; i++) {
            if(data.get(i) - data.get(i - 1) != data.get(i + 1) - data.get(i)) {
                return 0;
            }
        }
        return (data.get(0) + data.get(data.size() - 1)) * data.size() / 2;
    }
}
