package Heap;

public class MinHeap extends Heap {
    public MinHeap(int maxSize, int[] arr) {
        super(maxSize, arr);
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

    @Override
    public void insert(int value) {
        increaseHeapSize();
        heap[size - 1] = value;
        heapifyUp(size - 1);
    }

    @Override
    public void heapifyUp(int index) {
        int parentIndex = parent(index); // Get the parent index
        while (index > 0 && heap[index] < heap[parentIndex]) {
            // Swap the current node with its parent
            swap(index, parentIndex);
            // Move up to the parent
            index = parentIndex;
            parentIndex = parent(index);
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
