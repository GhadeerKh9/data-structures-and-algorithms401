import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("hi");
        int ghadeer = 8;
        int[] ghadeer2 = { 0, 0, 2, 4, 5 };

        System.out.println(Arrays.toString(insertShiftArray(ghadeer2, ghadeer)));

    }

    public static int[] insertShiftArray(int[] arr, int n) {

        int newLength = arr.length + 1;
        int middleEntry = (newLength / 2);
        int[] newArr = new int[newLength];

        for (int i = 0; i < newLength; i++) {

            if (i < middleEntry) {
                newArr[i] = arr[i];

            } else if (i == middleEntry) {
                newArr[i] = n;
            } else {
                newArr[i] = arr[i - 1];
            }

        }
        return newArr;
    }
}
