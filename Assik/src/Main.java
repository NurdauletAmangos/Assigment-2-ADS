public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyArrayList<>();
        list.add(10);
        list.add(20);
        System.out.println(list.get(1)); // 20

        MyStack<String> stack = new MyStack<>();
        stack.push("Hello");
        stack.push("World");
        System.out.println(stack.pop()); // World
    }
}