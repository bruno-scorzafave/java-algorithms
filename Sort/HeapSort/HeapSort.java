package HeapSort;

import Heap.Heap;
import Utils.Utils;

public class HeapSort {
    public void heapSort(Heap heap) {
        for (int i = heap.size - 1; i >= 1; i--) {
            Utils.swap(heap.heap, 0, i);
            heap.size--;
            heap.heapify(0);
        }
    }
}
