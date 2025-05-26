import java.util.Scanner;

public class Q10_FindIndexOfElement {

    public static int findIndex(int[] numbers,int target){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int size = sc.nextInt();
        int index;

        int[] numbers = new int[size];

        System.out.print("Enter Elements: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter Target Element: ");
        int target = sc.nextInt();

        index = findIndex(numbers, target);

        if (index != -1){
            System.out.println("Index of " + target + " is " + index);
        }else{
            System.out.println("Element not found.");
        }
    }
}
