public class Main {
    public static void main(String[] args) {
        NewQueue queue = new NewQueue();
        
        queue.pushElement(10);
        queue.pushElement(20);
        queue.pushElement(30);
        queue.showQueue();
        System.out.println("\nSize:" + queue.sizeQueue());

        System.out.println("\nElement popped: " + queue.popElement());
        queue.showQueue();
        System.out.println("\nSize:" + queue.sizeQueue());
    }
    
}
