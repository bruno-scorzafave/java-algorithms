package Heap;

public abstract class Heap {
    protected int size;
    protected int[] heap;

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

    public abstract void heapify(int index);
}
