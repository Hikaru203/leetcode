package Java;

public class _13_Roman_to_Integer {
    public int romanToInt(String s) {
        // Map Roman numerals to their integer values
        int[] values = new int[26];
        values['I' - 'A'] = 1;
        values['V' - 'A'] = 5;
        values['X' - 'A'] = 10;
        values['L' - 'A'] = 50;
        values['C' - 'A'] = 100;
        values['D' - 'A'] = 500;
        values['M' - 'A'] = 1000;

        int total = 0;
        int prevValue = 0;

        // Iterate through the Roman numeral string
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = values[s.charAt(i) - 'A'];

            // If the current value is less than the previous value, subtract it
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                // Otherwise, add it
                total += currentValue;
            }

            // Update the previous value
            prevValue = currentValue;
        }

        return total;
    }
}