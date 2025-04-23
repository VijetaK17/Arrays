public class Q1_LargestElementInArray {

    public static void main(String[] args) {
        int arr[] = {3, 7, 9, 1, 8};

        if (arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }
        
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest Element in an array is " + largest);
    }
}