import java.util.Scanner;
import java.util.ArrayList;

public class MaxConsecutiveOnes {

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int numRows = obj.nextInt();
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();

        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(1);
        answer.add(new ArrayList<>(temp));
        for (int i = 1; i < numRows; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(1);
            if (i >= 2) {
                for (int j = 1; j <= i - 1; j++) {
                    arr.add(answer.get(i - 1).get(j - 1) + answer.get(i - 1).get(j));
                }
            }
            arr.add(1);
            answer.add(new ArrayList<>(arr));
        }
        for(int i =0;i<numRows;i++){

            System.out.println(answer.get(i));
        }

        obj.close();
    }
}
// 1
// 1 1
// 1 2 1
// 1 3 3 1