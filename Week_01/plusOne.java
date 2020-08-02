package Week_01;

import java.util.Arrays;

public class twoSum {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        digits = Arrays.copyOf(digits, digits.length + 1);
        digits[0] = 1;
        return digits;
    }
}
