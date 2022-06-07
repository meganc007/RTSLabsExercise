import java.util.HashMap;

public class Exercise {
    public static HashMap<String, Integer> aboveBelow(int[] intArray, int comparisonValue) {
        /**
         * aboveBelow
         * accepts two arguments: An unsorted collection of integers (the list) & an integer (the comparison value)
         * returns a hash/object/map/etc. with the keys "above" and "below" with the corresponding count of integers from the list that are above or below the comparison value
         * Example usage:
         * input: [1, 5, 2, 1, 10], 6
         * output: { "above": 1, "below": 4 }
         * */

        HashMap<String, Integer> output = new HashMap<>();
        int below = 0;
        int above = 0;
        int matches = 0;

        for (int j : intArray) {
            if (j < comparisonValue) {
                below++;
            } else if (j > comparisonValue) {
                above++;
            } else {
                matches++;
            }
        }

        output.put("above", above);
        output.put("below", below);
        output.put("matches", matches);

        System.out.println(output);
        return output;
    }

    public static String stringRotation(String originalString, int rotationAmount) throws IndexOutOfBoundsException {
        /**
         * stringRotation
         * accepts two arguments: a string (the original string) & a positive integer (the rotation amount)
         * returns a new string, rotating the characters in the original string to the right by the rotation amount and have the overflow appear at the beginning
         * Example usage:
         * input: "MyString", 2
         * output: "ngMyStri"
         * */

        try {
            int start = originalString.length() - rotationAmount;
            int end = originalString.length();

            String substr = originalString.substring(start, end);
            String substr2 = originalString.substring(0, start);
            String output = substr.concat(substr2);

            System.out.println(output);
            return output;
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
            throw new IndexOutOfBoundsException();
        }
    }
}
