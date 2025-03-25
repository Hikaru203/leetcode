package Java.Sort;

public class BubbleSort {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSorted = false;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("Pass " + (i + 1) + ": " + java.util.Arrays.toString(arr));
            if (isSorted) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 5, 6, 7, 3, 23, 6, 7, 87, 33 };
        int[] b = { 6, 6, 5, 7, 65, 34, 4, 57, 68, 3 };
        BubbleSort bs = new BubbleSort();
        bs.sort(a);
        bs.sort(b);
    }

}
