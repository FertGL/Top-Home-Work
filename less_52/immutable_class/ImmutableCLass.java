package less_52.immutable_class;

import java.util.List;
import java.util.Objects;

public final class ImmutableCLass {
    private final String name;
    private final List<Integer> names;
    private final CustomMutableClass mutableClass;

    public ImmutableCLass(String name, List<Integer> names, CustomMutableClass mutableClass) {
        this.name = name;
        this.names = names;
        this.mutableClass = new CustomMutableClass(mutableClass);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableCLass that = (ImmutableCLass) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(mutableClass, that.mutableClass) &&
                names.equals(that.names);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, names, mutableClass);
    }

    @Override
    public String toString() {
        return "ImmutableCLass{" +
                "name='" + name + '\'' +
                ", names=" + names +
                ", mutableClass=" + mutableClass +
                '}';
    }

    public String getName() {
        return name;
    }

    public List<Integer> getNames() {
        return names;
    }

    public CustomMutableClass getMutableClass() {
        return mutableClass;
    }
}
