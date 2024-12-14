import java.util.Objects;

// MyMapNode class representing a key-value pair for word frequency
class MyMapNode<K, V> {
    private K key;
    private V value;
    private MyMapNode<K, V> next;

    // Constructor
    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    // Getters and Setters
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public MyMapNode<K, V> getNext() {
        return next;
    }

    public void setNext(MyMapNode<K, V> next) {
        this.next = next;
    }

    // Equals and HashCode for proper comparison
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        MyMapNode<?, ?> myMapNode = (MyMapNode<?, ?>) o;
        return Objects.equals(key, myMapNode.key) &&
                Objects.equals(value, myMapNode.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        return "(" + key + ":" + value + ")";
    }
}