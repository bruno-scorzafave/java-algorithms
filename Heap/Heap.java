package Heap;

public abstract class Heap {
    protected int size;
    public int[] heap;

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

    public void buildHeap() {
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(i);
        }
    }

    public abstract void heapify(int index);
}
