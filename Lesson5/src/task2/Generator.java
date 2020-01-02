package task2;

import java.util.*;

public class Generator {
    Set<Number> set = new HashSet<>();
    List<Number> list = new ArrayList<>();
    Random random = new Random();

    public Set<Number> getSet() {
        return set;
    }

    public List<Number> getList() {
        return list;
    }

    Generator(int N, int from, int to) {
        double temp;
        for (int i = 0; i < N; i++) {
            temp = random.nextInt(to - from + 1) + from;
            list.add(temp);
            set.add(temp);
        }
        while (set.size() != N) {
            temp = random.nextDouble() * (to - from) + from;
            set.add(temp);
        }
    }

}
