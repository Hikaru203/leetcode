package Java;

public class _13_Roman_to_Integer {
    public int romanToInt(String s) {
        String []romans = { "I", "V", "X", "L", "C", "D", "M" };
        int []values = { 1, 5, 10, 50, 100, 500, 1000 };

        while (s.length() > 0) {
            for (int i = 0; i < romans.length; i++) {
                if (s.startsWith(romans[i])) {
                    s = s.substring(romans[i].length());
                    return values[i] + romanToInt(s);
                }
            }
        }

        return 0;
    }
}