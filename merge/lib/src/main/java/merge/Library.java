/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package merge;

import java.util.Arrays;

public class Library {
    public static void main(String[] args) {


        Merge merge = new Merge();


        int [] array = {3,4,5,8,100,7,5,8,20,75,2,4};


        merge.sort(array);

        System.out.println(Arrays.toString(array));

    }
}

