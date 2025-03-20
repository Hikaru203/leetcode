package Java.Array;

public class find_number_with_even_number_of_digits_1295 {

    public static int findNumbers(int[] nums) {
        int total = 0;
        // for (int a : nums) {
        // int count = 0;
        // while (a != 0) {
        // a = a / 10;
        // count++;
        // }
        // if (count % 2 == 0) {
        // total++;
        // }
        // }

        // for (int i : nums) {
        // int length = String.valueOf(i).length();
        // if (length % 2 == 0) {
        // total++;
        // }
        // }

        for (int i : nums) {
            if (((int) Math.log10(i) + 1) % 2 == 0) {
                total++;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        int result = findNumbers(nums);
        System.out.println("Result: " + result);
    }
}