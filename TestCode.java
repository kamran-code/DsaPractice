import java.util.ArrayList;
import java.util.Scanner;
class TestCode {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();       

        for (int i = 0; i < 5; i++) {
           
          arr.add(sc.nextInt());
        }
       
        System.out.println("Elements in array are: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(arr.get(i));
        }
        

        sc.close();
    }
}