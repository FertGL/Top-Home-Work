package less_52.Generics;

public class Box<T> {
    private T object;

    public void set(T obj) {
        this.object = obj;
    }

    public T get() {
        return this.object;
    }

    public void clear() {
        object = null;
    }

    public boolean isEmpty(){
        return object == null;
    }
}
