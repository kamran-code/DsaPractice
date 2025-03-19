public class InsertElementInArray {

    public static void main(String args[]) {

        int arr[] = { 2, 3, 4, 5, 6 };
        int value = 7;
        int position = 6;

        int arrNew[] = new int[arr.length + 1];
        int j = 0;
        for (int i = 0; i < arrNew.length; i++) {
            if (i == position - 1) {
                arrNew[i] = value;
            } else {
                arrNew[i] = arr[j];
                j++;
            }
        }
        for (int i = 0; i < arrNew.length; i++) {

            System.out.println(arrNew[i]);
        }
    }
}
