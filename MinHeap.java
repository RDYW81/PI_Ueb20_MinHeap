import java.util.Collection;
import java.util.Iterator;

/**
 * Beschreiben Sie hier die Klasse MinHeap.
 * 
 * @author Roland Daidone, Michael Linn
 * @version 0.3
 */
public class MinHeap<T extends Comparable<T>> implements java.util.Queue<T>
{
    // Instanzvariablen
    private Object[] array;

    private int n;
    private int s;
    
     /**
     * Konstruktor für Objekte der Klasse MinHeap
     */
    public MinHeap(int size) {
        // Instanzvariable initialisieren
        array = new Object[size];
        n = 0;
        this.s = size;
    }

    /**
     * Methode, die bei verletzter Heap-Eigenschaft aufgerufen wird und die Werte des MinHeaps umtauscht
     */
    private void swap(int i, int j) {
        Object t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    @Override
    public int size() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public boolean isEmpty() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object o) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Iterator<T> iterator() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Object[] toArray() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public boolean add(T t) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Fügt einen Wert vom Typ int in den MinHeap ein und berücksichtigt die MinHeap-Eigenschaften
     * 
     * @param k einzugebender Wert
     */
    @Override
    public boolean offer(T k) {
        // Wert in Array einfügen
        array[n] = k;
        n++;

        // Heap-Eigenschaft wiederherstellen
        int i = n - 1;
        while (i > 0) {
            // Elternknoten bestimmen
            int p = (i - 1) / 2;

            // Heap-Eigenschaft verletzt?
            if (((T) array[i]).compareTo((T) array[p]) < 0) {
                swap(i, p);
                i = p;
            } else {
                break;
            }
        }
        return true;
    }

    @Override
    public T remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Entfernt einen Wert vom Typ int in den MinHeap ein und stellt die MinHeap-Eigenschaften wieder her
     */
    @Override
    public T poll() {
        T result = (T) array[0];

        // Ersten Wert aus Array entfernen
        swap(0, n - 1);
        n--;

        // Heap-Eigenschaft wiederherstellen
        int i = 0;
        while (i < n / 2 - 2) {

            // Linker Kindknoten
            int l = 2 * i + 1;

            // Rechter Kindknoten
            int r = 2 * i + 2;

            // Kleinerer Kindknoten
            int c = l;
            if (((T) array[r]).compareTo((T) array[l]) < 0) {
                c = r;
            }

            // Heap-Eigenschaft verletzt?
            if (((T) array[c]).compareTo((T) array[i]) < 0) {
                swap(c, i);
                i = c;
            } else {
                break;
            }
        }

        return result;
    }

    @Override
    public T element() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public T peek() {
        return null;
    }
}
