
import java.util.Scanner;

public class Q2_UserInput_LargestElementinArray {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        if (arr.length == 0) {
            System.out.println("Empty array");
            return;
        }
        
        System.out.print("Enter element of an array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest element is: " + largest);
        sc.close();
    }
    
}
