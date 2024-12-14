import java.util.Objects;

public class MyLinkedList<K, V> {
    private MyMapNode<K, V> head;

    public void add(K key, V value) {

        if (head == null) {
            head = new MyMapNode<>(key, value);
            return;
        }

        MyMapNode<K, V> current = head;
        while (current != null) {

            if (current.getKey().equals(key)) {
                current.setValue(value);
                return;
            }

            if (current.getNext() == null)
                break;
            current = current.getNext();
        }

        current.setNext(new MyMapNode<>(key, value));
    }

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

    public boolean contains(K key) {
        MyMapNode<K, V> current = head;
        while (current != null) {
            if (current.getKey().equals(key)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public void printList() {
        MyMapNode<K, V> current = head;
        while (current != null) {
            System.out.print(current + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
