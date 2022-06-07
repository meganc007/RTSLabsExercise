import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseTest {

    @Test
    void aboveBelow_equals_provided_test_input() {
        int[] intArray = new int[]{1, 5, 2, 1, 10};
        int comparisonValue = 6;

        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("below", 4);
        expected.put("above", 1);
        expected.put("matches", 0);

        assertEquals(expected, Exercise.aboveBelow(intArray, comparisonValue));
    }

    @Test
    void aboveBelow_equals_generated_test_input_1() {
        int[] intArray = new int[]{4, 8, 12, 16, 18};
        int comparisonValue = 14;

        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("below", 3);
        expected.put("above", 2);
        expected.put("matches", 0);

        assertEquals(expected, Exercise.aboveBelow(intArray, comparisonValue));
    }

    @Test
    void aboveBelow_equals_generated_test_input_2() {
        int[] intArray = new int[]{1, 2, 4, 17, 18};
        int comparisonValue = 4;

        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("below", 2);
        expected.put("above", 2);
        expected.put("matches", 1);

        assertEquals(expected, Exercise.aboveBelow(intArray, comparisonValue));
    }

    @Test
    void stringRotation_equals_provided_test_input() {
        String expected = "ngMyStri";
        String originalString = "MyString";
        int rotationAmount = 2;

        assertEquals(expected, Exercise.stringRotation(originalString, rotationAmount));
    }

    @Test
    void stringRotation_equals_generated_test_input_1() {
        String expected = "eans to.A wizard is never late, Frodo Baggins. Nor is he early. He arrives precisely when he m";
        String originalString = "A wizard is never late, Frodo Baggins. Nor is he early. He arrives precisely when he means to.";
        int rotationAmount = 8;

        assertEquals(expected, Exercise.stringRotation(originalString, rotationAmount));
    }

    @Test
    void stringRotation_equals_generated_test_input_2() {
        String expected = "st of Queen albums.All tapes left in a car for more than about a fortnight metamorphose into Be";
        String originalString = "All tapes left in a car for more than about a fortnight metamorphose into Best of Queen albums.";
        int rotationAmount = 19;

        assertEquals(expected, Exercise.stringRotation(originalString, rotationAmount));
    }

    @Test
    void stringRotation_throws_Index_Out_Of_Bounds_Exception() {
        String originalString = "The night is dark and full of terrors.";
        int rotationAmount = 45;

        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            Exercise.stringRotation(originalString, rotationAmount);
        });
    }
}