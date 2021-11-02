/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package merge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    public void mergeSortTest2(){

        Merge merge = new Merge();


        int [] array = {3,4,5,8,100,7,5,8,20,75,2,4};

        merge.sort(array);
        assertEquals("[2, 3, 4, 4, 5, 5, 7, 8, 8, 20, 75, 100]", Arrays.toString(array));

    }
}