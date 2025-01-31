package Heap;

public class MaxHeap {
    private int size;
    private int[] maxHeap;

    public MaxHeap(int maxSize, int[] arr) {
        this.size = maxSize;
        this.maxHeap = new int[this.size];
        this.maxHeap = arr;
    }

    public void maxHeapify(int index) {
        int left = leftChild(index);
        int right = rightChild(index);
        int largest = index;

        if (left < size && maxHeap[left] > maxHeap[largest]) {
            largest = left;
        }

        if (right < size && maxHeap[right] > maxHeap[largest]) {
            largest = right;
        }

        if (largest != index) {
            swap(index, largest);
            maxHeapify(largest);
        }
    }

    public void swap(int firstNode, int secondNode) {
        int tmp = maxHeap[firstNode];
        maxHeap[firstNode] = maxHeap[secondNode];
        maxHeap[secondNode] = tmp;
    }

    public void buildMaxHeap() {
        for (int i = size / 2 - 1; i >= 0; i--) {
            maxHeapify(i);
        }
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < size; i++) {
            str += maxHeap[i] +" ";
        }
        return str;
    }

    public int rightChild(int i) {
        return (2*i) + 2;
    }

    public int leftChild(int i) {
        return (2*i) + 1;
    }
}
