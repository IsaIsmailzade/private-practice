public class Test1 {
    public static void main(String[] args) {
        int[] testArray = {5, 7, 3, 7, 2};
        fillArrayAndPrint(testArray);
    }

    static void fillArrayAndPrint(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * i;
        }
    }
}