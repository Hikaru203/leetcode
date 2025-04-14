package Java.Sort;

// dùng thư viện nha
import java.util.Arrays;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

public class _912_Sort_an_Array {
    // public int[] mergeSort(int[] nums, int left, int right) {
    // if (left > right) {
    // return new int[] {};
    // } else if (left == right) {
    // int[] temp = { nums[left] };
    // return temp;
    // }

    // int k = (left + right) / 2;
    // int[] a1 = mergeSort(nums, left, k);
    // int[] a2 = mergeSort(nums, k + 1, right);

    // // trộn vào
    // int n = a1.length + a2.length;
    // int[] result = new int[n];

    // int i = 0;
    // int j = 0;
    // int k1 = 0;
    // while (i < a1.length && j < a2.length) {
    // if (a1[i] < a2[j]) {
    // result[k1++] = a1[i++];
    // } else {
    // result[k1++] = a2[j++];
    // }
    // }
    // while (i < a1.length) {
    // result[k1++] = a1[i++];
    // }
    // while (j < a2.length) {
    // result[k1++] = a2[j++];
    // }

    // return result;
    // }

    // public int[] sortArray(int[] nums) {
    // return mergeSort(nums, 0, nums.length - 1);
    // }

    // code này có dùng thư viện
    // public static class SortingTask extends RecursiveTask<int[]> {

    // private final int[] arr;

    // public SortingTask(int[] arr) {
    // this.arr = arr;
    // }

    // @Override
    // protected int[] compute() {
    // if (arr.length <= 1) {
    // return arr;
    // }

    // int mid = arr.length / 2;

    // SortingTask leftTask = new SortingTask(Arrays.copyOfRange(arr, 0, mid));
    // SortingTask rightTask = new SortingTask(Arrays.copyOfRange(arr, mid,
    // arr.length));

    // leftTask.fork();
    // int[] rightResult = rightTask.compute();
    // int[] leftResult = leftTask.join();

    // return merge(leftResult, rightResult);
    // }

    // private int[] merge(int[] arr1, int[] arr2) {
    // int[] result = new int[arr1.length + arr2.length];
    // int i = 0, j = 0, k = 0;

    // while (i < arr1.length && j < arr2.length) {
    // if (arr1[i] <= arr2[j]) {
    // result[k++] = arr1[i++];
    // } else {
    // result[k++] = arr2[j++];
    // }
    // }

    // while (i < arr1.length)
    // result[k++] = arr1[i++];
    // while (j < arr2.length)
    // result[k++] = arr2[j++];

    // return result;
    // }
    // }

    // public int[] sortArray(int[] nums) {
    // ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
    // return forkJoinPool.invoke(new SortingTask(nums));
    // }

    // Dùng sort array của java
    public int[] sortArray(int[] nums) {
        return Arrays.stream(nums).sorted().toArray();
    }

    public static void main(String[] args) {
        int[] nums = { 5, 2, 3, 1 };

        int[] result = new _912_Sort_an_Array().sortArray(nums);
        System.out.println("Result: " + java.util.Arrays.toString(result));
    }
}
