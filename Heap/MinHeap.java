package Heap;

public class MinHeap extends Heap {
    public MinHeap(int maxSize, int[] arr) {
        this.size = maxSize;
        this.heap = arr;
    }

    @Override
    public void heapify(int index) {
        int left = leftChild(index);
        int right = rightChild(index);
        int smallest = index;

        if (left < size && heap[left] < heap[smallest]) {
            smallest = left;
        }

        if (right < size && heap[right] < heap[smallest]) {
            smallest = right;
        }

        if (smallest != index) {
            swap(index, smallest);
            heapify(smallest);
        }
    }

    public int minHeapMinimum() {
        return heap[0];
    }

    public int minHeapExtractMinimum() {
        int min = minHeapMinimum();
        
        heap[0] = heap[size - 1];
        decreaseHeapSize();
        heapify(0);

        return min;
    }
}
