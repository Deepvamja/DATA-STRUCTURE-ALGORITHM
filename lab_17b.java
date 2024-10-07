import java.util.LinkedList;

class Dictionary<K, V> {
    private static class HashNode<K, V> {
        K key;
        V value;

        HashNode(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<HashNode<K, V>>[] table;
    private int size;
    private static final int INITIAL_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    public Dictionary() {
        table = new LinkedList[INITIAL_CAPACITY];
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            table[i] = new LinkedList<>();
        }
        size = 0;
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % table.length;
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        LinkedList<HashNode<K, V>> bucket = table[index];

        for (HashNode<K, V> node : bucket) {
            if (node.key.equals(key)) {
                node.value = value; 
                return;
            }
        }
        bucket.add(new HashNode<>(key, value)); 
        size++;
    }

    public V get(K key) {
        int index = getIndex(key);
        LinkedList<HashNode<K, V>> bucket = table[index];

        for (HashNode<K, V> node : bucket) {
            if (node.key.equals(key)) {
                return node.value; 
            }
        }
        return null; 
    }

    public void remove(K key) {
        int index = getIndex(key);
        LinkedList<HashNode<K, V>> bucket = table[index];

        for (HashNode<K, V> node : bucket) {
            if (node.key.equals(key)) {
                bucket.remove(node); 
                size--;
                return;
            }
        }
    }

    public int size() {
        return size;
    }

    public boolean containsKey(K key) {
        return get(key) != null;
    }
    
    public void display() {
        for (int i = 0; i < table.length; i++) {
            System.out.print("Bucket " + i + ": ");
            for (HashNode<K, V> node : table[i]) {
                System.out.print("[" + node.key + " : " + node.value + "] ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Dictionary<String, Integer> dictionary = new Dictionary<>();
        
        dictionary.put("Apple", 1);
        dictionary.put("Banana", 2);
        dictionary.put("Cherry", 3);
        
        System.out.println("Value for 'Apple': " + dictionary.get("Apple"));
        System.out.println("Size of dictionary: " + dictionary.size());
        
        dictionary.display();

        dictionary.remove("Banana");
        System.out.println("After removing 'Banana':");
        dictionary.display();
    }
}
