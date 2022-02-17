import java.util.*;

public class CollectionCharacterFromArray {

    public Object[] View(String[] text) {
        String temp = "";
        String temp2 = "";
        CollectionCharacterFromString collectionCharacterFromString = new CollectionCharacterFromString();
        Map<Character, Integer> characterIntegerMap = collectionCharacterFromString.View(text);
        Object[] array = characterIntegerMap.entrySet().toArray();

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].toString().charAt(2) < array[j].toString().charAt(2)) {
                    temp = String.valueOf(array[i]);
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            for (int k = 1; k < array.length; k++) {
                if (array[k - 1].toString().charAt(2) != array[k].toString().charAt(2)) {
                    continue;
                } else {
                    if (array[k - 1].toString().charAt(0) > array[k].toString().charAt(0)) {
                        temp2 = array[k - 1].toString();
                        array[k - 1] = array[k];
                        array[k] = temp2;
                    }
                }
            }
        }
        return array;
    }
}
