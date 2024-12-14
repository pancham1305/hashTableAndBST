public class MyHashTable<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private MyLinkedList<K, V>[] bucketArray;
    private int size;

    @SuppressWarnings("unchecked")
    public MyHashTable() {
        bucketArray = new MyLinkedList[DEFAULT_CAPACITY];
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            bucketArray[i] = new MyLinkedList<>();
        }
        size = 0;
    }

    private int getBucketIndex(K key) {
        int hashCode = Math.abs(key.hashCode());
        return hashCode % bucketArray.length;
    }

    public void put(K key, V value) {

        int bucketIndex = getBucketIndex(key);

        MyLinkedList<K, V> linkedList = bucketArray[bucketIndex];

        if (linkedList.contains(key)) {
            V existingValue = linkedList.get(key);
            if (existingValue instanceof Integer) {

                @SuppressWarnings("unchecked")
                V newValue = (V) Integer.valueOf((Integer) existingValue + 1);
                linkedList.add(key, newValue);
            } else {

                linkedList.add(key, value);
            }
        } else {

            linkedList.add(key, value);
            size++;
        }
    }

    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        return bucketArray[bucketIndex].get(key);
    }

    public void printHashTable() {
        for (int i = 0; i < bucketArray.length; i++) {
            System.out.print("Bucket " + i + ": ");
            bucketArray[i].printList();
        }
    }
}