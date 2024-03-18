package ch13.Exercise.exam03;

public class Container<T, V> {
    private T key;
    private V value;

    public T getKey() {
        return key;
    }

    public void set(T key, V value) {
        this.key = key;
        this.value = value;

    }

    public V getValue() {
        return value;
    }
}
