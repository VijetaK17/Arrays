
import java.util.Scanner;

public class Q5_SecondLargestElement_sorting {

    public static int secondLargest(int[] arr){
        if (arr.length < 2){
            return -1;
        }

        // sorting in ascending order
        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        
        // finds second largest element
        for (int i = arr.length -2; i >= 0 ; i--) {
            if (arr[i] != arr.length-1){
                return arr[i];
            }
        }
        return 0;
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Second Largest Element: " + secondLargest(arr));
        sc.close();
    }
}