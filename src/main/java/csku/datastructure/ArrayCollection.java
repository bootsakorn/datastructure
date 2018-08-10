package csku.datastructure;

/**
 * Created by 708 on 8/10/2018.
 */
public class ArrayCollection implements Collection {
    private Object[] elementData;
    private int size;
    public ArrayCollection(int cap) {
        elementData = new Object[cap];
        size = cap;
    }
    public void add(Object element) {
        if(element == null) throw new IllegalArgumentException();
        elementData[size++] = element;
    }
    public void remove(Object element) {
        int i = indexOf(element);
        if (i != -1) {
            elementData[i] = elementData[--size];
            elementData[size] = null;
        }
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }
    public int size() {
        return size;
    }
    private int indexOf(Object e) {
        for (int i=0; i<size; i++)
            if (elementData[i].equals(e)) return i;
        return -1;
    }
}
