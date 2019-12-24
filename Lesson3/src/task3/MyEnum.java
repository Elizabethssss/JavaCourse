package task3;

public class MyEnum<T extends MyEnum<T>> implements Comparable<T> {
    private int ordinal;
    private String name;

    public int getOrdinal() {
        return ordinal;
    }

    public String getName() {
        return name;
    }

    public MyEnum(int ordinal, String name) {
        this.ordinal = ordinal;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public final boolean equals(Object o) {
        return this == o;
    }

    @Override
    public final int hashCode() {
        return ordinal;
    }

    @Override
    public int compareTo(T o) {
        return ordinal - o.getOrdinal();
    }
}
