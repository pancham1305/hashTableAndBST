import java.util.Objects;

// Custom LinkedList implementation for MyMapNode
class MyLinkedList<K, V> {
    private MyMapNode<K, V> head;
    private MyMapNode<K, V> tail;

    // Add a new node to the LinkedList
    public void add(K key, V value) {
        MyMapNode<K, V> newNode = new MyMapNode<>(key, value);

        // If list is empty
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        // Check if key already exists
        MyMapNode<K, V> current = head;
        while (current != null) {
            if (current.getKey().equals(key)) {
                // Update value if key exists
                current.setValue(value);
                return;
            }
            if (current.getNext() == null)
                break;
            current = current.getNext();
        }

        // Append new node
        current.setNext(newNode);
        tail = newNode;
    }

    // Get value for a given key
    public V get(K key) {
        MyMapNode<K, V> current = head;
        while (current != null) {
            if (current.getKey().equals(key)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }

    // Print all nodes in the list
    public void printList() {
        MyMapNode<K, V> current = head;
        while (current != null) {
            System.out.print(current + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
