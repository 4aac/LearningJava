public class Main {
    public static void main(String[] args) {
    Linked_List l_list = new Linked_List();

    l_list.insert(10);
    l_list.insert(11);
    l_list.insert(12);

    l_list.show();

    l_list.delete(11);

    System.out.println("----------------------");
    
    l_list.show();
    }    
    
}
