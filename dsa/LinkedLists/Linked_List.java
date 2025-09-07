public class Linked_List {
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        // If there is not any element in the list
        if (head == null) {
            head = node;
        } 
        
        // Otherwise we travel to the last node
        else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void delete(int number) {
        Node node = head;

        if (head == null) {
            System.out.println("There is no elements in the list");
        } else if (head.data == number && head.next == null) {
            head = null;
        }

        while (node.next.data != number) {
            node = node.next;
        }
        Node supp = node.next.next; 
        node.next = supp;

    }

    public void show() {
        Node node = head;

        while(node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

}
