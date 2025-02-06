package Heap;

public class MaxHeap extends Heap {
    public MaxHeap(int maxSize, int[] arr) {
        super(maxSize, arr);
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

    @Override
    public void insert(int value) {
        increaseHeapSize();
        heap[size - 1] = value;
        heapifyUp(size - 1);
    }

    @Override
    public void heapifyUp(int index) {
        int parentIndex = parent(index); // Get the parent index
        while (index > 0 && heap[index] > heap[parentIndex]) {
            // Swap the current node with its parent
            swap(index, parentIndex);
            // Move up to the parent
            index = parentIndex;
            parentIndex = parent(index);
        }
    }

    public int maxHeapMaximum() {
        return heap[0];
    }

    public int maxHeapExtractMax() {
        int max = maxHeapMaximum();
        
        heap[0] = heap[size - 1];
        decreaseHeapSize();
        heapify(0);

        return max;
    }
}
