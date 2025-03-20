package Java.Array;

import java.util.Arrays;

public class _88_Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int i = m - 1; // giá tri cuối cung cua nums1
        // int j = n - 1; // giá tri cuối cung cua nums2
        // int k = m + n - 1; // giá tri cuối cung cua nums1

        // while (i >= 0 && j >= 0) {
        // if (nums1[i] > nums2[j]) {
        // nums1[k] = nums1[i];
        // i--;
        // } else {
        // nums1[k] = nums2[j];
        // j--;
        // }
        // k--;
        // }

        // while (j >= 0) {
        // nums1[k] = nums2[j];
        // j--;
        // k--;
        // }

        // Chậm hơn 1 tí so với cách trên
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);

    }

    public static void main(String[] args) {
        int[] nums1 = { 0 };
        int[] nums2 = { 1 };
        new _88_Merge_Sorted_Array().merge(nums1, 0, nums2, 1);

        for (int i : nums1) {
            System.out.println(i);
        }

    }
}
