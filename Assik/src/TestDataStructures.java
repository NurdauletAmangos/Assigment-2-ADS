public class TestDataStructures {
    public static void main(String[] args) {
        System.out.println("Testing MyArrayList:");
        testMyArrayList();

        System.out.println("\nTesting MyLinkedList:");
        testMyLinkedList();

        System.out.println("\nTesting MyStack:");
        testMyStack();

        System.out.println("\nTesting MyQueue:");
        testMyQueue();

        System.out.println("\nTesting MyMinHeap:");
        testMyMinHeap();
    }

    private static void testMyArrayList() {
        MyArrayList<Integer> list = new MyArrayList<>();

        // Add elements
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println("After adding 10 elements, size: " + list.size());

        // Get elements
        System.out.println("Element at index 5: " + list.get(5));

        // Remove elements
        list.remove(0);
        System.out.println("After removing first element, size: " + list.size());
    }

    private static void testMyLinkedList() {
        MyLinkedList<String> list = new MyLinkedList<>();

        // Add elements
        list.add("First");
        list.add("Second");
        list.addFirst("New First");
        list.addLast("Last");

        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        // Remove elements
        list.removeFirst();
        System.out.println("After removing first, new first: " + list.getFirst());
    }

    private static void testMyStack() {
        MyStack<Double> stack = new MyStack<>();

        // Push elements
        stack.push(3.14);
        stack.push(2.71);
        stack.push(1.61);

        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element: " + stack.peek());

        // Pop elements
        System.out.println("Popped: " + stack.pop());
        System.out.println("Now top element: " + stack.peek());
    }

    private static void testMyQueue() {
        MyQueue<Character> queue = new MyQueue<>();

        // Enqueue elements
        queue.enqueue('A');
        queue.enqueue('B');
        queue.enqueue('C');

        System.out.println("Queue size: " + queue.size());
        System.out.println("Front element: " + queue.peek());

        // Dequeue elements
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Now front element: " + queue.peek());
    }

    private static void testMyMinHeap() {
        MyMinHeap<Integer> heap = new MyMinHeap<>();

        // Insert elements
        heap.insert(5);
        heap.insert(3);
        heap.insert(7);
        heap.insert(1);

        System.out.println("Heap size: " + heap.size());
        System.out.println("Min element: " + heap.getMin());

        // Extract elements
        System.out.println("Extracted min: " + heap.extractMin());
        System.out.println("New min: " + heap.getMin());
    }
}