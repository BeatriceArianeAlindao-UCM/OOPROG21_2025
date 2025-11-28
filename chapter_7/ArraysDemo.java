import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        int[] arr = new int[5];

        display("Original array:", arr);

        Arrays.fill(arr, 8);
        display("After filling with 8s:", arr);

        arr[2] = 6;
        arr[4] = 3;
        display("After changing two values:", arr);

        Arrays.sort(arr);
        display("After sorting:", arr);
    }

    public static void display(String message, int array[]) {
        System.out.print(message + " ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
