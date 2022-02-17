import java.util.HashMap;
import java.util.Map;

public class CollectionCharacterFromString {
    public Map<Character, Integer> View(String[] text) {
        int count = 0;
        // to store every each character and how many is them
        Map<Character, Integer> listMap = new HashMap<>();
        for (int i = 0; i < text.length; i++) {
            for (int j = 0; j < text[i].length(); j++) {
                // take validate if listMap contain key
                if (listMap.containsKey(text[i].charAt(j))) {
                    Integer integer = listMap.get(text[i].charAt(j));
                    count = integer + 1;
                    listMap.put(text[i].charAt(j), count);
                } else {
                    count = 1;
                    listMap.put(text[i].charAt(j), count);
                }
            }
        }
        return listMap;
    }
}
