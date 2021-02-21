package advanced.generics.generic_interface;

public interface Comparable<T> {
    //deklaruojam metodą generic (prie klasės pavadinimo prirašom <>) interface
    int compareTo(T object);
    //kuriamas metodas getObject
    T getObject();
}
