package Java.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

class _27_Remove_Element {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 2;

        int result = new _27_Remove_Element().removeElement(nums, val);
        System.out.println("Result: " + result);
    }
}