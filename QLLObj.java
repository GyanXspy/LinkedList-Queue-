package assignment7.QLinkedList;

public class QLLObj {
    public static void main(String[] args) {
        QueueLinkedList Q = new QueueLinkedList();
        Q.insert(5);
        Q.insert(7);
        Q.insert(1);
        Q.insert(5);
        Q.insert(9);
        Q.insert(6);
        Q.Display();
        Q.Delete();
        Q.Display();
    }
}
