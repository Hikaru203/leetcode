package Java.Sort;

public class InsertionSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n - 1; i++) {
            int ai = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > ai) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = ai;

            System.out.println("Pass " + (i + 1) + ": " + java.util.Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] a = { 5, 6, 7, 3, 23, 6, 7, 87, 33 };
        int[] b = { 6, 6, 5, 7, 65, 34, 4, 57, 68, 3 };
        InsertionSort.sort(b);
    }
}
