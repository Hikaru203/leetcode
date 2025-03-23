package Java.Array;

public class _387_First_Unique_Character_in_a_String {
    // Này chậm điên luôn

    // int count = -1;
    // for (int i = 0; i < s.length(); i++) {
    // if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
    // count = i;
    // return i;
    // }
    // }

    // return count;

    static {
        for (int i = 0; i < 500; i++) {
            firstUniqChar("a");
        }
    }

    public static int firstUniqChar(String s) {
        char[] ca = s.toCharArray();
        int[] freq = new int[123];

        for (char ch : ca) {
            freq[ch]++;
        }

        for (int i = 0; i < ca.length; i++) {
            if (freq[ca[i]] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        int result = new _387_First_Unique_Character_in_a_String().firstUniqChar(s);
        System.out.println("Result: " + result);
    }
}
