import java.util.*;

public class Q6_SecondLargest_UsingSortingOptimised {

    public static int getSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }

        Arrays.sort(arr);

        int largest = arr[arr.length - 1];
        for (int i = arr.length-2; i >= 0; i--) {
            if (arr[i] != largest) {
                return arr[i];
            }
        }
        return 0; // Returns -1 when there is no second largest element present
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter Element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int result = getSecondLargest(arr);
        if (result == 0) {
            System.out.println("There is no second largest element present in an array.");
        }else
            System.out.println("Second Largest Element = " + result);
    }
    
}
