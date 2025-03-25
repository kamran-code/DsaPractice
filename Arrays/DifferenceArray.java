import java.util.Scanner;

public class DifferenceArray {
    public static void main(String args[]) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = obj.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array " + n + " element:");
        for (int i = 0; i < n; i++) {

            arr[i] = obj.nextInt();
        }
        int diff[] = new int[n + 1];

        System.out.println("Enter total number of queries:");
        int q = obj.nextInt();
        for (int i = 0; i < q; i++) {
            System.out.println("Enter left Index:");
            int l = obj.nextInt();
            System.out.println("Enter right Index:");
            int r = obj.nextInt();
            System.out.println("Enter value:");
            int val = obj.nextInt();
            
                diff[l]+=val;
                diff[r+1]-=val;
           
        }
        for (int i = 1; i <= n; i++) {
            diff[i]+=diff[i-1];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + diff[i]+" ");
        }
    }
}
