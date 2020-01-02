package task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Translator {
    Map<String, String> translator = new HashMap<>();

    void addPair(String eng, String rus) {
        translator.put(eng, rus);
    }

    List<String> getTranslation(String[] words) {
        List<String> temp = new ArrayList<>();
        for (String word : words)
            temp.add(translator.get(word));
        return temp;
    }

}
