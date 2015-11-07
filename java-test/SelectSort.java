/**
 * Created by Administrator on 2015/11/7.
 */
public class SelectSort {
    private void sort(int arr[]) {
        int temp;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        show(arr);
    }

    private void show(int arr[]) {
        for (int x : arr) {
            System.out.println(">" + x);
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 4, 24, 1, 3, 15,53,7};
        SelectSort sorter = new SelectSort();
        sorter.sort(array);

    }
}
