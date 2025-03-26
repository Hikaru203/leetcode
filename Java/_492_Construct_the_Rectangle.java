package Java;

public class _492_Construct_the_Rectangle {

    public int[] constructRectangle(int area) {
        int l = 0;
        int w = 0;
        for (l = (int) Math.sqrt(area); l > 0; l--) {
            if (area % l == 0) {
                w = area / l;
                break;
            }
        }
        return new int[] { w, l };
    }

    public static void main(String[] args) {

    }

}
