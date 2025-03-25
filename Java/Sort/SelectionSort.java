package Java.Sort;

public class SelectionSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            System.out.println("Pass " + (i + 1) + ": " + java.util.Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] a = { 5, 6, 7, 3, 23, 6, 7, 87, 33 };
        int[] b = { 6, 6, 5, 7, 65, 34, 4, 57, 68, 3 };
        SelectionSort bs = new SelectionSort();
        bs.sort(a);
        bs.sort(b);
    }
}
