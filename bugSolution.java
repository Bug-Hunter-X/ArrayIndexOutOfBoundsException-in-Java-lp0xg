public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if (5 >= 0 && 5 < arr.length) {
            arr[4] = 10; // Corrected index
            System.out.println(arr[4]);
        } else {
            System.out.println("Index out of bounds");
        }
    }
}