package HeapSort;

import Heap.Heap;

public class HeapSort {
    public void heapSort(Heap heap) {
        for (int i = heap.size - 1; i >= 1; i--) {
            swap(heap.heap, 0, i);
            heap.size--;
            heap.heapify(0);
        }
    }

    public void swap(int[] arr, int firstNode, int secondNode) {
        int tmp = arr[firstNode];
        arr[firstNode] = arr[secondNode];
        arr[secondNode] = tmp;
    }
}
