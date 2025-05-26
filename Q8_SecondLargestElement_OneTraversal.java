import java.util.*;

public class Q8_SecondLargestElement_OneTraversal {

    public static void getSecondLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array size can't be less than 2.");
        }

        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE , secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second Largest Element in an array.");
        }else{
            System.out.println("Second Largest Element = " + secondLargest);
        }
        
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("There is no second Smallest Element in an array.");
        }else{
            System.out.println("Second Largest Element = " + secondSmallest);
        }
    }


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Size: ");
    int size = sc.nextInt();

    int[] arr = new int[size];

    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    
    getSecondLargest(arr);
    }
}
