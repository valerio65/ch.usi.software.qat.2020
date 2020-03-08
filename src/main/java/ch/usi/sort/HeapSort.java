package ch.usi.sort;

public class HeapSort {

    /**
     * THE BUG IS IN THIS METHOD
     *
     * Can your tests find it?
     *
     * @param array
     *
     * ordered array
     *
     * (if you are interested on how HeapSort works
     * https://en.wikipedia.org/wiki/Heapsort)
     */
    public static void heapSort(int[] array) {
        if (array.length == 0) return;

        // Building the heap
        int length = array.length;
        // we're going from the first non-leaf to the root
        for (int i = length / 2-1; i >= 1; i--)
            heapify(array, length, i);

        for (int i = length-1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
    }


    /**
     * helper function
     *
     * @param array
     * @param length
     * @param i
     */
    private static void heapify(int[] array, int length, int i) {
        int leftChild = 2*i+1;
        int rightChild = 2*i+2;
        int largest = i;

        // if the left child is larger than parent
        if (leftChild < length && array[leftChild] > array[largest]) {
            largest = leftChild;
        }

        // if the right child is larger than parent
        if (rightChild < length && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        // if a swap needs to occur
        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            heapify(array, length, largest);
        }
    }


}
