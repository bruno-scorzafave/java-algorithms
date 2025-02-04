package Heap;

public class MaxHeap extends Heap {
    public MaxHeap(int maxSize, int[] arr) {
        this.size = maxSize;
        this.heap = arr;
    }

    @Override
    public void heapify(int index) {
        int left = leftChild(index);
        int right = rightChild(index);
        int largest = index;

        if (left < size && heap[left] > heap[largest]) {
            largest = left;
        }

        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }

        if (largest != index) {
            swap(index, largest);
            heapify(largest);
        }
    }
}
