import java.util.Objects;

class MyMapNode<K, V> {
    private K key;
    private V value;
    private MyMapNode<K, V> next;

    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public K getKey() {
        return key;
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        MyMapNode<?, ?> myMapNode = (MyMapNode<?, ?>) o;
        return Objects.equals(key, myMapNode.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }

    @Override
    public String toString() {
        return key + ":" + value;
    }
}