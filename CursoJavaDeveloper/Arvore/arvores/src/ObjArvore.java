public abstract class ObjArvore<T> implements Comparable<T>{

    public abstract boolean equals(Object O );
    public abstract int hashCode();
    public abstract int compareTo(T outro);
    public abstract String toString();

    
}