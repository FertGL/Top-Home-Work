package less_52.immutable_class;

public class CustomMutableClass {
    public int value;

    public CustomMutableClass(int value) {
        this.value = value;
    }

    public CustomMutableClass(CustomMutableClass other) {
        this.value = other.value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "CustomMutableClass{" +
                "value=" + value +
                '}';
    }
}
