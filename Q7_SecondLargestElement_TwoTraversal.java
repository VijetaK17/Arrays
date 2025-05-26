
import java.util.Scanner;

public class Q7_SecondLargestElement_TwoTraversal {

    public static int getSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return  -1;
        }

        int largest = 0, secondLargest = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> largest) {
                largest = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int result = getSecondLargest(arr);
        if (result == 0) {
            System.out.println("There is no second Largest Element in an array.");
        }else{
            System.out.println("Second Largest Element = " + result);
        }
    }
}