import java.util.Scanner;
import java.util.Arrays;

public class MergeArrays {
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }
        
        while (i < arr1.length) {
            result[k] = arr1[i];
            i++;
            k++;
        }
        
        while (j < arr2.length) {
            result[k] = arr2[j];
            j++;
            k++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter size of first sorted array: ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter sorted elements for first array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }
        
        System.out.print("Enter size of second sorted array: ");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter sorted elements for second array:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }
        
        int[] merged = mergeSortedArrays(arr1, arr2);
        System.out.println("Merged Sorted Array: " + Arrays.toString(merged));
        scanner.close();
    }
}