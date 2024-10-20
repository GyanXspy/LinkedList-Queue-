package assignment7.QLinkedList;

public class QueueLinkedList {
    Node front = null;
    Node rear = null;
    int size = 0;
    boolean isEmpty(){
        if(size == 0) return true;
        else return false;

    }
    void insert(int item){
        Node node = new Node();
        node.data = item;
        node.next = null;
        if (rear == null) {
            front = rear = node;
        }
        else{
            rear.next = node;
            rear = node;
        }
        size++;
    }
    void Delete(){
        if (isEmpty()) {
            System.out.println("Empty Node :");
            return;
        }
        int x = front.data;
        System.out.println("Removing element "+x);
        front = front.next;
        size -- ;

    }
    void Display(){
       Node temp = front;
        if (size == 0) {
            System.out.println("No element in Queue");
            return;
        }
        else{
            while (temp != null) {
                System.out.print(temp.data+"-->");
                temp = temp.next;
            }
        }
        System.out.println("null");
    }
}
