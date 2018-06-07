import java.util.Collection;
import java.util.Iterator;

/**
 * Beschreiben Sie hier die Klasse MinHeap.
 * 
 * @author Roland Daidone, Michael Linn
 * @version 0.1
 */
public class MinHeap<T> implements java.util.Queue<T>
{
    // Instanzvariablen
    private int a[];

    private int n;

     /**
     * Konstruktor für Objekte der Klasse MinHeap
     */
    public MinHeap(int size) {
        // Instanzvariable initialisieren
        a = new int[size];
        n = 0;
    }

    public void enqueue(int k) {
        // Wert in Array einfÃ¼gen
        a[n] = k;
        n++;

        // Heap-Eigenschaft wiederherstellen
        int i = n - 1;
        while (i > 0) {
            // Elternknoten bestimmen
            int p = (i - 1) / 2;

            // Heap-Eigenschaft verletzt?
            if (a[i] < a[p]) {
                swap(i, p);
                i = p;
            } else {
                break;
            }
        }
    }

    public int dequeue() {
        int result = a[0];

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
            if (a[r] < a[l]) {
                c = r;
            }

            // Heap-Eigenschaft verletzt?
            if (a[c] < a[i]) {
                swap(c, i);
                i = c;
            } else {
                break;
            }
        }

        return result;
    }

    private void swap(int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
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
        return new Object[0];
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

    @Override
    public boolean offer(T t) {
        return false;
    }

    @Override
    public T remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public T poll() {
        return null;
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
