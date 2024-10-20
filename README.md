# LinkedList-Queue
The implementation of a Linked List Queue involves using a linked list structure to manage the queue's elements. In a queue, elements follow a First-In-First-Out (FIFO) order, where elements are added at the rear (enqueue operation) and removed from the front (dequeue operation).

Key Components:
Node Class: Each element in the queue is represented by a node. A node typically contains two attributes:

Data: The value the node holds.
Next: A reference to the next node in the list.
Queue Class: The queue class manages the linked list and supports enqueue and dequeue operations. It maintains references to:

Front: The first node in the queue.
Rear: The last node in the queue.
Operations:
Enqueue (Add Element):

A new node is created and added to the rear of the queue.
If the queue is empty, both front and rear point to the new node.
Otherwise, the current rear node's next is updated to point to the new node, and rear is updated to reference the new node.
Dequeue (Remove Element):

The node at the front is removed.
The front reference is updated to point to the next node in the queue.
If the queue becomes empty after the operation (i.e., front is null), rear is also set to null.
Peek (Access Front Element without Removal):

Returns the value of the front node without modifying the queue.
IsEmpty (Check if Queue is Empty):

Returns true if front is null; otherwise, returns false.
