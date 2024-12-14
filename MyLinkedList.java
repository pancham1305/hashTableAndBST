class MyLinkedList<K, V> {
    private MyMapNode<K, V> head;

    public void add(K key, V value) {

        if (head == null) {
            head = new MyMapNode<>(key, value);
            return;
        }

        MyMapNode<K, V> current = head;
        MyMapNode<K, V> prev = null;

        while (current != null) {

            if (current.getKey().equals(key)) {
                current.setValue(value);
                return;
            }

            prev = current;
            current = current.getNext();
        }

        prev.setNext(new MyMapNode<>(key, value));
    }

    public boolean remove(K key) {

        if (head == null) {
            return false;
        }

        if (head.getKey().equals(key)) {
            head = head.getNext();
            return true;
        }

        MyMapNode<K, V> current = head;
        MyMapNode<K, V> prev = null;

        while (current != null) {
            if (current.getKey().equals(key)) {

                prev.setNext(current.getNext());
                return true;
            }
            prev = current;
            current = current.getNext();
        }

        return false;
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