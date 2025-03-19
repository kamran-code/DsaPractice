import java.util.Scanner;

public class CheckArrayIsSorted {


    public static boolean isSorted(int arr[]) {

        int first = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(first>arr[i])
            {
                return false;
            }
            first=arr[i];
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        if(isSorted(arr))
        {
            System.out.println("Sorted");
        }
        else
        System.out.println("Not Sorted");
    }
}
