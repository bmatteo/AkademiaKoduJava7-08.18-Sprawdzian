import java.util.ArrayList;

public class Utils {
    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static int sumOfArray(ArrayList<Integer> list) {
        int result = 0;
        for (Integer element : list) {
            result = result+element;
        }
        return result;
    }

    public static int multiplicationOfArray(ArrayList<Integer> list) {
        int result = 1;
        for (Integer element : list) {
            result = result*element;
        }
        return result;
    }
}
