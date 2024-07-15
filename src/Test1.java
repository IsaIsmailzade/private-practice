public class Test1 {
    public static void main(String[] args) {
        System.out.println(getMinFromFour(5, 9, 2, 0));
    }

    public static int getMinFromTwo(int x, int y) {
        return Math.min(x, y);
    }

    public static int getMinFromFour(int x, int y, int m, int n) {
        return Math.min(getMinFromTwo(x, y), getMinFromTwo(m, n));
    }
}