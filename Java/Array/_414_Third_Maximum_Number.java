package Java.Array;

public class _414_Third_Maximum_Number {
    public static int thirdMax(int[] nums) {
        long m3 = Long.MIN_VALUE;
        long m2 = Long.MIN_VALUE;
        long m1 = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > m1) {
                m3 = m2;
                m2 = m1;
                m1 = nums[i];
            } else if (nums[i] > m2 && nums[i] != m1) {
                m3 = m2;
                m2 = nums[i];
            } else if (nums[i] > m3 && nums[i] != m2 && nums[i] != m1) {
                m3 = nums[i];
            }
        }
        return m3 == Long.MIN_VALUE ? (int) m1 : (int) m3;

    }

    public static void main(String[] args) {
        int[] a = { 1, 1, 2 };
        int b = thirdMax(a);
        System.out.println("Result: " + b);
    }
}

// Cách này lâu điên
// public static int thirdMax(int[] nums) {
// long m3 = Long.MIN_VALUE;
// long m2 = Long.MIN_VALUE;
// long m1 = Long.MIN_VALUE;
// int n = nums.length;

// for (int i = 0; i < nums.length - 1; i++) {
// int minIndex = i;
// for (int j = i + 1; j < nums.length; j++) {
// if (nums[j] > nums[minIndex]) {
// minIndex = j;
// }
// }
// int temp = nums[i];
// nums[i] = nums[minIndex];
// nums[minIndex] = temp;
// }

// System.out.println("nums: " + java.util.Arrays.toString(nums));

// for (int i = 0; i < n; i++) {
// m1 = Math.max(m1, nums[i]);
// if (nums[i] != m1) {
// m2 = Math.max(m2, nums[i]);
// if (nums[i] != m2) {
// m3 = Math.max(m3, nums[i]);
// }
// }
// }

// return m3 == Long.MIN_VALUE ? (int) m1 : (int) m3;

// }