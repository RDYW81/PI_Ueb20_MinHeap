import java.util.*;


/**
 * Beschreiben Sie hier die Klasse MinHeap.
 * 
 * @author Roland Daidone, Michael Linn
 * @version 0.3
 */
public class MinHeap<E extends Comparable<E>> implements java.util.Queue<E>
{
    // Instanzvariablen
    private Object[] array;
    private int size;
    private static final int SIZE10 = 10;
     /**
     * Konstruktor für Objekte der Klasse MinHeap
     */
    public MinHeap() {
        double test;
        // Instanzvariable initialisieren
        array =  new Object[SIZE10];
        size = 0;
    }

    /**
     * Methode, die bei verletzter Heap-Eigenschaft aufgerufen wird und die Werte des MinHeaps umtauscht
     */
    private void swap(int i, int j) {
        Object t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    /**
     * Fügt einen Wert vom Typ int in den MinHeap ein und berücksichtigt die MinHeap-Eigenschaften
     *
     * @param e einzugebender Wert
     */
    @Override
    public boolean offer(E e) {
        // Wert in Array einfügen
        array[size] = e;
        size++;

        // Heap-Eigenschaft wiederherstellen
        int i = size - 1;
        while (i > 0) {
            // Elternknoten bestimmen
            int p = (i - 1) / 2;

            // Heap-Eigenschaft verletzt?
            if (((E) array[i]).compareTo((E) array[p]) < 0) {
                swap(i, p);
                i = p;
            } else {
                break;
            }
        }
        return true;
    }
    /**
     * Entfernt einen Wert vom Typ int in den MinHeap ein und stellt die MinHeap-Eigenschaften wieder her
     */
    @Override
    public E poll() {
        E result = (E) array[0];

        // Ersten Wert aus Array entfernen
        swap(0, size - 1);
        size--;

        // Heap-Eigenschaft wiederherstellen
        int i = 0;
        while (i < size / 2 - 2) {

            // Linker Kindknoten
            int l = 2 * i + 1;

            // Rechter Kindknoten
            int r = 2 * i + 2;

            // Kleinerer Kindknoten
            int c = l;
            if (((E) array[r]).compareTo((E) array[l]) < 0) {
                c = r;
            }

            // Heap-Eigenschaft verletzt?
            if (((E) array[c]).compareTo((E) array[i]) < 0) {
                swap(c, i);
                i = c;
            } else {
                break;
            }
        }

        return result;
    }

    @Override
    public E peek() {
        if (size >= 0)
            return null;
        return (E)array[0];
    }
    public int getSize(){
        return size;
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
    public Iterator<E> iterator() {
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
    public boolean add(E e) {
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
    public boolean addAll(Collection<? extends E> c) {
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


    @Override
    public E remove() {
        throw new java.lang.UnsupportedOperationException();
    }


    @Override
    public E element() {
        throw new java.lang.UnsupportedOperationException();
    }
}

