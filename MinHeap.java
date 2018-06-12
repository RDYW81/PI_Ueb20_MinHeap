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
    private static final int S_ZEHN = 10;
     /**
     * Konstruktor für Objekte der Klasse MinHeap
     */
    public MinHeap() {
        double test;
        // Instanzvariable initialisieren
        array =  new Object[S_ZEHN];
        size = 0;
    }

    /**
     * Methode, die bei verletzter Heap-Eigenschaft aufgerufen wird und die Werte des MinHeaps umtauscht
     */
    private void swap(int index, int j) {
        Object temp = array[index];
        array[index] = array[j];
        array[j] = temp;
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
        int index = size - 1;
        while (index > 0) {
            // Elternknoten bestimmen
            int pos = (index - 1) / 2;

            // Heap-Eigenschaft verletzt?
            if (((E) array[index]).compareTo((E) array[pos]) < 0) {
                swap(index, pos);
                index = pos;
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
       // swap(0, size - 1);
        size--;
        if ( array[0] != null){
            for (int i = 0 ; i<array.length-1; i++){
                array[i] = array[i+1];
            }
            array[array.length-1] = null;
        }
        // Heap-Eigenschaft wiederherstellen
        int index = 0;
        while (index < size / 2 - 2) {

            // Linker Kindknoten
            int left = 2 * index + 1;

            // Rechter Kindknoten
            int right = 2 * index + 2;

            // Kleinerer Kindknoten
            int c = left;
            if (((E) array[right]).compareTo((E) array[left]) < 0) {
                c = right;
            }

            // Heap-Eigenschaft verletzt?
            if (((E) array[c]).compareTo((E) array[index]) < 0) {
                swap(c, index);
                index = c;
            } else {
                break;
            }
        }

        return result;
    }

    @Override
    public E peek() {
        if (size <= 0)
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

