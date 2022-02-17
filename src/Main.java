import java.util.*;

public class Main {
    public static void main(String[] args) {
        String input = "We Always Mekar";
        // collect how many character with same vowel in string or Array of String
        // lower or upper character not take effect
        System.out.println("=====Collect Every Character of String====");
        System.out.println(input);
        CollectionCharacterFromString collectionCharacterFromString = new CollectionCharacterFromString();
        for (Map.Entry<Character, Integer> entry : collectionCharacterFromString.View(input.toLowerCase().split(" ")).entrySet()) {
            System.out.print(entry.getKey() + " = " + entry.getValue() + ", ");
        }
        System.out.println();
        System.out.println("=====Collect Every Character of String Array And Shorten====");
        String[] inputArray = {"Pendanaan", "Terproteksi", "Untuk", "Dampak", "Berarti"};

        System.out.println(Arrays.toString(inputArray));
        // collect how many character with same vowel in Array
        // lower or upper character will be effect
        // sort every value and character from higher to lower
        System.out.println("=====Collection data=====");
        CollectionCharacterFromArray collectionCharacterFromArray = new CollectionCharacterFromArray();
        for (Map.Entry<Character, Integer> entry : collectionCharacterFromString.View(inputArray).entrySet()) {
            System.out.print(entry.getKey() + " = " + entry.getValue() + ", ");
        }
        System.out.println();
        System.out.println("=======Shorted data======");
        for (Object o : collectionCharacterFromArray.View(inputArray)) {
            System.out.print(o.toString().charAt(0) + ", ");
        }
    }
}
