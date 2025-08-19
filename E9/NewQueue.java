import java.util.ArrayList;
import java.util.List;

public class NewQueue {
    private List<Integer> queue;

    public NewQueue() {
        queue = new ArrayList<>();
    }

    public void pushElement(Integer element) {
        queue.add(element);
    }

    public int popElement() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int aux = queue.get(0);
        queue.remove(0);
        return aux;
    }

    public int sizeQueue() {
        return queue.size();
    }

    public void showQueue() {
        for (Integer elem : queue) {
            System.out.print(elem + " ");
        }
    }
}
