import static java.util.Arrays.binarySearch;

public class Test1 {
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;
    public static void main(String[] args) {
        int a = binarySearch(array, element);
        if (a >= 0) {
            System.out.println(true);
        } else System.out.println(false);
    }
}