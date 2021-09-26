public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        ;
        System.out.println(reverseArray(arr));
    }
    public static int[] reverseArray(int[] arr) {
        int[] newArr = new int[arr.length];

        for (int i = arr.length-1 ; i >= 0 ; i--) {
            newArr[0]= arr[i];
            System.out.println(arr[i]);

        }
        return newArr;
    }


}



