package Java.Array;

public class _1662_Check_If_Two_String_Arrays_are_Equivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // Cách cơ bản
        // String r1 = "";
        // String r2 = "";

        // for (String string : word1) {
        // r1 = r1 + string;
        // }

        // for (String string : word2) {
        // r2 = r2 + string;
        // }

        // if (r1.equals(r2)) {
        // return true;
        // } else {
        // return false;
        // }

        // Sử dụng String Builder
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();

        for (String string : word1) {
            sb1.append(string);
        }

        for (String string : word2) {
            sb2.append(string);
        }

        return sb1.toString().equals(sb2.toString());
    }

    public static void main(String[] args) {
        String[] word1 = { "ab", "c" };
        String[] word2 = { "a", "bc" };

        boolean result = new _1662_Check_If_Two_String_Arrays_are_Equivalent().arrayStringsAreEqual(word1, word2);
        System.out.println("Result: " + result);
    }
}
