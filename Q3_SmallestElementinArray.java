public class Q3_SmallestElementinArray {
    @SuppressWarnings("UnnecessaryReturnStatement")
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 5, 6};

        if (arr.length == 0) {
            System.out.println("Empty array.");
            return;
        }

        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest Element = " + smallest);
    }
}
