import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int oddCount = 0, evenCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) evenCount++;
            else oddCount++;
        }

        int[] odd = new int[oddCount];
        int[] even = new int[evenCount];

        int o = 0, e = 0;
        for (int num : arr) {
            if (num % 2 == 0) even[e++] = num;
            else odd[o++] = num;
        }

        System.out.print("Even numbers: ");
        for (int num : even) System.out.print(num + " ");

        System.out.print("\nOdd numbers: ");
        for (int num : odd) System.out.print(num + " ");

        scanner.close();
    }
}
