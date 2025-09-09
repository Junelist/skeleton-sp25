import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
    public static int sum(List<Integer> L) {
        int sum = 0;
        for (int num : L) {
            sum += num;
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> res = new ArrayList<>();
        for (int num : L) {
            if (num % 2 == 0) {
                res.add(num);
            }
        }
        return res;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> res = new ArrayList<>();
        for (int num1 : L1) {
            for (int num2 : L2) {
                if (num1 == num2) {
                    res.add(num2);
                }
            }
        }
        return res;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int count = 0;
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (c == word.charAt(i)) {
                    count++;
                }
            }
        }
        return count;
    }
}
