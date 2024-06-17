import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] array = new int[]{3, 6, 9, 3, 8, 2};

        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
