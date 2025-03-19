import java.util.Scanner;

public class MaxMinInArray {

    public static int max(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int min(int arr[]){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String args[]){

        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int arr [] = new int [n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        System.out.println("Maximum is "+max(arr));
        System.out.println("Minimum is "+min(arr));

        obj.close();
    }
    
}
