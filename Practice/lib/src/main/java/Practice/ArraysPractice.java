package Practice;

import org.checkerframework.checker.units.qual.A;

import java.util.*;

public class ArraysPractice {

    //    QUESTION 3 – LOGIC 2
    public static void countCharacters(String string) {
        int lettersCounter = 0;
        int numbersCounter = 0;
        int charactersCounter = 0;
        for (int i = 0; i < string.length(); i++) {
            char singleCharacter = string.charAt(i);
            if ((singleCharacter >= 65 && singleCharacter <= 90) || (singleCharacter >= 97 && singleCharacter <= 122)) {
                lettersCounter++;
            } else if (singleCharacter >= 48 && singleCharacter <= 57) {

                numbersCounter++;
            } else {
                charactersCounter++;
            }


        }
        System.out.println("Letters =>" + lettersCounter + "\n" + "Numbers =>" + numbersCounter + "\n" + "Special Characters (including spaces) =>" + charactersCounter);
        System.out.println(string.length());

    }


//    QUESTION 2 – LOGIC 1

    public static void printCustomization(String[] stringsArr) {
        List newList = new ArrayList();

        for (int i = 0; i < stringsArr.length; i++) {
            char firstCharacter = stringsArr[i].charAt(0);
            if (firstCharacter == 'A' || firstCharacter == 'E' || firstCharacter == 'I' || firstCharacter == 'O' || firstCharacter == 'U') {
                newList.add(stringsArr[i]);
            }
        }
        System.out.println(newList.toString());

    }

    public static void printNamesLongerThanFive(String[] stringsArr) {
        List newList = new ArrayList();

        for (int i = 0; i < stringsArr.length; i++) {
            int productElement = stringsArr[i].length();
            if (productElement > 5) {
                newList.add(stringsArr[i]);
            }
        }
        System.out.println(newList.toString());

    }


    //Intersection of Two ArraysPractice II
    public static ArrayList arraysIntersection(int[] arr1, int[] arr2) {

        ArrayList newList = new ArrayList();
        Hashtable hashtable = new Hashtable();

        for (int i = 0; i < arr1.length; i++) {


            hashtable.put(arr1[i], 1);

        }
        for (int i = 0; i < arr2.length; i++) {


            if (hashtable.containsKey(arr2[i])) {


                newList.add(arr2[i]);

            }


        }
        return newList;
    }


    // move zeros
    //  int [] arr3 = {1,0,3,0,0,4};


    public static int[] moveZeros(int[] arr) {
        int x = arr.length;

        for (int i = 0; i < x - 1; i++) {

            if (arr[i] == 0) {
                for (int j = i; j < arr.length - 1; j++) {


                    arr[j] = arr[j + 1];

                }

               i--;
                x--;
                arr[arr.length-1] = 0;
            }
        }
        return arr;
    }

    //missingNumber
    // [0,1] , output ==> 2
    public static int missingNumber(int[] arr) {

        int num = -1;
        int max = arr[0];
//        int min = arr[0];


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }

            for (int j = 0; j < max; j++) {
                if (arr[j] != j) {
                    num = j;
                }

            }

        }
        return num;
    }

    //arr = [2,3,4,3,5,3], 3
    public static int [] removeElement(int[] arr, int k) {

        int count = 0;  // Count of non-zero elements


        for (int i = 0; i < k; i++) {
            if (arr[i] != 0) {

                arr[count++] = arr[i];

            }
        }


        // Now all non-zero elements have been shifted to
        // front and  'count' is set as index of first 0.
        // Make all elements 0 from count to end.
        while (count < k) {
            arr[count++] = 0;
        }
        return arr;
    }
/// [6, 2, 3, 4,2]
//////////////////////////////////////////////////////////////////////////////////////////
    public static int indexOfRepeatedIntegerIndex(int arr []){

        HashSet<Integer> hashtable = new HashSet<Integer>();

         int count = -1;
        for(int i =arr.length-1; i >=0; i-- ){

            if(hashtable.contains(arr[i])){

                count = i;

            }else{
                hashtable.add(arr[i]);

            }



        }

        return count;

    }
    public static int [] twoSum(int arr [], int target){
//    public static ArrayList twoSum(int arr [], int target){

        HashMap<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
       int [] arr2 = new int[2];
//        ArrayList<Integer> arr2 = new ArrayList<>();

      for(int i = 0; i < arr.length; i++){
          if(hashtable.containsKey(target-arr[i])){
              arr2[0] = hashtable.get(target-arr[i]);
              arr2[1] = i;
//              arr2.add(hashtable.get(target-arr[i]));
//              arr2.add(i);



          }
          else{
              hashtable.put(arr[i], i);

          }
      }

        return arr2;

    }

    public static void repeatedIntegerswith(int [] arr){
        HashMap<Integer, Integer> hashtable = new HashMap<Integer, Integer>();


        for(int i=0; i< arr.length; i++){

       if(hashtable.get(arr[i]) != null){
      hashtable.put(arr[i], hashtable.get(arr[i])+1);
       }else{
           hashtable.put(arr[i], 1);
       }

        }
        for (int name: hashtable.keySet()) {
            int key = name;
            String value = hashtable.get(name).toString();
            System.out.println(key + " " + value);
        }
    }


    public static int searchInsert(int[] nums, int target) {



        for(int i =0; i < nums.length; i++){

            // if(target == ) {
            //     return i
            // }
            if(nums[i] == target){
                return i;

            }
            else if( target > nums[i-1]  && target < nums[i]){
                return i +1;

            }



        }
        return 0 ;
    }

///    sum between smallest and largest integers in an array
    //  input [0,5,6,3,9,1,4,15] Output = 119

    public static int sumBetweenLargestAndSmallest (int [] arr){
        int max = arr[0];
        int min = arr[0];
        for (int i =0; i < arr.length; i++){
            if(arr[i] > max){
               max = arr[i];
            }else if (arr[i] < min){
                min = arr[i];
            };
        };

        int sum = 0;
     for(int i = min; i <= max; i++){
       sum = sum + i;
     };
        return sum;
    };


}
