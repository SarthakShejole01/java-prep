public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {5, 7, 3, 8, 4, 2, 8};
        int max = arr[0];
        int min = arr[0];
        for (int n : arr) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}