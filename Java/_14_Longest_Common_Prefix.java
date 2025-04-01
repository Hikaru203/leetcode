package Java;

public class _14_Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        for (int i = 0; i < strs[0].length(); i++) {
            while (true) {
                for (int j = 1; j < strs.length; j++) {
                    if (i >= strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)) {
                        return strs[0].substring(0, i);
                    }
                }
                break;
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        _14_Longest_Common_Prefix obj = new _14_Longest_Common_Prefix();
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs)); // Output: "fl"
    }
    
}
