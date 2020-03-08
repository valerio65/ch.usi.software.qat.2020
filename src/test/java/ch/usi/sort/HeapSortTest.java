package ch.usi.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class HeapSortTest {

    @Test
    public void test1(){
        int[] array = new int[]{9,8};
        HeapSort.heapSort(array);
        // you have to use Arrays.equals to check if two arrays are the same
        assertTrue(Arrays.equals(new int[]{8,9},array));
    }

}