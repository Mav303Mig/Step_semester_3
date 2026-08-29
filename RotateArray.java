import java.util.Scanner;
import java.util.Arrays;

public class RotateArray {
    public static int[] rotateArray(int[] nums, int k) {
        if (nums.length == 0) {
            return nums;
        }
        
        k = k % nums.length;
        int[] newArray = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            int newPos = (i + k) % nums.length;
            newArray[newPos] = nums[i];
        }
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = newArray[i];
        }
        
        return nums;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] nums = new int[size];
        
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        
        System.out.print("Enter positions to rotate (k): ");
        int k = scanner.nextInt();
        
        int[] rotated = rotateArray(nums, k);
        System.out.println("Rotated Array: " + Arrays.toString(rotated));
        scanner.close();
    }
}