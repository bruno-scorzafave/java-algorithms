package Heap;

public abstract class Heap {
    public int size;
    public int[] heap;

    public Heap(int maxSize, int[] arr) {
        this.size = maxSize;
        this.heap = arr;

        buildHeap();
    }

    public void swap(int firstNode, int secondNode) {
        int tmp = heap[firstNode];
        heap[firstNode] = heap[secondNode];
        heap[secondNode] = tmp;
    }
    
    public int rightChild(int i) {
        return (2*i) + 2;
    }

    public int leftChild(int i) {
        return (2*i) + 1;
    }

    public int parent(int i) {
        return (i - 1)/2;
    }

    public void buildHeap() {
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(i);
        }
    }

    public void decreaseHeapSize() {
        size--;
        int[] newArray = new int[size];

        for (int i = 0; i < size; i++) {
            newArray[i] = heap[i];
        }

        heap = newArray;
    }

    public void increaseHeapSize() {
        size++;
        int[] newArray = new int[size];

        for (int i = 0; i < size - 1; i++) {
            newArray[i] = heap[i];
        }

        heap = newArray;
    }

    public abstract void heapifyUp(int index);

    public abstract void heapify(int index);

    public abstract void insert(int value);
}
