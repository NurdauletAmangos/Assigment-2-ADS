public class MyMinHeap<T extends Comparable<T>> {
    private MyArrayList<T> list;

    public MyMinHeap() {
        this.list = new MyArrayList<>();
    }

    public void insert(T item) {
        list.add(item);
        heapifyUp(list.size() - 1);
    }

    public T extractMin() {
        if (isEmpty()) throw new RuntimeException("Heap is empty");

        T min = list.get(0);
        T last = list.get(list.size() - 1);
        list.set(0, last);
        list.removeLast();

        if (!isEmpty()) {
            heapifyDown(0);
        }

        return min;
    }

    public T getMin() {
        if (isEmpty()) throw new RuntimeException("Heap is empty");
        return list.get(0);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }

    public void clear() {
        list.clear();
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (list.get(index).compareTo(list.get(parentIndex)) >= 0) {
                break;
            }
            swap(index, parentIndex);
            index = parentIndex;
        }
    }

    private void heapifyDown(int index) {
        int leftChild, rightChild, smallestChild;

        while (true) {
            leftChild = 2 * index + 1;
            rightChild = 2 * index + 2;
            smallestChild = index;

            if (leftChild < list.size() &&
                    list.get(leftChild).compareTo(list.get(smallestChild)) < 0) {
                smallestChild = leftChild;
            }

            if (rightChild < list.size() &&
                    list.get(rightChild).compareTo(list.get(smallestChild)) < 0) {
                smallestChild = rightChild;
            }

            if (smallestChild == index) {
                break;
            }

            swap(index, smallestChild);
            index = smallestChild;
        }
    }

    private void swap(int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}