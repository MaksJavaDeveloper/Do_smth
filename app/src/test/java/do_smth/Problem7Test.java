package do_smth;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class Problem7Test {

    @Test
    public void testThatRomeToArabicMethodWorksOk() {
        Map<String, Integer> testCases = new LinkedHashMap<>();
        testCases.put("I", 1);
        testCases.put("II", 2);
        testCases.put("III", 3);
        testCases.put("IV", 4);
        testCases.put("V", 5);
        testCases.put("VI", 6);
        testCases.put("VII", 7);
        testCases.put("VIII", 8);
        testCases.put("IX", 9);
        testCases.put("X", 10);

        testCases.put("XII", 12);
        testCases.put("LIII", 53);
        testCases.put("XCVIII", 98);
        testCases.put("DVX", 515);
        testCases.put("M", 1000);
        testCases.put("MX", 1010);
        testCases.put("MMM", 3000);

        testCases.forEach((rome, expectedToArabic) ->
            Assertions.assertEquals(expectedToArabic,
                    new Problem7().romeToArabic(rome),
                    rome));
    }

@Test
    public void testThatArabicToRomeMethodWorksOk() {
        Map<Integer, String> testDigits = new HashMap<>();
        testDigits.put(1, "I");
        testDigits.put(2, "II");
        testDigits.put(3, "III");
        testDigits.put(4, "IV");
        testDigits.put(5, "V");
        testDigits.put(6, "VI");
        testDigits.put(7, "VII");
        testDigits.put(8, "VIII");
        testDigits.put(9, "IX");
        testDigits.put(10, "X");
        testDigits.put(12, "XII");
        testDigits.put(53, "LIII");
        testDigits.put(98, "XCVIII");
        testDigits.put(560, "DLX");
        testDigits.put(1000, "M");
        testDigits.put(1010, "MX");
        testDigits.put(3000, "MMM");

        testDigits.forEach((arabic, expectedRoman) -> {
            Assertions.assertEquals(expectedRoman,
                    new Problem7().arabicToRome(arabic),
                    Integer.toString(arabic));
        });
    }

    @Test
    public void testThatCalculateMethodWorksOk() {
        Map<String, String> testCases = new HashMap<>();
        testCases.put("III + IV", "VII");
//        testCases.put("II + II", "IV");
//        testCases.put("I + X", "XI");

        testCases.forEach((expression, expected) -> {
            Assertions.assertEquals(expected,
                    new Problem7().calculate(expression),
                    expression
            );
        });
    }
}