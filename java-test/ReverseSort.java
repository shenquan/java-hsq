/**
 * Created by Administrator on 2015/11/7.
 */
public class ReverseSort {
    public void sort(int[] array) {
        System.out.println("原数组中的内容为:");
        showArray(array);
        System.out.println();
        int len = array.length;
        for (int i = 0; i < len / 2; i++) {
            int temp = array[i];
            array[i] = array[len - 1 - i];
            array[len - 1 - i] = temp;
        }
        showArray(array);

    }

    public void showArray(int[] array) {
        for (int i : array) {
            System.out.print("\t" + i);
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};
        ReverseSort arr = new ReverseSort();
        arr.sort(array);
    }
}
