import java.util.Scanner;

public class ArrayTest {

    public static boolean isPresent(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String arg[]) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        int target = obj.nextInt();
        if(isPresent(arr,target))
            System.out.print("Presnt");
        else
            System.out.print("Absent");

    }
}
